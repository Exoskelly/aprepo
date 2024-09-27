# include <iostream>
# include <math.h>

int main() {
  int num1, num2, num3, num4;
  printf("Enter num 1: "); scanf("%d", num1);
  printf("Enter num 2: "); scanf("%d", num2);
  printf("Enter num 3: "); scanf("%d", num3);
  printf("Enter num 4: "); scanf("%d", num4);
  
  int sum = num1 + num2 + num3 + num4;
  int dif = num1 - num2 - num3 - num4;
  int div = num1 / num2 / num3 / num4;
  int pro = num1 * num2 * num3 * num4;

  printf("Sum is " + sum);
  printf("Difference is " + dif);
  printf("Div is " + div); 
  printf("Pro is " + pro); 
}