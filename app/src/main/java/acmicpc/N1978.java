package acmicpc;

import java.util.List;

public class N1978 implements Problem<List<Integer>, Integer> {

    @Override
    public Integer function(List<Integer> input) {
        int count = 0;
        for (Integer i : input) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    private static boolean isPrime(int target) {
        if (target == 1) return false;
        for (int i = target - 1; i > 1 ; i--) {
            if (target % i == 0) return false;
        }
        return true;
    }
}
