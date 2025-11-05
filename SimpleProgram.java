import java.util.*;

public class SimpleProgram {
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.println("int");
    int y = 2;
    System.out.println(y);
    System.out.println("\ndouble");
    double x = 2.0;
    System.out.println(x);
    System.out.println("\nstring");
    String z = "hello world";
    System.out.println(z);
    System.out.println("\nlist");
    ArrayList<String> la = new ArrayList<String>();
    Collections.addAll(la, new String[] { "a", "b", "c" });
    ArrayList<Integer> lb = new ArrayList<Integer>();
    Collections.addAll(lb, new Integer[] { 1, 2, 3 });
    ArrayList<Double> lc = new ArrayList<Double>();
    Collections.addAll(lc, new Double[] { 1.1, 2.2, 3.3 });
    System.out.println(la);
    System.out.println(lb);
    System.out.println(lc);
  }
}
