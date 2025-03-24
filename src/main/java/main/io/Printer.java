package main.io;

public class Printer {
    public void menuOptions() {
        System.out.print("""
                    Menu:
                    1. List of Patients with the specified diagnosis;
                    2. List of Patients whose medical record number is within the specified interval;
                    3. Quantity and list of Patients whose phone number begins with the specified digit
                    4. The list of patients in descending order of the number of visits in the
                    current year. If it is the same, in ascending order of medical record numbers.
                    5. Patient's medical record number by name.
                    6. Files operations.
                    0. Exit
                    Your option >>\s""");
    }

    public void menuFileManagement(){
        System.out.print("""
                Files menu:
                1. Write the list of Patients in the txt file;
                2. Read the list of Patients from the txt file;
                3. Write the list of Patients in the binary file;
                4. Read the list of Patients from the binary file;
                5. Write the list of Patients in the JSON file;
                6. Read the list of Patients from the JSON file;
                7. Back <-
                Your option >>\s""");
    }
}
