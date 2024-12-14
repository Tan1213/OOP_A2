import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {

    private String rideName;
    private Employee operator;
    private int minHeight;
    private Queue<Visitor> queue = new LinkedList<>();
    private LinkedList<Visitor> history = new LinkedList<>();
    private int maxRider;
    private int numOfCycles;

    public Ride() {
        this.rideName = "Unknown";
        this.operator = null;
        this.minHeight = 0;
        this.queue = new LinkedList<>();
        this.history = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    public Ride(String rideName) {
        this.rideName = rideName;
    }

    public Ride(String rideName, Employee operator, int minHeight, int maxRider) {
        this.rideName = rideName;
        this.operator = operator;
        this.minHeight = minHeight;
        this.queue = new LinkedList<>();
        this.history = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = 0;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println("Visitor " + visitor.getName() + " has joined the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            queue.poll();
            System.out.println("Visitor has left the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue:");
            for (Visitor visitor : queue) {
                System.out.println(visitor.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned to the ride.");
        } else if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = 0; i < maxRider; i++) {
                Visitor visitor = queue.poll();
                addVisitorToHistory(visitor);
                System.out.println("Visitor " + visitor.getName() + " has taken the ride.");
            }
            numOfCycles++;
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        history.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return history.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return history.size();
    }

    @Override
    public void printRideHistory() {
        if (history.isEmpty()) {
            System.out.println("No visitors have taken the ride.");
        } else {
            System.out.println("Ride history:");
            for (Visitor visitor : history) {
                System.out.println(visitor.getName());
            }
        }
    }

    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : history) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getMembershipType());
                writer.newLine();
            }
            System.out.println("Ride history exported to " + filename);
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
    }

    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    String membershipType = parts[2];
                    Visitor visitor = new Visitor(name, "Unknown", age, "Unknown", membershipType);
                    addVisitorToHistory(visitor);
                } else {
                    System.out.println("Invalid line in file: " + line);
                }
            }
            System.out.println("Ride history imported from " + filename);
        } catch (IOException e) {
            System.out.println("Error importing ride history: " + e.getMessage());
        }
    }

    public void sortRideHistory() {


        Comparator<Visitor> comparator = new Comparator<Visitor>() {

            @Override
            public int compare(Visitor v1, Visitor v2) {

                return v1.getName().compareTo(v2.getName());

            }

        };

    }


}
