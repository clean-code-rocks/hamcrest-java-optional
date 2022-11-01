package rocks.cleancode.hamcrest.optional;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class OptionalMatchersTest {

    @Test
    public void should_create_is_empty_matcher() {
        Matcher<Optional<String>> isEmptyMatcher = OptionalMatchers.empty();

        assertThat(isEmptyMatcher, is(instanceOf(IsEmptyMatcher.class)));
    }

}
