#include <cstdlib>
#include <iostream>
#include <string>
#include <vector>
#include <sstream>

int main() {
    int time1;
    int time2;
    printf("Enter Military Time 1: "); scanf("%d", &time1);
    printf("Enter Military Time 2: "); scanf("%d", &time2);

    int dif = abs(time1-time2);
    int hours = dif / 100;
    int mins = (dif - hours * 100) % 60;

    std::cout << "There are " << hours << " hours, and " << mins << " minutes.";
}