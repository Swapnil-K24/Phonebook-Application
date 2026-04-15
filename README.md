# Phonebook-Application

1. How to Run Program
   
Prerequisites
Java Development Kit (JDK): Version 8 or higher installed.
Terminal/IDE: Access to a command-line interface or an IDE (like Eclipse, STS).


Steps to Run :-

Clone the Repository:- 
git clone https://github.com/Swapnil-K24/Phonebook-Application.git
cd phonebook-system

Compile the Code:- 
_javac com/barasingha/task/*.java_

Execute the Application:

Run the driver class using:- 
_java com.barasingha.task.PhonebookDriver_



2. Key Design Decisions and Assumptions
   
2.1. Project Architecture
The project follows a modular structure to separate concerns:
Contact.java: A Plain Old Java Object (POJO) representing the data model.
Implementation.java: Contains the core business logic, including search algorithms and validation rules.
PhonebookDriver.java: The entry point of the application, handling the User Interface (UI) and menu navigation.

2.2. Validation Rules
The system enforces specific constraints on mobile numbers via the contactValidation method:
Length: Exactly 10 digits.
Starting Digit: Must begin with a digit between 6 and 9 (consistent with Indian mobile numbering standards).

2.3. Assumptions
Unique Identification: While searching is done by name or number, the system assigns a unique ID based on the current list size increment.
Case Sensitivity: Search by name is case-insensitive (e.g., "John" will match "john").
Input Formatting: The system assumes standard numeric input for IDs and phone numbers; non-numeric input in numeric fields may trigger a InputMismatchException.



3. Data Storage
Storage Type: In-Memory
Technology: The application uses a java.util.ArrayList to store Contact objects.
Persistence: Data is not persistent. All contact information is stored in the RAM while the program is running.
Lifecycle: Once the application is closed or the "Exit" option is selected, all stored contacts are cleared.
Note: This design makes the application lightweight and fast for testing purposes without requiring a database setup or file I/O permissions.



4.  Features
Add Contact: Automatically generates IDs.
Update Contact: Search by name and modify details.
Delete Contact: Remove specific entries from the list.
Search Contact: Dual-mode search (by Name or by Mobile Number).
View All: Clean, formatted output of all saved contacts.
