package acmicpc;

import org.junit.Test;

import java.util.List;

public class N9461Test extends AcmicpcTest<Integer, Integer> {
    @Override
    public void before() {
        caseList.add(new TestCase<>(1, 1));
        caseList.add(new TestCase<>(2, 1));
        caseList.add(new TestCase<>(3, 2));
        caseList.add(new TestCase<>(4, 2));
        caseList.add(new TestCase<>(5, 3));
        caseList.add(new TestCase<>(6, 4));
        caseList.add(new TestCase<>(7, 5));
        caseList.add(new TestCase<>(8, 7));
        caseList.add(new TestCase<>(9, 9));
        caseList.add(new TestCase<>(10, 12));
        caseList.add(new TestCase<>(11, 16));
        caseList.add(new TestCase<>(12, 21));
        caseList.add(new TestCase<>(13, 28));
        caseList.add(new TestCase<>(14, 37));
    }

    @Test
    @Override
    public void test() {
        defaultTesting(new N9461());
    }
}
