package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Matcher;

import java.util.Optional;

/**
 * Facility class to create matchers for {@link java.util.Optional}.
 *
 * @since 1.1.0
 */
public class OptionalMatchers {

    private OptionalMatchers() {
    }

    /**
     * Create a matcher for empty {@link java.util.Optional}.
     *
     * @return Empty {@link java.util.Optional} matcher
     * @param <T> Type of the {@link java.util.Optional} value
     *
     * @since 1.1.0
     */
    public static <T> Matcher<Optional<T>> empty() {
        return IsEmptyMatcher.empty();
    }

    /**
     * Create a matcher for {@link java.util.Optional} having a value.
     *
     * @return Present {@link java.util.Optional} matcher
     * @param <T> Type of the {@link java.util.Optional} value
     *
     * @since 1.1.0
     */
    public static <T> Matcher<Optional<T>> present() {
        return IsPresentMatcher.present();
    }

    /**
     * Create a matcher for the value of the {@link java.util.Optional}.
     *
     * @param valueMatcher Matcher for the value
     * @return Value matcher
     * @param <T> Type of the {@link java.util.Optional} value
     *
     * @since 1.1.0
     */
    public static <T> Matcher<Optional<T>> value(Matcher<T> valueMatcher) {
        return ValueMatcher.value(valueMatcher);
    }

}
