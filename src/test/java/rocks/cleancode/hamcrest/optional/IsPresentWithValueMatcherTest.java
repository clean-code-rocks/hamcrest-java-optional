package rocks.cleancode.hamcrest.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IsPresentWithValueMatcherTest {

    @Test
    public void should_match_optional_with_value() {
        Optional<String> optionalWithValue = Optional.of("Dummy value");

        assertThat(optionalWithValue, is(new IsPresentWithValueMatcher<>(equalTo("Dummy value"))));
    }

    @Test
    public void should_fail_when_optional_is_empty() {
        Optional<String> emptyOptional = Optional.empty();

        assertThrows(
                AssertionError.class,
                () -> assertThat(emptyOptional, is(new IsPresentWithValueMatcher<>(equalTo("Dummy value"))))
        );
    }

}
