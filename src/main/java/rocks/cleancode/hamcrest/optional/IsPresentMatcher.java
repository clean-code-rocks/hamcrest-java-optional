package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

/**
 * Matches an {@link java.util.Optional} with a value.
 *
 * @param <T> Type of the Optional value
 *
 * @since 1.0.0
 */
public class IsPresentMatcher<T> extends TypeSafeMatcher<Optional<T>> {

    /**
     * Create a matcher for {@link java.util.Optional} having a value.
     *
     * @return Present {@link java.util.Optional} matcher
     * @param <T> Type of the {@link java.util.Optional} value
     *
     * @since 1.0.0
     */
    public static <T> Matcher<Optional<T>> present() {
        return new IsPresentMatcher<>();
    }

    private IsPresentMatcher() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return optional.isPresent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void describeTo(Description description) {
        description.appendText("present");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void describeMismatchSafely(Optional<T> optional, Description mismatchDescription) {
        mismatchDescription.appendText("was empty");
    }

}
