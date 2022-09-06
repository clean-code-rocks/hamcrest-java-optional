# Hamcrest - Optional

[Java Hamcrest](http://hamcrest.org/JavaHamcrest/) matchers for `java.util.Optional`.

## Usage

Three matchers are provided for `Optional`: `empty()`, `present()` and `presentWithValue(matcher)`.

### empty()

This matcher matches an `Optional` without value.

```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static rocks.cleancode.hamcrest.optional.IsEmptyMatcher.empty;

Optional<?> optional = Optional.empty();
assertThat(optional, is(empty()));
```

### present()

This matcher matches an `Optional` with a value.

```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static rocks.cleancode.hamcrest.optional.IsEmptyMatcher.present;

Optional<String> optional = Optional.of("Dummy value");
assertThat(optional, is(present()));
```

### presentWithValue(matcher)

This matcher matches an `Optional` with a value matching the given matcher.

```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static rocks.cleancode.hamcrest.optional.IsEmptyMatcher.presentWithValue;

Optional<String> optional = Optional.of("Dummy value");
assertThat(optional, is(presentWithValue(equalTo("Dummy value"))));
```