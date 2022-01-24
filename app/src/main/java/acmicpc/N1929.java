package acmicpc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class N1929 implements Problem<List<Long>, List<Long>> {
    @Override
    public List<Long> function(List<Long> input) {
        BigInteger start = BigInteger.valueOf(input.get(0) - 1).nextProbablePrime();
        BigInteger end = BigInteger.valueOf(input.get(1));
        return Stream.iterate(start, endCond -> endCond.compareTo(end) <= 0, BigInteger::nextProbablePrime)
                .mapToLong(BigInteger::longValue).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
