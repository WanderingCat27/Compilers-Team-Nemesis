import java.util.*;
public class SimpleProgram {
static Scanner ___protected___in___ = new Scanner(System.in);
public static void main(String[] args) throws Exception {
double PI=3.141592653589793;
String name="";
int r_str=3;
name=___protected___in___.nextLine();
r_str=___protected___in___.nextInt();
double circumference=2.0 * PI * r_str;
double area=PI * r_str * r_str;
System.out.print("Hello, ");
System.out.print(name);
System.out.println();
System.out.print("circumference = ");
System.out.print(circumference);
System.out.println();
System.out.print("area = ");
System.out.print(area);
System.out.println();
}
}
