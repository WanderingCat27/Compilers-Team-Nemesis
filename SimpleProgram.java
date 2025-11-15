import java.util.*;
public class SimpleProgram {
static Scanner ___protected___in___ = new Scanner(System.in);
public static double sqrt_newton(double x, int iterations) {
if(x<=0)
{
return 0.0;
}
double g=x;
int i=0;
while(i<iterations) {
g=0.5 * (g + (x / g));
i=i + 1;
}
return g;
}
public static void main(String[] args) throws Exception {
int k=0;
double x=0.0;
double y=0.0;
double distance=0.0;
System.out.print("input two points:");
System.out.println();
x=___protected___in___.nextDouble();
y=___protected___in___.nextDouble();
System.out.print("input the number of iterations:");
System.out.println();
k=___protected___in___.nextInt();
distance=sqrt_newton((x * x) + (y * y),k);
System.out.print("the distance is:");
System.out.println();
System.out.print(distance);
System.out.println();
}
}
