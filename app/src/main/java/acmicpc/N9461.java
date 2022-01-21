package acmicpc;

import java.util.*;

public class N9461 implements Problem<Integer, Integer> {
    @Override
    public Integer function(Integer input) {
        final List<Integer> lists = List.of(0, 1, 1, 1, 2, 2, 3);
        if (input < 7) return lists.get(input);
        ArrayList<Integer> list = new ArrayList<>(lists);
        for (int i = 6; i < input; i++) {
            list.add(list.get(i) + list.get(i - 4));
        }
        return list.get(input);
    }
}
