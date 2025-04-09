public boolean isAisleSeat(int row, int seatNumber) {
    return seatNumber == 0 || seatNumber == seatspr - 1;
}
public boolean twoTogether() {
    for (int row = 0; row < numr; row++) {
        for (int col = 0; col < seatspr - 1; col++) {
            if (seats[row][col] == 0 && seats[row][col + 1] == 0) {
                seats[row][col] = 1;
                seats[row][col + 1] = 1;
                return true;
            }
        }
    }
    return false;
}
public int findAdjacent(int row, int seatsNeeded) {
    for (int col = 0; col <= seatspr - seatsNeeded; col++) {
        boolean allEmpty = true;
        for (int i = 0; i < seatsNeeded; i++) {
            if (seats[row][col + i] != 0) {
                allEmpty = false;
                break;
            } 
        }
        if (allEmpty) {
            return col;
        }
    }
    return -1;
}
