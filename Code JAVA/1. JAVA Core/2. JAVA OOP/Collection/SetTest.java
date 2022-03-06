import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class HashSetTest extends CollectionTest {
    @Override
    public void run() {
        //Create a Hash set
        Set h_set = new HashSet();
        h_set.add("Dien");
        h_set.add(24);
        h_set.add('d');
        h_set.add("Dien");

        //work with hash set
        h_set.remove('d');
    }
}

class TreeSetTest extends CollectionTest {
    @Override
    public void run() {
        // Create a tree set
        Set tree_set = new TreeSet();
        tree_set.add(1);
        tree_set.add(2);
        tree_set.add(4);
        tree_set.add(3);
        System.out.println(tree_set);
//        int example[] = {1,2,4,3};
//        List example2 = new ArrayList<>();
//        example2 = Arrays.asList(example);
//        tree_set.addAll(example2);
    }
}