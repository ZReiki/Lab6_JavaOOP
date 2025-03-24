package main.factory;

import main.logic.Patient;

import java.util.ArrayList;

public class PatientFactory {
    public static ArrayList<Patient> createPatient(){
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "Petrenko Oleksandr Ivanovych", "15 Khreshchatyk St., Kyiv, Ukraine",
            "+380671234567", 202401, "Hypertension", "10.12.2024", 4));
        patients.add(new Patient(2, "Kovalchuk Maryna Serhiivna", "10 Doroshenko St., Lviv, Ukraine",
                "+380931112233", 202402, "Bronchial asthma", "04.11.2024", 2));
        patients.add(new Patient(3, "Ivanenko Andrii Vasylovych", "5 Deribasovskaya St., Odesa, Ukraine",
                "+380503332211", 202403, "Gastric ulcer", "20.01.2025", 3));
        patients.add(new Patient(4, "Vasilenko Natalia Petrovna", "22 Sumska St., Kharkiv, Ukraine",
                "+380671234890", 202404, "Type 2 diabetes mellitus", "24.02.2025", 9));
        patients.add(new Patient(5, "Melnyk Volodymyr Hryhorovych", "30, Dmytro Yavornytskyi ave.",
                "+380951112244", 202405, "Osteochondrosis of the cervical spine", "02.03.2025", 9));
        return patients;
    }
}
