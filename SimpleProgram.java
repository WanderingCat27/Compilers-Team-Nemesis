import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
ArrayList<Integer> x= new ArrayList<Integer>();
Collections.addAll(x, new Integer[]{1,2,3,4,5,6,7,8,9,10});
System.out.println(x);
System.out.println("Enter a number to remove");
int y=0;
y=in.nextInt();
x.remove(y-1);
System.out.println(x);
int i=1;
if(y % 2>0)
{
System.out.println("Adding back the array...");
x.add(y);
System.out.println(x);
}
else
{
System.out.println("CLearing the array...");
x.clear();
System.out.println(x);
}
System.out.println("Enter a number to add into the array 3 times");
int j=0;
j=in.nextInt();
for (int ____protected_index____1 = 0; ____protected_index____1 < 3; ____protected_index____1++) {
x.add(j);
System.out.println(x);
}
}
}
