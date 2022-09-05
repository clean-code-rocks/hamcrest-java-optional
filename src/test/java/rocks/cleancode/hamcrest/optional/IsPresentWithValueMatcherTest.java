package rocks.cleancode.hamcrest.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class IsPresentWithValueMatcherTest {

    @Test
    public void should_match_optional_with_value() {
        Optional<String> optionalWithValue = Optional.of("Dummy value");

        assertThat(optionalWithValue, is(new IsPresentWithValueMatcher<>()));
    }

}
