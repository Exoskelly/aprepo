#include <iostream>

int main() {

    double R1, R2, R3, V;

    std::cout << "Enter the resistance of R1 (in ohms): ";
    std::cin >> R1;
    std::cout << "Enter the resistance of R2 (in ohms): ";
    std::cin >> R2;
    std::cout << "Enter the resistance of R3 (in ohms): ";
    std::cin >> R3;
    std::cout << "Enter the voltage (in volts): ";
    std::cin >> V;

    double I1 = V / R1;
    double I2 = V / R2;
    double I3 = V / R3;
    double Itotal = I1 + I2 + I3;
    double R_parallel = V / Itotal;
    std::cout << "The total parallel resistance is: " << R_parallel << " ohms" << std::endl;

    return 0;
}
