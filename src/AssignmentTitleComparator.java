import java.util.Comparator;

public class AssignmentTitleComparator implements Comparator<Assignment> {
    @Override
    public int compare(Assignment o1, Assignment o2) {
        return o1.getAssignmentTitle().compareTo(o2.getAssignmentTitle());
    }
}
