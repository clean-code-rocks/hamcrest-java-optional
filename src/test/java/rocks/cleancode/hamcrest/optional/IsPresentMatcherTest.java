package rocks.cleancode.hamcrest.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static rocks.cleancode.hamcrest.optional.IsPresentMatcher.present;

public class IsPresentMatcherTest {

    @Test
    public void should_match_optional_with_value() {
        Optional<String> optionalWithValue = Optional.of("Dummy value");

        assertThat(optionalWithValue, is(present()));
    }

    @Test
    public void should_fail_when_optional_is_empty() {
        Optional<?> optional = Optional.empty();

        AssertionError assertionError = assertThrows(
                AssertionError.class,
                () -> assertThat(optional, is(present()))
        );

        String expectedMessage = String.format(
                "%n%s%n%s",
                "Expected: is present",
                "     but: was empty"
        );

        assertThat(assertionError.getMessage(), is(equalTo(expectedMessage)));
    }

}
