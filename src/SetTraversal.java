import java.util.TreeSet;

public class SetTraversal {

    public static void main(String[] args){

        System.out.println("\n Set Traversal Examples !!");

        // Adding Tree Set

        TreeSet<String> names = new TreeSet<>();
        names.add("Aman");
        names.add("Aryan");
        names.add("Aman"); // Adding duplicate value, wont be displayed
        names.add("Mayank");
        System.out.println("\n Tree Set Details, Duplicate Already Removed");
        System.out.println(names);

        // For Each METHOD
        System.out.println("\n -----------------------------------------------");
        System.out.println("\n Traversing using For Each METHOD");

        names.forEach(str->{
            System.out.println(str);
        });
    }
}
