package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Matcher;

import java.util.Optional;

public class OptionalMatchers {

    public static <T> Matcher<Optional<T>> empty() {
        return IsEmptyMatcher.empty();
    }

}
