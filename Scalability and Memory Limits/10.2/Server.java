import java.util.HashMap;

public class Server {

    HashMap<Integer, Machine> machines = new HashMap<Integer, Machine>();
    HashMap<Integer, Integer> personToMachineMap = new HashMap<Integer, Integer>();

    public Machine getMachineWithID(int machineID) {
        return machines.get(machineID);
    }

    public int getMachineIDForUser(int personID) {
        Integer machineID = personToMachineMap.get(personID);
        return machineID == null ? -1 : machineID;
    }


    public Person getPersonWithID(int personID) {
        Integer machineID = getMachineIDForUser(personID);
        if (machineID == null) return null;

        Machine machine = getMachineWithID(machineID);
        if (machine == null) return null;

        return machine.getPersonWithID(personID);
    }
}
