package dev.sinap.validation;

import java.util.List;


/**
 * Represents the result of a validation process.
 * <p>
 * A {@code ValidationResult} is either valid (no errors)
 * or invalid (with a list of error messages).
 */
public class ValidationResult {

    private final boolean valid;

    private final List<String> errors;

    private ValidationResult(boolean valid, List<String> errors) {
        this.valid = valid;
        this.errors = errors;
    }

    /**
     * Creates a valid result with no errors.
     *
     * @return a successful {@code ValidationResult}
     */
    public static ValidationResult ok() {
        return new ValidationResult(true, List.of());
    }


    /**
     * Creates an invalid result with the given errors.
     *
     * @param errors the list of error messages
     * @return a failed {@code ValidationResult}
     */
    public static ValidationResult fail(List<String> errors) {
        return new ValidationResult(false, errors);
    }


    public boolean isValid() {
        return valid;
    }


    /**
     * Returns the list of validation error messages.
     * <p>
     * This list will be empty if {@link #isValid()} is true.
     *
     * @return an unmodifiable list of error messages
     */
    public List<String> getErrors() {
        return errors;
    }
}
