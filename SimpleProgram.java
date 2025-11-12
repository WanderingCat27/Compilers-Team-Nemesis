import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
System.out.println("test");
ArrayList<Integer> list= new ArrayList<Integer>();
Collections.addAll(list, new Integer[]{1,2,3,4,5});
list.add(5);
int index_one=list.get(0);
System.out.println("index 1: ");
System.out.println(index_one);
list.remove(0);
System.out.println("\nremoved item at index 1 (arrays are indexed starting at 1 not 0)");
System.out.println(list);
System.out.println("\nclearing list");
list.clear();
System.out.println(list);
}
}
