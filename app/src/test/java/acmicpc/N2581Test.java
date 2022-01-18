package acmicpc;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class N2581Test {
    List<Integer> inputCase1 = List.of(60, 100);
    List<Integer> ansCase1 = List.of(620, 61);
    List<Integer> inputCase2 = List.of(64, 65);
    List<Integer> ansCase2 = List.of(-1);

    @Test
    public void test1() {
        ArrayList<Integer> result = N2581.function(inputCase1);
        Assert.assertEquals(ansCase1, result);
    }

    @Test
    public void test2() {
        ArrayList<Integer> result = N2581.function(inputCase2);
        Assert.assertEquals(ansCase2, result);
    }
}
