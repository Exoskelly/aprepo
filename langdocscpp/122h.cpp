#include <iostream>
#include <iomanip>
#include <cmath>

int main() {
    std::cout << std::setw(6) << "N" 
              << std::setw(10) << "Square" 
              << std::setw(15) << "Square Root" 
              << std::setw(10) << "Cube" 
              << std::setw(15) << "Fourth Root" 
              << std::endl;

    std::cout << "---------------------------------------------------------------" << std::endl;

    for (int i = 1; i <= 20; ++i) {
        int square = i * i;
        double squareRoot = sqrt(i);
        int cube = i * i * i;
        double fourthRoot = pow(i, 1.0 / 4);

        std::cout << std::setw(6) << i 
                  << std::setw(10) << square 
                  << std::setw(15) << std::fixed << std::setprecision(4) << squareRoot
                  << std::setw(10) << cube 
                  << std::setw(15) << std::fixed << std::setprecision(4) << fourthRoot
                  << std::endl;
    }

    return 0;
}
