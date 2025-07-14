CustomArrayList Implementation
A Java implementation of a dynamic array (similar to ArrayList) built using Test-Driven Development (TDD) methodology.

Assignment #7: CustomArrayList with TDD
📝 Brief Summary
Objective: Build a custom dynamic array implementation using Test-Driven Development methodology.
🎯 Core Requirements
Implementation Tasks

Create CustomArrayList<T> that implements the provided CustomList<T> interface
Implement 5 key methods: add(), add(index, item), get(), remove(), and getSize()
Handle dynamic array resizing (starts at size 10, doubles when full)
Proper exception handling for invalid indices

TDD Requirements

Follow Red-Green-Refactor cycle throughout development
Write comprehensive JUnit tests covering all functionality
Write failing tests first, then implement code to make them pass
Ensure tests catch bugs and guide development

🔧 Key Features Implemented

Dynamic resizing - automatically grows as needed
Generic type support - works with any object type
Index-based operations - insert, remove, and access by position
Memory management - prevents memory leaks
Robust error handling - throws descriptive exceptions

🧪 Testing Approach

Unit tests for each method (normal cases, edge cases, error conditions)
Tests that verify both functionality and exception handling
TDD methodology demonstrated through test-first development

📊 Technical Highlights

Starting capacity: 10 elements
Growth strategy: 2x expansion when full
Time complexity: O(1) for get/add-at-end, O(n) for insert/remove
Exception handling: IndexOutOfBoundsException for invalid operations

🎓 Learning Outcomes

Mastered Test-Driven Development principles
Implemented custom data structures from scratch
Applied Java generics for type safety
Demonstrated proper memory management
Created comprehensive test suites with JUnit


Result: A fully functional, well-tested dynamic array implementation that mimics ArrayList behavior, developed using industry-standard TDD practices.
