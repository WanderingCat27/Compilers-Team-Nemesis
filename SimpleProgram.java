import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
int i=0;
for (int ____protected_index____1 = 0; ____protected_index____1 < 10; ____protected_index____1++) {
i=i + 1;
System.out.println(i);
}
=======
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
>>>>>>> 5cc0a5f3e48bc8b2fb3929fbca959062f109079d
=======
int i=1;
ArrayList<String> list= new ArrayList<String>();
Collections.addAll(list, new String[]{"a","b","c"});
String a=list.get(0);
>>>>>>> 8978dd62bb41855f487cc5a109d96948a28905be
}
}
