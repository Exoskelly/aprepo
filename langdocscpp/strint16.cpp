#include <iostream>
#include <string>

bool containsSubstring(const std::string& str, const std::string& substring) {
    int strLength = str.length();
    int subLength = substring.length();

    for (int i = 0; i <= strLength - subLength; ++i) {
        int j;
        for (j = 0; j < subLength; ++j) {
            if (str[i + j] != substring[j]) {
                break;
            }
        }
        if (j == subLength) {
            return true; 
        }
    }
    return false; 
}

int main() {
    std::string str1, str2;

    std::cout << "Enter the first string: ";
    std::getline(std::cin, str1);

    std::cout << "Enter the second string: ";
    std::getline(std::cin, str2);

    if (containsSubstring(str1, str2)) {
        std::cout << "\"" << str2 << "\" is contained within \"" << str1 << "\"." << std::endl;
    } else {
        std::cout << "\"" << str2 << "\" is not contained within \"" << str1 << "\"." << std::endl;
    }

    return 0;
}
