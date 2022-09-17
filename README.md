# Hamcrest - Optional

[![Maven Central](https://img.shields.io/maven-central/v/rocks.cleancode/hamcrest-java-optional?color=brightgreen)](https://search.maven.org/artifact/rocks.cleancode/hamcrest-java-optional)
[![codecov](https://codecov.io/gh/clean-code-rocks/hamcrest-java-optional/branch/main/graph/badge.svg?token=MD5XCHBMQ4)](https://codecov.io/gh/clean-code-rocks/hamcrest-java-optional)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fclean-code-rocks%2Fhamcrest-java-optional.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fclean-code-rocks%2Fhamcrest-java-optional?ref=badge_shield)

[Java Hamcrest](http://hamcrest.org/JavaHamcrest/) matchers for `java.util.Optional`.

## Installation

### Maven

```xml
<dependency>
    <groupId>rocks.cleancode</groupId>
    <artifactId>hamcrest-java-optional</artifactId>
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
