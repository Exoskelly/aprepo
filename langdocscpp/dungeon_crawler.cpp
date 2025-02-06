//run using "g++ -o langdocscpp/dungeon_crawler.exe langdocscpp/dungeon_crawler.cpp && ./langdocscpp/dungeon_crawler.exe" 

#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

using namespace std;

const char PLAYER = 'P';
const char WALL = '#';
const char EMPTY = '.';
const char EXIT = 'E';
const char ENEMY = 'X';
const char TREASURE = '$';

struct Enemy {
    int x, y;
};

vector<Enemy> enemies;

void generateDungeon(vector<vector<char>>& dungeon, int width, int height, int& playerX, int& playerY, int& score) {
    srand(static_cast<unsigned>(time(0)));

    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            if (x == 0 || x == width - 1 || y == 0 || y == height - 1) {
                dungeon[y][x] = WALL;
            } else if (rand() % 8 == 0) {
                dungeon[y][x] = WALL;
            } else {
                dungeon[y][x] = EMPTY;
            }
        }
    }

    do {
        playerX = rand() % (width - 2) + 1;
        playerY = rand() % (height - 2) + 1;
    } while (dungeon[playerY][playerX] != EMPTY);
    dungeon[playerY][playerX] = PLAYER;

    int exitX, exitY;
    do {
        exitX = rand() % (width - 2) + 1;
        exitY = rand() % (height - 2) + 1;
    } while (dungeon[exitY][exitX] != EMPTY);
    dungeon[exitY][exitX] = EXIT;

    for (int i = 0; i < 5; i++) {
        int tx, ty;
        do {
            tx = rand() % (width - 2) + 1;
            ty = rand() % (height - 2) + 1;
        } while (dungeon[ty][tx] != EMPTY);
        dungeon[ty][tx] = TREASURE;
    }

    for (int i = 0; i < 5; i++) {
        int ex, ey;
        do {
            ex = rand() % (width - 2) + 1;
            ey = rand() % (height - 2) + 1;
        } while (dungeon[ey][ex] != EMPTY);
        dungeon[ey][ex] = ENEMY;
        enemies.push_back({ex, ey});
    }
}

void drawDungeon(const vector<vector<char>>& dungeon, int score) {
    system("cls"); 
    for (const auto& row : dungeon) {
        for (char cell : row) {
            cout << cell << ' ';
        }
        cout << endl;
    }
    cout << "Score: " << score << endl;
}

void movePlayer(vector<vector<char>>& dungeon, int& playerX, int& playerY, int dx, int dy, int& score) {
    int newX = playerX + dx;
    int newY = playerY + dy;

    if (newX >= 0 && newX < dungeon[0].size() && newY >= 0 && newY < dungeon.size() && dungeon[newY][newX] != WALL) {
        if (dungeon[newY][newX] == TREASURE) {
            score += 3;
        }
        dungeon[playerY][playerX] = EMPTY;
        playerX = newX;
        playerY = newY;
        dungeon[playerY][playerX] = PLAYER;
    }
    drawDungeon(dungeon, score);
}

void moveEnemies(vector<vector<char>>& dungeon, int playerX, int playerY) {
    for (auto& enemy : enemies) {
        int dx = (playerX > enemy.x) ? 1 : (playerX < enemy.x) ? -1 : 0;
        int dy = (playerY > enemy.y) ? 1 : (playerY < enemy.y) ? -1 : 0;

        int newX = enemy.x + dx;
        int newY = enemy.y + dy;

        if (newX >= 0 && newX < dungeon[0].size() && newY >= 0 && newY < dungeon.size() && dungeon[newY][newX] == EMPTY) {
            dungeon[enemy.y][enemy.x] = EMPTY;
            enemy.x = newX;
            enemy.y = newY;
            dungeon[enemy.y][enemy.x] = ENEMY;
        }
    }
}

int main() {
    int width, height;
    cout << "Enter Width: ";
    cin >> width;
    cout << "Enter Height: ";
    cin >> height;

    vector<vector<char>> dungeon(height, vector<char>(width));
    int playerX, playerY, score = 0;

    generateDungeon(dungeon, width, height, playerX, playerY, score);
    bool gameRunning = true;
    drawDungeon(dungeon, score);

    while (gameRunning) {
        char input;
        cin >> input;

        if (dungeon[playerY][playerX] == EXIT) {
            cout << "You've reached the exit! You win! Your Score was" + score << endl;
            gameRunning = false;
            break;
        }

        switch (input) {
            case 'w': movePlayer(dungeon, playerX, playerY, 0, -1, score); break;
            case 's': movePlayer(dungeon, playerX, playerY, 0, 1, score); break;
            case 'a': movePlayer(dungeon, playerX, playerY, -1, 0, score); break;
            case 'd': movePlayer(dungeon, playerX, playerY, 1, 0, score); break;
        }

        moveEnemies(dungeon, playerX, playerY);
    }
    return 0;
}
