package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

public class ValueMatcher<T> extends TypeSafeMatcher<Optional<T>> {

    public static <T> Matcher<Optional<T>> value(Matcher<T> valueMatcher) {
        return new ValueMatcher<>(valueMatcher);
    }

    private final Matcher<T> valueMatcher;

    private ValueMatcher(Matcher<T> valueMatcher) {
        this.valueMatcher = valueMatcher;
    }

    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return optional.isPresent() && valueMatcher.matches(optional.get());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("value ");
        valueMatcher.describeTo(description);
    }

    @Override
    protected void describeMismatchSafely(Optional<T> optinal, Description mismatchDescription) {
        if (optinal.isPresent()) {
            valueMatcher.describeMismatch(optinal.get(), mismatchDescription);
        } else {
            mismatchDescription.appendText("was empty");
        }
    }

}