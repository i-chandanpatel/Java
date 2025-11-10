// Final variables: Declaring a variable as final prevents its value from being changed after initialization, useful for constants.
// Final methods: When a method is declared as final, it cannot be overridden by a subclass. This is useful for methods that are part of a class's public API and should not be modified by subclasses.
// Final classes: When a class is declared as final, it cannot be extended by a subclass. This is useful for classes that are intended to be used as is and should not be modified or extended.
// Initialization: Final variables must be initialized either at the time of declaration or in the constructor of the class. This ensures that the value of the variable is set and cannot be changed.
// Performance: The use of a final can sometimes improve performance, as the compiler can optimize the code more effectively when it knows that a variable or method cannot be changed.
// Security: The final can help improve security by preventing malicious code from modifying sensitive data or behavior.


// Advantages of final Keyword in Java
// Ensuring immutability: When a variable or reference is marked as final, its value cannot be changed once it is assigned. This helps ensure that data is immutable and cannot be accidentally or maliciously modified.
// Improving performance: The use of the final can sometimes help improve performance, as the Java Virtual Machine (JVM) can optimize code more effectively when it knows that certain values or references cannot be changed.
// Making code easier to understand: By declaring variables, methods or classes as final, developers can make their code easier to understand and reason about. When a value or reference is marked as final, it is clear that it will not change, which can simplify code analysis and debugging.
// Promoting code reuse: By declaring methods as final, developers can prevent subclasses from overriding them. This can help promote code reuse and reduce duplication, as subclasses must use the parent class's implementation of the method.
// Enhancing security: The use of final can help enhance security by preventing malicious code from modifying sensitive data or behavior.
