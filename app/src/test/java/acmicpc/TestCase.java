package acmicpc;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class TestCase<I, A> {
    I input;
    A answer;
}
