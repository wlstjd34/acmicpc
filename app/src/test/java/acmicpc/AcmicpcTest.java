package acmicpc;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public abstract class AcmicpcTest<I, A> {
    protected List<TestCase<I, A>> caseList = new ArrayList<>();

    abstract public void before();
    abstract public void test();

    public void defaultTesting(Problem<I, A> ans) {
        for (TestCase<I, A> testCase : caseList) {
            A result = ans.function(testCase.getInput());
            Assert.assertEquals(testCase.getAnswer(), result);
        }
    }
}
