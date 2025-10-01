package dev.sinap.validation;

/**
 * A generic contract for validation rules.
 * <p>
 * Each rule checks a specific constraint on a value of type {@code T}.
 * If the value does not satisfy the rule, an error message is provided.
 *
 * @param <T> the type of value this rule validates
 */
public interface Rule<T> {

    /**
     * Checks if the given value satisfies the rule.
     *
     * @param value the input value to validate (can be {@code null})
     * @return {@code true} if the value is valid according to this rule,
     *         {@code false} otherwise
     */
    boolean isValid(T value);


    /**
     * Returns the error message that should be displayed
     * if the rule validation fails.
     *
     * @return a non-null error message describing the validation failure
     */
    String message();
}
