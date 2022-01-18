package acmicpc;

import java.util.ArrayList;
import java.util.List;

public class N2581 {
    public static ArrayList<Integer> function(List<Integer> inputs) {
        int intM = inputs.get(0);
        int intN = inputs.get(1);
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = intM; i <= intN; i++) {
            if (isPrime(i)) lists.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (lists.size() > 0) {
            result.add(lists.stream().mapToInt(e -> e).sum());
            result.add(lists.get(0));
        } else {
            result.add(-1);
        }
        return result;
    }

    public static boolean isPrime(int value) {
        if (value == 1) return false;
        for (int i = value - 1; i > 1; i--) {
            if (value % i == 0) return false;
        }
        return true;
    }
}
