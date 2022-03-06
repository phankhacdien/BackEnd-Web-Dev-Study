import java.util.*;

class ListTest extends CollectionTest{
    @Override
    public void run() {
        // Create a list
        List lst = new ArrayList();
        lst.add("Dien");
        lst.add(24);
        lst.add('a');

        //Traversing list through iterator
        Iterator arr_itr = lst.iterator();  //current index when initialize is 0
        while (arr_itr.hasNext()) {
            System.out.println(arr_itr.next());
        }
        /*
        - ArrayList can contain multiple data types at the same time.
        - Don't have to initialize the list data type and number of elements.
        */
    }
}

class VectorTest extends CollectionTest{
    @Override
    public void run() {
        // Create a vector
        Vector vec = new Vector();
        vec.add("Dien");
        vec.add(24);
        vec.add('b');
        System.out.println(vec.get(1));

        Iterator vec_itr = vec.iterator();
        while (vec_itr.hasNext()) {
            System.out.println(vec_itr.next());
        }
    }
}

class StackTest extends CollectionTest{
    public void run (){
        // Create a Stack
        Stack stk = new Stack();
        stk.push("Dien");
        stk.push(24);
        stk.push('c');

        System.out.println(stk.get(1));
    }
}
