# Core Java Learning Repository

This repository contains comprehensive examples of Core Java concepts organized by topic.

## Topics Covered

### 1. **Basics**
- **Variables/** - Variable declaration and types
- **Operators/** - Arithmetic, logical, bitwise operators
- **Day01/** - Introduction to Java

### 2. **Control Flow**
- **Conditionals/** - IF/ELSE, ELSEIF, Switch statements
- **Loops/** - For, While, Do-While loops, Break, Continue

### 3. **Object-Oriented Programming (OOP)**
- **Classes/** - Class definition and instantiation
- **Constructors/** - Default, parametrized, chaining
- **New keyword/** - Object creation
- **Inheritance/** - Single inheritance, super keyword, method overriding
- **Polymorphism/** - Method overloading, runtime polymorphism
- **Interfaces/** - Interface implementation, contracts
- **Abstract Classes/** - Abstract methods and classes

### 4. **Advanced Features**
- **Exception Handling/** - Try-catch, finally, throws, custom exceptions
- **Collections/** - ArrayList, HashMap, HashSet, LinkedList, TreeSet, TreeMap
- **File I/O/** - Reading/Writing files, byte streams, character streams
- **Packages and Access Modifiers/** - public, private, protected, default

### 5. **Functions & Methods**
- **functions/** - Method definition and parameters
- **Method overloading/** - Multiple methods with same name
- **Recursion/** - Recursive functions, factorial, fibonacci

### 6. **Data Structures**
- **Arrays/** - Single and multi-dimensional arrays
- **Strings/** - String manipulation
- **Type-Casting/** - Implicit and explicit casting

### 7. **References**
- **Call by value/** - Pass by value
- **Call by Ref/** - Pass by reference

## How to Use

1. Each folder contains one or more Java files demonstrating a specific concept
2. Run the main demo files to see examples:
   - `InheritanceDemo.java` - Inheritance example
   - `PolymorphismDemo.java` - Polymorphism example
   - `InterfaceDemo.java` - Interface implementation
   - `AbstractClassDemo.java` - Abstract classes
   - `TryCatchExample.java` - Exception handling
   - `ArrayListExample.java` - Collections
   - `FileReadWriteExample.java` - File I/O
   - `AccessModifierDemo.java` - Access modifiers

## Compilation and Execution

### Compile all files:
```bash
javac *.java
javac **/*.java  (for all subdirectories)
```

### Run specific class:
```bash
java ClassName
```

### For Package examples (Packages and Access Modifiers):
```bash
javac -d . mypackage/Employee.java mypackage/Manager.java AccessModifierDemo.java
java AccessModifierDemo
```

## Key Concepts Summary

### Access Modifiers
- **public**: Accessible from anywhere
- **protected**: Accessible within package and subclasses
- **default**: Accessible within package only
- **private**: Accessible only within the class

### OOP Pillars
1. **Encapsulation** - Data hiding with getters/setters
2. **Inheritance** - Reusing code through class hierarchy
3. **Polymorphism** - Same method, different behavior
4. **Abstraction** - Hiding complex implementation details

### Collections Framework
- **List**: ArrayList, LinkedList - Ordered, allows duplicates
- **Set**: HashSet, TreeSet - No duplicates
- **Map**: HashMap, TreeMap - Key-value pairs

### Exception Handling Best Practices
- Use specific exceptions in catch blocks
- Always use finally or try-with-resources for cleanup
- Throw meaningful custom exceptions
- Log exceptions for debugging

## Tips for Learning

1. Start with basics (Variables, Operators, Control Flow)
2. Move to OOP concepts (Classes, Inheritance, Polymorphism)
3. Learn advanced features (Exceptions, Collections, Files)
4. Practice creating your own classes and applications
5. Use try-catch for error handling
6. Follow naming conventions (camelCase for variables/methods, PascalCase for classes)

## Common Errors to Avoid

- ❌ Using `string[]` instead of `String[]` for main method
- ❌ Infinite loops (checking increment in wrong place)
- ❌ Not closing resources (use try-with-resources)
- ❌ Accessing private members from outside class
- ❌ Not implementing all abstract methods in classes

## Resources

- Practice coding regularly
- Create small projects combining multiple concepts
- Test edge cases in your code
- Use meaningful variable and method names
- Add comments to complex logic
