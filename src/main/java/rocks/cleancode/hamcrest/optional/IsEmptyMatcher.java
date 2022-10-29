package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

/**
 * Matches an empty {@link java.util.Optional}.
 *
 * @param <T> Type of the Optional value
 *
 * @since 1.0.0
 */
public class IsEmptyMatcher<T> extends TypeSafeMatcher<Optional<T>> {

    /**
     * Create a matcher for empty {@link java.util.Optional}.
     *
     * @return Empty {@link java.util.Optional} matcher
     * @param <T> Type of the {@link java.util.Optional} value
     *
     * @since 1.0.0
     */
    public static <T> Matcher<Optional<T>> empty() {
        return new IsEmptyMatcher<>();
    }

    private IsEmptyMatcher() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return !optional.isPresent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void describeTo(Description description) {
        description.appendText("empty");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void describeMismatchSafely(Optional<T> optional, Description mismatchDescription) {
        mismatchDescription.appendText("has value");
    }

}
