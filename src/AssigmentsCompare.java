import java.util.*;

public class AssigmentsCompare {

    public static void main(String[] args){

    List<Assignment> assignments = Arrays.asList(
            new Assignment(UUID.randomUUID(),1,"A1 Title","A1 description","easy" ),
            new Assignment(UUID.randomUUID(),6,"A6 Title","A6 description","hard"),
            new Assignment(UUID.randomUUID(),2,"A2 Title","A2 description","medium"),
            new Assignment(UUID.randomUUID(),5,"A5 Title","A5 description","medium"),
            new Assignment(UUID.randomUUID(),3,"A3 Title","A3 description","Hard"),
            new Assignment(UUID.randomUUID(),4,"A4 Title","A4 description","easy")
            );


    Collections.sort(assignments, new CourseNumberComparator()
                                      .thenComparing(new DifficultyLevelComparator()));
    System.out.println(assignments);

    Collections.sort(assignments, new AssignmentTitleComparator()
                                      .thenComparing(new CourseNumberComparator()));
    System.out.println(assignments);



    }}


