Sender-Receiver Information App
This Android project is a simple Sender-Receiver Information App that allows users to input and review sender and receiver details in a well-structured form layout. The app consists of multiple screens for user data collection, validation, and review, all while maintaining a clean and consistent UI.

Features:
Splash Screen: A splash screen displayed when the app is launched, showing the app's logo.
Sender Details Form: A screen for entering the sender's information including email, full name, contact info, country, and address. All fields are validated to ensure no field is left blank.
Receiver Details Form: Similar to the sender form, this screen collects information about the receiver, including their email, full name, contact info, country, and address.
Review Information Screen: A summary screen that displays both sender and receiver details, with a navigation arrow indicating the information flow.
Floating Action Button (FAB): A FAB button on the review screen allows users to go back to the sender details form for editing.
Form Validation: The app ensures that no fields are left blank before proceeding between screens, enhancing data integrity.
Technologies Used:
Java: Core logic and activities.
XML: UI design and layout of the app.
Android Studio: Primary development environment.
Material Design: Used for Floating Action Button (FAB) and other design elements.
Intents: Data passed between activities.
Project Structure:
MainActivity.java: Contains the splash screen and the logic for navigating to the sender form.
SenderActivity.java: Handles the sender form UI and data validation.
ReceiverActivity.java: Handles the receiver form UI and data validation.
ReviewInformationActivity.java: Displays the collected sender and receiver information.
XML Layouts: Defined for each activity, including forms and review screens, using ConstraintLayout and TableLayout.
Getting Started:
To run this project, follow these steps:

Clone this repository to your local machine.
Open the project in Android Studio.
Run the project on an Android device or emulator.
