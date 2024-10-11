#include <iostream>

int main() {
    std::cout << " x   |   y" << std::endl;
    std::cout << "--------------" << std::endl;

    for (int x = -12; x <= 16; ++x) {
        int y = x - x - x + x + x - x - x;
        std::cout << " " << x << "  |  " << y << std::endl;
    }

    return 0;
}
