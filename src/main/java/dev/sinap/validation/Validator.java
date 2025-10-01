package dev.sinap.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * The main entry point for applying multiple validation rules
 * to a single value of type {@code T}.
 * <p>
 * A {@code Validator} instance is created with {@link #of(Object)} and rules
 * are added using {@link #rule(Rule)}. The {@link #validate()} method
 * returns a {@link ValidationResult} that indicates whether all rules passed.
 *
 * @param <T> the type of value being validated
 */
public class Validator<T> {
    private final T value;
    private final List<String> errors = new ArrayList<>();

    private Validator(T value) {
        this.value = value;
    }


    /**
     * Creates a new {@code Validator} for the given value.
     *
     * @param value the value to validate
     * @param <T>   the type of the value
     * @return a new {@code Validator} instance
     */
    public static <T> Validator<T> of(T value) {
        return new Validator<>(value);
    }

    /**
     * Adds a validation rule to be checked against the value.
     * <p>
     * If the rule fails, its error message is collected.
     *
     * @param rule the validation rule to apply
     * @return this {@code Validator} instance for method chaining
     */
    public Validator<T> rule(Rule<T> rule) {
        if (!rule.isValid(value)) {
            errors.add(rule.message());
        }
        return this;
    }

    /**
     * Executes all added rules and returns a {@link ValidationResult}.
     *
     * @return a {@link ValidationResult} containing the outcome of validation
     */
    public ValidationResult validate() {
        return errors.isEmpty()
                ? ValidationResult.ok()
                : ValidationResult.fail(errors);
    }
}
