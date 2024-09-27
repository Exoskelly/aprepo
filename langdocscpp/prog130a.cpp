#include <iostream>
using namespace std;

int main() {
    int n, steps = 0;

    cout << "Hailstone\n";
    cout << "This program computes Hailstone sequences.\n";
    cout << "Enter a number: ";
    cin >> n;

    while (n != 1) {
        if (n % 2 == 0) {
            cout << n << " is even, so I take half = ";
            n /= 2;
        } else {
            cout << n << " is odd, so I make 3n+1 = ";
            n = 3 * n + 1;
        }
        cout << n << endl;
        steps++;
    }

    cout << "The process took " << steps << " steps to reach 1.\n";

    return 0;
}