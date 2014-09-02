import java.util.HashMap;
import java.util.ArrayList;

public class Machine {

    public int machineID;
    public HashMap<Integer, Person> persons = new HashMap<Integer, Person>();

    public Person getPersonWithID(int personID) {
        return persons.get(personID);
    }
}
