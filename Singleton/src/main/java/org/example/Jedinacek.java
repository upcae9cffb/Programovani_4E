package org.example;

import lombok.ToString;
import java.io.*;

@ToString
public class Jedinacek implements Serializable {
    private static final String FILE_PATH = "jedinacek.txt ";
    private static Jedinacek singletonInstance;
    private String stav;

    private Jedinacek() {
        stav = "novy";
    }

    public synchronized static Jedinacek getInstance() {
        if (singletonInstance == null) {
            // Zkusíme načíst objekt ze souboru
            singletonInstance = loadFromFile();
            if (singletonInstance == null) {
                // Pokud není uložený objekt, vytvoříme nový
                singletonInstance = new Jedinacek();
                saveToFile(singletonInstance);
            }
        }
        return singletonInstance;
    }

    public void setStav(String s) {
        stav = s;
        saveToFile(this); // Uložení po změně stavu
    }

    private static void saveToFile(Jedinacek instance) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(instance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Jedinacek loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (Jedinacek) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Pokud soubor neexistuje nebo je poškozen, vrátíme null
            return null;
        }
    }
}
