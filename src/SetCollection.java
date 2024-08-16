import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {

    public static void main(String[] args){

        System.out.println("Java Set Collections !!");

        // HASH SET

        HashSet<Double> hashset = new HashSet<>();
        hashset.add(100.123);
        hashset.add(50.123);
        hashset.add(99.9);
        hashset.add(100.123); // This wont be printed because duplicate not allowed
        hashset.add(4.9);
        System.out.println("\n Hashset");
        System.out.println(hashset);

        // TREE SET

        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(hashset);
        System.out.println("\n TreeSet - Content will be sorted");
        System.out.println(treeSet);

    }
}
