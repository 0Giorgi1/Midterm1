package midterm.giorgi_kitiashvili_2.task3;

import java.util.ArrayList;
import java.util.List;

public class CowFarm {
    private final List<Cow> storage;

    public CowFarm() {
        this.storage = new ArrayList<>();
    }

    public void addCow(Cow cow) {
        storage.add(cow);
    }

    public boolean removeCow(Cow cow) {
        return storage.remove(cow);
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The farm is empty");
        } else {
            System.out.println("Cows in the farm:");
            for (Cow c : storage) {
                System.out.println(c.toString());
            }
        }
    }
}