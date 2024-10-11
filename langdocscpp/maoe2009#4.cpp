#include <iostream>
#include <cmath>

double f(double x) {
    static const double pi = atan(1.0) * 4.0;
    return exp(-x * x / 2) / sqrt(2 * pi);
}

double riemannSum(double a, double b, int n) {
    double h = (b - a) / n; 
    double area = 0.0;

    for (int i = 0; i < n; ++i) {
        double x = a + i * h; 
        area += f(x) * h; 
    }

    return area;
}

int main() {
    double a, b;
    int n;

    std::cout << "Enter the lower bound (a): ";
    std::cin >> a;

    std::cout << "Enter the upper bound (b): ";
    std::cin >> b;

    std::cout << "Enter the number of panels (n): ";
    std::cin >> n;

    double area = riemannSum(a, b, n);
    std::cout << "Approximate area under the curve from " << a << " to " << b << " is: " << area << std::endl;

    return 0;
}
