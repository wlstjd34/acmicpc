package acmicpc;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class N1929Test extends AcmicpcTest<List<Long>, List<Long>> {

    @Before
    @Override
    public void before() {
        caseList.add(new TestCase<>(List.of(3L, 16L), List.of(3L, 5L, 7L, 11L, 13L)));
        caseList.add(new TestCase<>(List.of(1L, 3L), List.of(2L, 3L)));
        caseList.add(new TestCase<>(List.of(1L, 2L), List.of(2L)));
        caseList.add(new TestCase<>(List.of(1L, 16L), List.of(2L, 3L, 5L, 7L, 11L, 13L)));
        caseList.add(new TestCase<>(List.of(50L, 70L), List.of(53L, 59L, 61L, 67L)));
    }

    @Test
    @Override
    public void test() {
        defaultTesting(new N1929());
    }
}
