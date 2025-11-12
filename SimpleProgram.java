import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
int i=1;
ArrayList<String> list= new ArrayList<String>();
Collections.addAll(list, new String[]{"a","b","c"});
System.out.println(list);
String d="d";
System.out.println("replace index 1 with 'd'");
list.set(i-1, d);
System.out.println(list);
String a=list.get(0);
System.out.println("index 1 of list: ");
System.out.println(a);
System.out.println("adding '1' to list");
list.add("1");
System.out.println(list);
System.out.println("removing index 2");
list.remove(1);
System.out.println(list);
System.out.println("\n");
System.out.println("Clearing list");
list.clear();
System.out.println(list);
}
}
