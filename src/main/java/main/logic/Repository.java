package main.logic;

import java.io.*;
import java.util.*;

public interface Repository<T> {
    void outputList(ArrayList<T> t, File file);
    void outputList(ArrayList<T> t, String fileName);

    ArrayList<T> readList(File file);
    ArrayList<T> readList(String fileName);
}
