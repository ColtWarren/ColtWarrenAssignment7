CustomArrayList Implementation
A Java implementation of a dynamic array (similar to ArrayList) built using Test-Driven Development (TDD) methodology.
📋 Project Overview
This project demonstrates the implementation of a custom dynamic array data structure that automatically resizes as elements are added. The implementation follows strict TDD principles, ensuring robust, well-tested code.
🎯 Assignment Objectives

Implement a custom dynamic array that mimics Java's ArrayList behavior
Apply Test-Driven Development (TDD) methodology using the Red-Green-Refactor cycle
Create comprehensive unit tests using JUnit 5
Handle dynamic array resizing and memory management
Implement proper error handling with custom exceptions

🔧 Features
Core Functionality

Dynamic Resizing: Automatically doubles capacity when array is full
Generic Type Support: Works with any object type using Java generics
Index-based Operations: Add, remove, and retrieve elements by index
Memory Management: Properly clears references to prevent memory leaks
Exception Handling: Throws IndexOutOfBoundsException for invalid operations

Supported Operations

add(T item) - Append element to end of list
add(int index, T item) - Insert element at specific index
get(int index) - Retrieve element at index
remove(int index) - Remove element at index
getSize() - Get current number of elements

📁 Project Structure
src/
├── main/java/com/coderscampus/arraylist/
│   ├── CustomList.java           # Interface defining contract
│   ├── CustomArrayList.java      # Main implementation
│   └── CustomListApplication.java # Demo application
└── test/java/com/coderscampus/arraylist/
    └── CustomArrayListTest.java  # JUnit test suite
🧪 Test-Driven Development Approach
This project strictly follows TDD methodology:

Red Phase: Write failing tests first
Green Phase: Write minimal code to make tests pass
Refactor Phase: Improve code while maintaining test coverage

Test Coverage

✅ Basic add operations
✅ Dynamic array resizing
✅ Index-based insertion
✅ Element removal with proper shifting
✅ Exception handling for invalid indices
✅ Edge cases and boundary conditions

🚀 Getting Started
Prerequisites

Java 8 or higher
JUnit 5 (for running tests)

Running the Application
bash# Compile the project
javac src/main/java/com/coderscampus/arraylist/*.java

# Run the demo application
java -cp src/main/java com.coderscampus.arraylist.CustomListApplication
Running Tests
bash# Run all tests
junit-console-standalone --class-path src/test/java --select-class com.coderscampus.arraylist.CustomArrayListTest
📊 Performance Characteristics
OperationTime ComplexitySpace ComplexityAdd (end)O(1) amortizedO(1)Add (index)O(n)O(1)GetO(1)O(1)RemoveO(n)O(1)ResizeO(n)O(n)
🔍 Implementation Details
Dynamic Resizing Strategy

Initial Capacity: 10 elements
Growth Factor: 2x (doubles when full)
Memory Management: Nulls out references when removing elements

Error Handling

Validates array bounds for all index-based operations
Throws descriptive IndexOutOfBoundsException messages
Handles edge cases like empty lists and invalid indices

💡 Key Learning Outcomes
Through this assignment, I demonstrated:

TDD Mastery: Writing tests before implementation
Generic Programming: Using Java generics for type safety
Data Structure Design: Implementing dynamic arrays from scratch
Memory Management: Preventing memory leaks in Java
Exception Handling: Proper error handling and messaging
JUnit Testing: Comprehensive test suite development

🐛 Known Issues & Solutions
Issue: Double Size Decrement

Problem: Remove method decremented size twice
Solution: Fixed to decrement size only once and properly clear references
Detection: Caught through comprehensive TDD testing

📈 Future Enhancements
Potential improvements for extended functionality:

 Implement shrinking when array becomes too sparse
 Add iterator support for enhanced for-loop compatibility
 Implement additional List interface methods
 Add performance benchmarking against Java ArrayList
 Thread-safety considerations

🏆 Assignment Success Criteria

 Implement all CustomList interface methods
 Follow TDD methodology throughout development
 Create comprehensive JUnit test suite
 Handle dynamic array resizing automatically
 Properly manage memory and prevent leaks
 Implement robust error handling
 Demonstrate understanding of generics and data structures

📚 Technologies Used

Java: Core programming language
JUnit 5: Testing framework
Maven/Gradle: Build system (if applicable)
Git: Version control

👨‍💻 Development Notes
This implementation showcases practical application of:

Object-oriented design principles
Test-driven development practices
Generic programming concepts
Dynamic data structure implementation
Memory management in Java


This project was completed as part of a Java programming course focusing on TDD principles and custom data structure implementation.
