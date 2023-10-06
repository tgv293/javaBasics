import java.util.*;

public class Phonebook2 {
    Vector vector;

    Phonebook2() {
        vector = new Vector();
    }

    public void setEntry(String n, int t) {
        vector.add(new Entry(n, t));

    }

    public int getNumber(String n) {
        for (int i = 0; i < vector.size(); i++) {
            Entry e = (Entry) vector.elementAt(i);
            if (e.getName().equals(n)) {
                return e.getNumber(); //found and return
            }
        }
        return -1;  //it reaches this line if name wasnt there
    }

    public boolean deleteNumber(String n) {
        for (int i = 0; i < vector.size(); i++) {
            Entry e = (Entry) vector.elementAt(i);
            if (e.getName().equals(n)) {
                vector.remove(i); //found remove and return
                return true;
            }
        }
        return false;  //it reaches this line if name wasnt there
    }

    public int changeNumber(String name, int number) {
        for (int i = 0; i < vector.size(); i++) {
            Entry e = (Entry) vector.elementAt(i);
            if (e.getName().equals(name)) {
                e.setNumber(number);
                return 0;
            }
        }
        return -1;
    }

    public int deleteEntry(String name) {
        for (int i = 0; i < vector.size(); i++) {
            Entry e = (Entry) vector.elementAt(i);
            if (e.getName().equals(name)) {
                vector.remove(i);
                return 0;
            }
        }
        return -1;
    }

}

class Entry {
    private String name;
    private int number;

    Entry(String s, int n) {
        name = s;
        number = n;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}