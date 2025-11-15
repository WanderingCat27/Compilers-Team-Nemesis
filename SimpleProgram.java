import java.util.*;

public class SimpleProgram {
    static Scanner ___protected___in___ = new Scanner(System.in);

    public static ArrayList<Double> merge_sort(ArrayList<Double> A, int size) {
        int sorted_right_length = 0;
        if (size <= 1) {
            return A;
        }
        int mid = size / 2;
        ArrayList<Double> left = new ArrayList<Double>();
        Collections.addAll(left, new Double[] { 0.0 });
        ArrayList<Double> right = new ArrayList<Double>();
        Collections.addAll(right, new Double[] { 0.0 });
        left.clear();
        right.clear();
        int i = 1;
        for (int ____protected_index____1 = 0; ____protected_index____1 < mid; ____protected_index____1++) {
            double v = A.get(i - 1);
            left.add(v);
            i = i + 1;
        }
        int j = mid + 1;
        int k = size - mid;
        for (int ____protected_index____1 = 0; ____protected_index____1 < k; ____protected_index____1++) {
            double v_two = A.get(j - 1);
            right.add(v_two);
            j = j + 1;
        }
        ArrayList<Double> sorted_left = new ArrayList<Double>();
        Collections.addAll(sorted_left, new Double[] { 0.0 });
        sorted_left.clear();
        sorted_left = merge_sort(left, size / 2);
        ArrayList<Double> sorted_right = new ArrayList<Double>();
        Collections.addAll(sorted_right, new Double[] { 0.0 });
        sorted_right.clear();
        sorted_right = merge_sort(right, size / 2);
        ArrayList<Double> result = new ArrayList<Double>();
        Collections.addAll(result, new Double[] { 0.0 });
        result.clear();
        while (0 == 0) {
            sorted_right_length = sorted_right.size();
            int ls = 0;
            for (int ____protected_index____2 = 0; ____protected_index____2 < sorted_right_length; ____protected_index____2++) {
                ls = ls + 1;
            }
            int rs = 0;
            for (int ____protected_index____2 = 0; ____protected_index____2 < sorted_right_length; ____protected_index____2++) {
                rs = rs + 1;
            }
            if (ls == 0) {
                for (int ____protected_index____3 = 0; ____protected_index____3 < sorted_right_length; ____protected_index____3++) {
                    double rv = sorted_right.get(0);
                    result.add(rv);
                    sorted_right.remove(0);
                }
                return result;
            }
            if (rs == 0) {
                sorted_right_length = sorted_right.size();
                for (int ____protected_index____3 = 0; ____protected_index____3 < sorted_right_length; ____protected_index____3++) {
                    double lv = sorted_left.get(0);
                    result.add(lv);
                    sorted_left.remove(0);
                }
                return result;
            }
            double lv_two = sorted_left.get(0);
            double rv_two = sorted_right.get(0);
            if (lv_two <= rv_two) {
                result.add(lv_two);
                sorted_left.remove(0);
            } else if (lv_two <= rv_two) {
                result.add(rv_two);
                sorted_right.remove(0);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.print("input number floats to read: ");
        System.out.println();
        n = ___protected___in___.nextInt();
        ArrayList<Double> listA = new ArrayList<Double>();
        Collections.addAll(listA, new Double[] { 0.0 });
        listA.clear();
        System.out.print("input floats: ");
        System.out.println();
        for (int ____protected_index____1 = 0; ____protected_index____1 < n; ____protected_index____1++) {
            double in = 0.0;
            in = ___protected___in___.nextDouble();
            listA.add(in);
        }
        ArrayList<Double> S = new ArrayList<Double>();
        Collections.addAll(S, new Double[] { 0.0 });
        S.clear();
        S = merge_sort(listA, n);
        int k = 1;
        int S_length = 0;
        S_length = S.size();
        for (int ____protected_index____1 = 0; ____protected_index____1 < S_length; ____protected_index____1++) {
            double val = S.get(k - 1);
            System.out.print(val);
            System.out.println();
            k = k + 1;
        }
    }
}
