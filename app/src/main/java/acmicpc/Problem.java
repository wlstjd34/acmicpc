package acmicpc;

import java.util.List;

public interface Problem<I, A> {
    A function(I input);
}
