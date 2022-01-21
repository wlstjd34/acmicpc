package acmicpc;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class N11653Test extends AcmicpcTest<Integer, List<Integer>> {

    @Before
    @Override
    public void before() {
        caseList.add(new TestCase<>(72, List.of(2, 2, 2, 3, 3)));
        caseList.add(new TestCase<>(3, List.of(3)));
        caseList.add(new TestCase<>(6, List.of(2, 3)));
        caseList.add(new TestCase<>(2, List.of(2)));
        caseList.add(new TestCase<>(9991, List.of(97, 103)));
    }


    @Test
    @Override
    public void test() {
        defaultTesting(new N11653());
    }
}
