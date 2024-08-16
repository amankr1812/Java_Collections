import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTraversal {

    public static void main(String[] args){

        System.out.println("\n Traversal Examples !!");

        // Array List declaration & traversal

        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Aryan");
        names.add("Aman"); // Adding duplicate value
        names.add("Mayank");
        System.out.println("\n Arraylist Details");
        System.out.println(names);

        //For Each LOOP
        System.out.println("\n Traversing using For Each LOOP");
        for(String name : names){
            System.out.println(name);
        }

        // Iterator
        System.out.println("\n -----------------------------------------------");
        System.out.println("\n Traversing using Iterator (Only Forward Traversing)");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        // List Iterator
        System.out.println("\n -----------------------------------------------");
        System.out.println("\n Traversing using List Iterator (Backward Traversing)");

        ListIterator<String> listItr = names.listIterator(names.size());

        while (listItr.hasPrevious()){
            String str = listItr.previous();
            System.out.println(str);
        }

        // For Each METHOD
        System.out.println("\n -----------------------------------------------");
        System.out.println("\n Traversing using For Each METHOD");

        names.forEach(str->{
            System.out.println(str);
        });


    }
}
