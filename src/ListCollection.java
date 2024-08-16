import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListCollection {

    public static void main(String[] args){

        System.out.println("Java List Collections !!");

        /*
        Creating Collections, 2 ways
        1. Type Safe - same type of elements are added
        2. Non Type Safe - different types of elements can be added
        */

        // ARRAY LIST & LINKED LIST

        // Type Safe
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Aryan");
        names.add("Aman"); // Adding duplicate value
        names.add("Mayank");
        System.out.println("\n Type safe list - ArrayList");
        System.out.println(names);

        names.remove("Aman");
        System.out.println("\n Removed Aman from names");
        System.out.println(names);

        // Non Type Safe
        LinkedList list = new LinkedList();
        list.add("Aman");
        list.add(123);
        list.add(100.123);
        list.add(123); // Adding duplicate value
        list.add(true);
        System.out.println("\n Non Type safe list - Linked List");
        System.out.println(list);

        list.remove(2);
        System.out.println("\n Removed index 2 from list");
        System.out.println(list);

        // VECTOR

        Vector<String> vector = new Vector<>();
        vector.add("Aman");
        System.out.println("\n Vector");
        System.out.println(vector);

        // Adding names collection to vector
        System.out.println("\n Names Added To Vector");
        vector.addAll(names);
        System.out.println(vector);


    }
}
