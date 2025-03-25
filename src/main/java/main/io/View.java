package main.io;

import main.logic.Patient;
import java.util.*;

public class View {
    public void showPatient(List<Patient> patients) {
        if (!patients.isEmpty()) {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }else{
            System.out.println("There are no patients with this information.");
        }
    }

    public void printer(String description){
        System.out.print(description);
    }

    public void printerIndividualInfo(String description, int value){
        if(value != -1) System.out.println(description + value);
        else System.out.println("There are no patient with this name.");
    }
}