#include <iostream>
#include <cmath>

using namespace std;

int eulerTotient(int n) { 
    int result = n; 
    for (int p = 2; p * p <= n; ++p) {
        if (n % p == 0) {
            while (n % p == 0) {
                n /= p;
            }
            result -= result / p;
        }
    }
    if (n > 1) {
        result -= result / n;
    }
    return result;
}
int main() {
    int n;
    cout << "Enter a number to compute its Euler's Totient Function: ";
    cin >> n;
    cout << "φ(" << n << ") = " << eulerTotient(n) << endl;
    return 0;
}