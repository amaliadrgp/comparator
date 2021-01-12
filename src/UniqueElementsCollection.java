import java.util.TreeSet;
import java.util.UUID;

public class UniqueElementsCollection {

    public static void main(String args[]){

        TreeSet<Assignment> uniques = new TreeSet<Assignment>();
        Assignment A1 = new Assignment(UUID.randomUUID(), 1,"A1 Title","A1 Description","easy");
        Assignment A2 = new Assignment(UUID.randomUUID(), 2,"A2 Title","A2 Description","medium");
        Assignment A3 = new Assignment(UUID.randomUUID(), 3,"A3 Title","A3 Description","hard");
uniques.add(A1);
uniques.add(A2);
uniques.add(A3);
    }

}
