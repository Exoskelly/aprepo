#include <iostream>
#include <string>
#include <map>

int romanToArabic(const std::string& roman) {
    std::map<char, int> romanMap = {
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}
    };

    int total = 0;
    int prevValue = 0;

    for (char ch : roman) {
        int currentValue = romanMap[ch];
        if (currentValue > prevValue) {
            total += currentValue - 2 * prevValue; 
        } else {
            total += currentValue;
        }
        prevValue = currentValue;
    }

    return total;
}

int main() {
    std::string roman;

    std::cout << "Enter a Roman numeral (I, V, X, L, C, D, M): ";
    std::getline(std::cin, roman);

    int arabicValue = romanToArabic(roman);
    std::cout << "The Arabic value of " << roman << " is: " << arabicValue << std::endl;

    return 0;
}
