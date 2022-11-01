package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Matcher;

import java.util.Optional;

public class OptionalMatchers {

    public static <T> Matcher<Optional<T>> empty() {
        return IsEmptyMatcher.empty();
    }

    public static <T> Matcher<Optional<T>> present() {
        return IsPresentMatcher.present();
    }

    public static <T> Matcher<Optional<T>> value(Matcher<T> valueMatcher) {
        return ValueMatcher.value(valueMatcher);
    }

}
