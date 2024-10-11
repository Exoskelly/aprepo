#include <iostream>
#include <string>

int countOccurrences(const std::string& source, const std::string& target) {
    int count = 0;
    size_t pos = source.find(target);

    while (pos != std::string::npos) {
        count++;
        pos = source.find(target, pos + 1); 
    }

    return count;
}

int main() {
    std::string source;
    std::string target;

    std::cout << "Enter the source string (DNA sequence): ";
    std::getline(std::cin, source);

    std::cout << "Enter the target sequence to count: ";
    std::getline(std::cin, target);

    int occurrences = countOccurrences(source, target);
    std::cout << "The target sequence \"" << target << "\" appears " << occurrences << " times in the source string." << std::endl;

    return 0;
}
