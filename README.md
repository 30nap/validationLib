# Validation Library

A lightweight, fluent, and extensible Java validation library that allows you to validate values with custom or predefined rules. Built for simplicity, readability, and easy integration into any Java project. All public classes and methods are fully documented with JavaDoc.

---

## Features

- Fluent API for easy chaining of validations
- Supports custom validation rules via Rule<T> interface
- Predefined rules: EmailRule, NotNullRule, MinLengthRule, RangeRule
- Returns a ValidationResult with detailed error messages
- No external dependencies, pure Java
- Fully documented with JavaDoc for all classes and methods
- Easy to extend and reuse in any Java project

---

## Usage Examples

You can create a Validator instance for any value, add rules, and then validate it. The ValidationResult object indicates whether the value passed all rules and contains any error messages. Predefined rules such as EmailRule can be used directly, or you can create custom rules by implementing the Rule<T> interface. This allows for flexibility and easy extension of the library.

---

## Extending with Custom Rules

Custom rules can be implemented by creating a class that implements Rule<T>. Each rule must implement the isValid method, which contains the validation logic, and getMessage method, which returns the error message if the rule fails. Once implemented, the custom rule can be added to a Validator instance just like any predefined rule.

---

## License

MIT License © 2025
