package rocks.cleancode.hamcrest.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IsEmptyMatcherTest {

    @Test
    public void should_match_empty_optional() {
        Optional<?> emptyOptional = Optional.empty();

        assertThat(emptyOptional, is(new IsEmptyMatcher<>()));
    }

    @Test
    public void should_fail_when_optional_has_value() {
        Optional<String> optional = Optional.of("Dummy value");

        AssertionError assertionError = assertThrows(
                AssertionError.class,
                () -> assertThat(optional, is(new IsEmptyMatcher<>()))
        );

        String expectedMessage = String.format(
                "%n%s%n%s",
                "Expected: is empty",
                "     but: has value"
        );

        assertThat(assertionError.getMessage(), is(equalTo(expectedMessage)));
    }

}
