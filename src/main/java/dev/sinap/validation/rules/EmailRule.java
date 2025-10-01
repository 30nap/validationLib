package dev.sinap.validation.rules;


import dev.sinap.validation.Rule;

import java.util.regex.Pattern;

/**
 * A validation rule that checks if a string is a valid email address.
 * <p>
 * This rule uses a simple regular expression for basic email format validation.
 * It does not perform DNS or MX record checks.
 */
public record EmailRule(String message) implements Rule<String> {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");


    /**
     * Checks whether the given string is a valid email address.
     *
     * @param value the input string (maybe {@code null})
     * @return {@code true} if the string matches the email pattern,
     * {@code false} otherwise
     */
    @Override
    public boolean isValid(String value) {
        return value != null && EMAIL_PATTERN.matcher(value).matches();
    }
}
