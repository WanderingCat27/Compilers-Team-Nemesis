import java.util.*;
public class SimpleProgram {
static Scanner ___protected___in___ = new Scanner(System.in);
public static void sqrt_newton(double x, int iterations) {
double distance=0.0;
double y=0.0;
for (int ____protected_index____1 = 0; ____protected_index____1 < iterations; ____protected_index____1++) {
System.out.print("input an end point");
System.out.println();
y=___protected___in___.nextDouble();
distance=(x * x) + (y * y);
distance=Math.sqrt(distance);
System.out.print("distance:");
System.out.println();
System.out.print(distance);
System.out.println();
}
}
public static void main(String[] args) throws Exception {
int k=0;
double x=0.0;
System.out.print("input a starting point: ");
System.out.println();
x=___protected___in___.nextDouble();
System.out.print("input the number of iterations");
System.out.println();
k=___protected___in___.nextInt();
sqrt_newton(x,k);
}
}
