import java.util.Comparator;

public class DifficultyLevelComparator implements Comparator<Assignment>
{
    public int compare(Assignment o1, Assignment o2)
    {
        return o1.getDifficultyLevel().compareTo(o2.getDifficultyLevel());
    }
}
