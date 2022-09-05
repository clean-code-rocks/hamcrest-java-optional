package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Optional;

public class IsPresentWithValueMatcher<T> extends TypeSafeMatcher<Optional<T>> {

    private final Matcher<T> valueMatcher;

    public IsPresentWithValueMatcher(Matcher<T> valueMatcher) {
        this.valueMatcher = valueMatcher;
    }

    @Override
    protected boolean matchesSafely(Optional<T> optional) {
        return optional.isPresent();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("present with value ");
        valueMatcher.describeTo(description);
    }

    @Override
    protected void describeMismatchSafely(Optional<T> optinal, Description mismatchDescription) {
        mismatchDescription.appendText("was empty");
    }

}
