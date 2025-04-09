public void updateLocation(int newRow, int newCol) {
    loc = new Location(newRow, newCol);
}
public void sortAllRows() {
    for (int row = 0; row < NUM_ROWS; row++) {
        sort(contestants[row]);
    }
}
public String findWinnerName() {
    sortAllRows();
    Contestant winner = contestants[0][CONTESTANTS_PER_ROW - 1];
    for (int row = 1; row < NUM_ROWS; row++) {
        Contestant c = contestants[row][CONTESTANTS_PER_ROW - 1];
        if (c.getScore() > winner.getScore()) {
            winner = c;
        }
    }
    return winner.getName();
}
