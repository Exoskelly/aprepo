#include <cstdlib>
#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include <math.h>

int main() {

    int b, c;
    double a;

    printf("Enter hypotenuse: "); scanf("%d", &c);
    printf("Enter opposite: "); scanf("%d", &b);

    a = sqrt(pow(c, 2) - pow(b, 2));

    printf("The adjacent is " + a + ".");
}
