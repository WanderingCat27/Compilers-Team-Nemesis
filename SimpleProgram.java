import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
int x=0;
System.out.println("input number x: ");
x=in.nextInt();
ArrayList<Integer> y= new ArrayList<Integer>();
Collections.addAll(y, new Integer[]{1,2,3,4,5,6,7,8,9,10});
if(x<10)
{
System.out.println("x is less than 10");
System.out.println(y);
int a=y.get(x-1);
System.out.println(a);
y.remove(x-1);
System.out.println(y);
}
}
}
