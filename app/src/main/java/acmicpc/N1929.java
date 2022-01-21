package acmicpc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class N1929 implements Problem<List<Long>, List<Long>> {
    @Override
    public List<Long> function(List<Long> input) {
        List<Integer> result = new ArrayList<>();

        int intM = input.get(0).intValue();
        int intN = input.get(1).intValue();

        LinkedList<Integer> lists = IntStream.rangeClosed(intM, intN).collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

        for (int i = 0; i < lists.size();) {
            if (isPrime(lists.get(i))) {
                result.add(lists.get(i));
                eratostenes(lists, i);
            } else {
                i++;
            }
        }
        return result.stream().mapToLong(Integer::longValue).collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
    }

    public static void eratostenes(LinkedList<Integer> lists, int idx) {
        int wantDelete = lists.get(idx);
        for (int i = idx; i < lists.size(); i++) {
            if (lists.get(i) % wantDelete == 0) {
                lists.remove(i);
            }
        }
    }

    private static boolean isPrime(long n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        return bigInteger.isProbablePrime(10);
    }
}
