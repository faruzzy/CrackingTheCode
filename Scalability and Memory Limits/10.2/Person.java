import java.util.HashMap;
import java.util.ArrayList;

public class Person {

    private ArrayList<Integer> friendIDs;
    private int personID;

    public Person(int id) { this.personID = id; }

    public int getID() { return personID; }

    public void addFriend(int id) { friendIDs.add(id); }

}
