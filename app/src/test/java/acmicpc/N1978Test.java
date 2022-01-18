package acmicpc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class N1978Test {

    @Test
    public void test() {
        List<Integer> input = Arrays.asList(1, 3, 5, 7);
        Assert.assertEquals(3, N1978.function(input));
    }
}
