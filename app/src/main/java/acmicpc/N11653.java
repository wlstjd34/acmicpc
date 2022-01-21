package acmicpc;

import java.util.ArrayList;
import java.util.List;

public class N11653 implements Problem<Integer, List<Integer>> {

    @Override
    public List<Integer> function(Integer input) {
        List<Integer> result = new ArrayList<>();
        int divided = input;
        while (divided != 1) {
            for (int i = 2; i <= input; i++) {
                if (divided % i == 0) {
                    divided /= i;
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
