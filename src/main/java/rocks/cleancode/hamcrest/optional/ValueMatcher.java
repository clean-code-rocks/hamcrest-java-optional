package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

/**
 * Matches the value of an {@link java.util.Optional}.
 *
 * @param <T> Type of the {@link java.util.Optional} value
 *
 * @since 1.0.0
 */
public class ValueMatcher<T> extends TypeSafeMatcher<Optional<T>> {

    /**
     * Create a matcher for the value of the {@link java.util.Optional}.
     *
     * @param valueMatcher Matcher for the value
     * @return Value matcher
     * @param <T> Type of the {@link java.util.Optional} value
     *
     * @since 1.0.0
     */
    public static <T> Matcher<Optional<T>> value(Matcher<T> valueMatcher) {
        return new ValueMatcher<>(valueMatcher);
    }

    private final Matcher<T> valueMatcher;

    private ValueMatcher(Matcher<T> valueMatcher) {
        this.valueMatcher = valueMatcher;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return optional.isPresent() && valueMatcher.matches(optional.get());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void describeTo(Description description) {
        description.appendText("value ");
        valueMatcher.describeTo(description);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void describeMismatchSafely(Optional<T> optional, Description mismatchDescription) {
        if (optional.isPresent()) {
            valueMatcher.describeMismatch(optional.get(), mismatchDescription);
        } else {
            mismatchDescription.appendText("was empty");
        }
    }

}
