#include <iostream>
#include <string>
#include <algorithm>

int main() {
    std:: string word;
    std::cout << "Enter a lowercase word: ";
    std::cin >> word; 

    std::string reversed_word = word;
    std::reverse(reversed_word.begin(), reversed_word.end());

    if (word == reversed_word) {
        std::cout << word << " is a palindrome.";
    } 
    else {
        std::cout << word << " is not a palindrome.";
    }
}