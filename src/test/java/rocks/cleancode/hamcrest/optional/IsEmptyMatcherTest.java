package rocks.cleancode.hamcrest.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class IsEmptyMatcherTest {

    @Test
    public void should_match_empty_optional() {
        Optional<?> emptyOptional = Optional.empty();

        assertThat(emptyOptional, is(new IsEmptyMatcher<>()));
    }

}
