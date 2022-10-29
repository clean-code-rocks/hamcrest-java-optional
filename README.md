# Hamcrest - Optional

[![Maven Central][Maven Central - badge]][Maven Central - link]
[![Javadoc][Javadoc - badge]][Javadoc - link]
[![Codecov][Codecov - badge]][Codecov - link]
[![License: GPL v3][Licence - badge]][Licence - link]
[![Fossa][Fossa - badge]][Fossa - link]

[Java Hamcrest] matchers for `java.util.Optional`.

## Requirement

Java 8+

## Installation

### Maven

```xml
<dependency>
    <groupId>rocks.cleancode</groupId>
    <artifactId>hamcrest-optional</artifactId>
    <version>1.0.0</version>
    <scope>test</scope>
</dependency>
```

## Usage

Three matchers are provided for `Optional`: `empty()`, `present()` and `value(matcher)`.

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
import static rocks.cleancode.hamcrest.optional.IsPresentMatcher.present;

Optional<String> optional = Optional.of("Dummy value");
assertThat(optional, is(present()));
```

### value(matcher)

This matcher matches an `Optional` with a value matching the given matcher.

```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static rocks.cleancode.hamcrest.optional.ValueMatcher.value;

Optional<String> optional = Optional.of("Dummy value");
assertThat(optional, value(is(equalTo("Dummy value"))));
```

[Java Hamcrest]: https://hamcrest.org/JavaHamcrest/

[Maven Central - badge]: https://img.shields.io/maven-central/v/rocks.cleancode/hamcrest-optional?color=brightgreen
[Maven Central - link]: https://search.maven.org/artifact/rocks.cleancode/hamcrest-optional
[Javadoc - badge]: https://javadoc.io/badge2/rocks.cleancode/hamcrest-optional/javadoc.svg
[Javadoc - link]: https://javadoc.io/doc/rocks.cleancode/hamcrest-optional
[Codecov - badge]: https://codecov.io/gh/clean-code-rocks/hamcrest-java-optional/branch/main/graph/badge.svg?token=MD5XCHBMQ4
[Codecov - link]: https://codecov.io/gh/clean-code-rocks/hamcrest-java-optional
[Licence - badge]: https://img.shields.io/badge/License-GPLv3-blue.svg
[Licence - link]: https://www.gnu.org/licenses/gpl-3.0
[Fossa - badge]: https://app.fossa.com/api/projects/git%2Bgithub.com%2Fclean-code-rocks%2Fhamcrest-java-optional.svg?type=shield
[Fossa - link]: https://app.fossa.com/projects/git%2Bgithub.com%2Fclean-code-rocks%2Fhamcrest-java-optional?ref=badge_shield
