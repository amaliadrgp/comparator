import java.util.Comparator;
import java.util.UUID;

public class Assignment {
private UUID uniqueId = UUID.randomUUID();
private int courseNumber;
private String assignmentTitle;
private String assignmentDescription;
public  String difficultyLevel;

   public Assignment(UUID uniqueId, int courseNumber, String assignmentTitle, String assignmentDescription, String difficultyLevel){

       this.uniqueId = uniqueId;
       this.courseNumber = courseNumber;
       this.assignmentTitle = assignmentTitle;
       this.assignmentDescription = assignmentDescription;
       this.difficultyLevel = difficultyLevel;
   }

   public String toString(){
       return "\nAssignment [id=" + uniqueId + ", Assignment Title=" + assignmentTitle + ", courseNumber=" + courseNumber + ", difficulty level=" + difficultyLevel + "]";
   }
   public UUID getUniqueId(){ return uniqueId; }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}





