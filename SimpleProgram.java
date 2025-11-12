import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
ArrayList<Integer> x= new ArrayList<Integer>();
Collections.addAll(x, new Integer[]{1,2,3});
System.out.println(x);
int i=1;
System.out.println("Enter number to replace 3 with");
y=in.nextInt();
x.remove(2);
System.out.println(x);
x.add(y);
}
}
