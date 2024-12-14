import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Compare by age
        int ageComparison = Integer.compare(v1.getAge(), v2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        // If age is the same, compare by name
        return v1.getName().compareTo(v2.getName());
    }
}