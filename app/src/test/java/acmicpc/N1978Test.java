package acmicpc;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class N1978Test extends AcmicpcTest<List<Integer>, Integer> {
    @Override
    @Before
    public void before() {
        caseList.add(new TestCase<>(List.of(1, 3, 5, 7), 3));
    }

    @Test
    @Override
    public void test() {
        defaultTesting(new N1978());
    }
}
