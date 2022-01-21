package acmicpc;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class N2581Test extends AcmicpcTest<List<Integer>, List<Integer>> {

    @Before
    @Override
    public void before() {
        caseList.add(new TestCase<>(List.of(60, 100), List.of(620, 61)));
        caseList.add(new TestCase<>(List.of(64, 65), List.of(-1)));
    }

    @Test
    @Override
    public void test() {
        defaultTesting(new N2581());
    }
}
