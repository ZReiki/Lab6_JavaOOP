package main.service;

import main.logic.Patient;

import java.util.*;

public class PatientService {
    public List<Patient> listOfPatientsWithTheSpecifiedDiagnosis(List<Patient> patients, String diagnosis){
        var resultList = new ArrayList<Patient>();
        for (Patient patient : patients){
            if(patient.getMedicalDiagnosis().equals(diagnosis)){
                resultList.add(patient);
            }
        }
        return resultList;
    }

    public List<Patient> listOfPatientsWhoseMedicalRecordNumberIsWithinTheSpecifiedInterval(List<Patient> patients, int minInterval, int maxInterval){
        var resultList = new ArrayList<Patient>();
        for (Patient patient : patients){
            if(patient.getMedicalRecordNumber() >= minInterval && patient.getMedicalRecordNumber() <= maxInterval){
                resultList.add(patient);
            }
        }
        return resultList;
    }

    public List<Patient> quantityAndListOfPatientsWhosePhoneNumberBeginsWithTheSpecifiedDigit(List<Patient> patients, String phoneNumberDigit){
        var resultList = new ArrayList<Patient>();
        for (Patient patient : patients){
            String phoneNumberFirstDigit = patient.getPhoneNumber().substring(4, 5);
            if(phoneNumberDigit.equals(phoneNumberFirstDigit)){
                resultList.add(patient);
            }
        }
        return resultList;
    }

    //Список пацієнтів у порядку спадання кількості візитів у поточному році. Якщо вона
    //однакова - за зростанням номерів медичної картки.

    public List<Patient> listOfPatientsByCurrentYearVisitCount(List<Patient> patients){
        List<Patient> t = new ArrayList<>(patients);
        t.sort(new Comparator<>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                int t = Integer.compare(o2.getCurrentYearVisitCount(), o1.getCurrentYearVisitCount());
                if(t != 0){
                    return t;
                }
                return Integer.compare(o1.getMedicalRecordNumber(), o2.getMedicalRecordNumber());
            }
        });
        return t;
    }

    public int findPatientByName(List<Patient> patients, String name){
        for(Patient patient : patients){
            if(name.compareTo(patient.getFullName()) == 0){
                return patient.getMedicalRecordNumber();
            }
        }
        return -1;
    }
}
