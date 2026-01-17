# Student Information System

A simple console-based Java application for managing student records. This system allows users to add, view, search, and delete student information through a menu-driven interface.

## Features

- **Add Student**: Add new student records with ID, name, age, grade, and contact information
- **View Students**: Display all student records in a formatted table
- **Search by ID**: Find a student by their unique student ID
- **Search by Name**: Find a student by their name
- **Delete Student**: Remove a student record by ID
- **Input Validation**: Validates age (1-100), grade (1-100), and contact (10 digits)

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command line interface to run the application

## Project Structure

```
Student Information System/
├── README.md
├── docs/
├── sample_data/
│   └── students.csv          # Sample student data in CSV format
└── src/
    ├── Student.java              # Student model class
    ├── StudentManager.java       # Manages student operations
    ├── ValidationUtils.java      # Input validation utilities
    └── StudentInformationSystem.java  # Main application class
```

## How to Run

1. Ensure you have Java JDK installed on your system
2. Navigate to the project directory
3. Compile the Java files:
   ```
   javac src/*.java
   ```
4. Run the application:
   ```
   java -cp src StudentInformationSystem
   ```

## Usage

Upon running the application, you'll see a menu with the following options:

1. **Add Student**: Enter student details (ID, name, age, grade, contact)
2. **View Students**: Display all stored student records in a table format
3. **Search Student by ID**: Enter student ID to find a specific student
4. **Search Student by Name**: Enter student name to find a specific student
5. **Delete Student**: Enter student ID to remove from the system
6. **Exit**: Close the application

### Input Validation Rules

- **Age**: Must be an integer between 1 and 100
- **Grade**: Must be a number between 1 and 100
- **Contact**: Must be exactly 10 digits

## Sample Data

The `sample_data/students.csv` file contains sample student records that can be used for testing. The CSV format is:
```
StudentID,Name,Age,Grade,Contact
```

## Classes Overview

- **Student**: Represents a student with fields for ID, name, age, grade, and contact
- **StudentManager**: Handles operations on the student collection (add, view, search, delete)
- **ValidationUtils**: Contains static methods for validating user inputs
- **StudentInformationSystem**: Main class with the console menu and user interaction

## Contributing

Feel free to contribute to this project by:
- Adding new features
- Improving input validation
- Enhancing the user interface
- Fixing bugs

## License

This project is open source and available under the MIT License.
