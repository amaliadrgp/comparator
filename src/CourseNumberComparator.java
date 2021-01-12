import java.util.Comparator;

public class CourseNumberComparator implements Comparator<Assignment> {

    @Override
    public int compare(Assignment o1, Assignment o2) {
        Integer int1 = new Integer(1);
        return Integer.compare(o1.getCourseNumber(),o2.getCourseNumber());
    }}

