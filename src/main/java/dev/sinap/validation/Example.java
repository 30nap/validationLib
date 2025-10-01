package dev.sinap.validation;

import dev.sinap.validation.rules.EmailRule;

public class Example {
    void main() {
        String email = "wrong-email.com";

        String message = Resources.get("invalid.email", "fa");

        ValidationResult result = Validator.of(email)
                .rule(new EmailRule(message))
                .validate();

        if (result.isValid()) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Errors: " + result.getErrors());
        }
    }
}
