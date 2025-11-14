import java.util.*;
public class SimpleProgram {
<<<<<<< HEAD
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
double PI=3.141592653589793;
System.out.println(PI);
String name="hi";
name=in.nextLine();
System.out.println("hello");
=======
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
>>>>>>> e294f6c5a7bd067e4ba50168b012b74ccc312fd1
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
