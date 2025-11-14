import java.util.*;
public class SimpleProgram {
static Scanner ___protected___in___ = new Scanner(System.in);
public static void main(String[] args) throws Exception {
int n=0;
System.out.print("input number floats to read: ");
System.out.println();
n=___protected___in___.nextInt();
ArrayList<Double> listA= new ArrayList<Double>();
Collections.addAll(listA, new Double[]{0.0});
ArrayList<Double> listB= new ArrayList<Double>();
Collections.addAll(listB, new Double[]{0.0});
listA.clear();
listB.clear();
double mean=0.0;
System.out.print("input number floats: ");
System.out.println();
for (int ____protected_index____1 = 0; ____protected_index____1 < n; ____protected_index____1++) {
double in=0.0;
in=___protected___in___.nextDouble();
listA.add(in);
mean=mean + in;
}
mean=mean / n;
int i=1;
for (int ____protected_index____1 = 0; ____protected_index____1 < n; ____protected_index____1++) {
double value=listA.get(i-1);
value=value - mean;
listB.add(value);
i=i + 1;
}
System.out.print("---");
System.out.println();
i=1;
for (int ____protected_index____1 = 0; ____protected_index____1 < n; ____protected_index____1++) {
double v=listB.get(i-1);
System.out.print(v);
System.out.println();
i=i + 1;
}
System.out.print("");
System.out.println();
System.out.print("mean: ");
System.out.print(mean);
System.out.println();
System.out.print("list A: ");
System.out.print(listA);
System.out.println();
System.out.print("list B: ");
System.out.print(listB);
System.out.println();
}
}
