package main.service;

import main.logic.Patient;
import main.logic.PatientRepository;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class PatientRepositoryBinaryImpl implements PatientRepository {
    @Override
    public void outputList(ArrayList<Patient> patients, File file){
        try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(file.toPath()))){
            out.writeObject(patients);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void outputList(ArrayList<Patient> patients, String fileName){
        File file = new File(fileName);
        outputList(patients, file);
    }

    @Override
    public ArrayList<Patient> readList(File file){
        try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(file.toPath()))){
            return (ArrayList<Patient>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Patient> readList(String fileName){
        File file = new File(fileName);
        return readList(file);
    }
}
