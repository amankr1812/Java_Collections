import java.util.HashMap;

public class MapCollectionTraversal {

    public static void main(String[] args){

        System.out.println("\nJava Map Collections And Traversal !!");

        // Hash Map

        HashMap<String,Integer> courseFees = new HashMap<>();

        courseFees.put("Core Java", 4500);
        courseFees.put("Android", 6000);
        courseFees.put("Spring", 3000);
        courseFees.put("Core Java", 7000); // Duplicate wont be added, 1st one will be replaced
        courseFees.put("Python", 7500);
        System.out.println("\nHash Map Details, Duplicate Removed");
        System.out.println(courseFees);

        // FOR EACH METHOD
        System.out.println("\n -----------------------------------------------");
        System.out.println("\n Traversing using For Each METHOD");
        courseFees.forEach((key,value)->{
            System.out.println(key + " -> " + value);
        });
    }
}
