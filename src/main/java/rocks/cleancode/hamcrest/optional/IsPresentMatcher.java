package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

public class IsPresentMatcher<T> extends TypeSafeMatcher<Optional<T>> {
    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return optional.isPresent();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("present");
    }

    @Override
    protected void describeMismatchSafely(Optional<T> optional, Description mismatchDescription) {
        mismatchDescription.appendText("was empty");
    }
}
