package rocks.cleancode.hamcrest.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static rocks.cleancode.hamcrest.optional.ValueMatcher.value;

public class ValueMatcherTest {

    @Test
    public void should_match_optional_with_value() {
        Optional<String> optionalWithValue = Optional.of("Dummy value");

        assertThat(optionalWithValue, value(is(equalTo("Dummy value"))));
    }

    @Test
    public void should_fail_when_optional_is_empty() {
        Optional<String> emptyOptional = Optional.empty();

        AssertionError assertionError = assertThrows(
                AssertionError.class,
                () -> assertThat(emptyOptional, value(is(equalTo("Dummy value"))))
        );

        String expectedMessage = String.format(
                "%n%s%n%s",
                "Expected: value is \"Dummy value\"",
                "     but: was empty"
        );

        assertThat(assertionError.getMessage(), is(equalTo(expectedMessage)));
    }

    @Test
    public void should_fail_when_optional_value_does_not_match() {
        Optional<String> optionalWithValue = Optional.of("Dummy value");

        AssertionError assertionError = assertThrows(
                AssertionError.class,
                () -> assertThat(optionalWithValue, value(is(equalTo("Other dummy value"))))
        );

        String expectedMessage = String.format(
                "%n%s%n%s",
                "Expected: value is \"Other dummy value\"",
                "     but: was \"Dummy value\""
        );

        assertThat(assertionError.getMessage(), is(equalTo(expectedMessage)));
    }

}
