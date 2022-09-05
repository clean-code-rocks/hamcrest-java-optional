package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

public class IsPresentWithValueMatcher<T> extends TypeSafeMatcher<Optional<T>> {

    public IsPresentWithValueMatcher(Matcher<T> valueMatcher) {

    }

    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return true;
    }

    @Override
    public void describeTo(Description description) {

    }

}
