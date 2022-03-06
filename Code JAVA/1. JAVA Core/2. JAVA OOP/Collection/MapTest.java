import java.util.*;

class HashMapTest extends CollectionTest {
    static public void updateHashMap(Map hash_map) {
        // Update an element of hash_map and print again
        System.out.println("HashMap before update: ");
        System.out.println(hash_map);

        hash_map.put(2, 23);

        System.out.println("HashMap after update: ");
        System.out.println(hash_map);
    }

    Map createHashMap() {
        Map<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Dien");
        hash_map.put(2, "24");
        hash_map.put(3, "e");
        return hash_map;
    }

    static public void iterateHashMap(Map hash_map) {
        System.out.println("Iterate Hashmap with for loop");
        Set<Integer> key_set = hash_map.keySet();
        for (Integer key : key_set) {
            System.out.println(key + "-" + hash_map.get(key));
        }

        System.out.println("Iterating HashMap with Map.Entry Interface and for loop");
        // phương thức này chỉ có thể sử dụng khi dùng kiểu khai báo có Generic
        Set entry_set = hash_map.entrySet();
        for (Object entry : entry_set) {

        }

        System.out.println("However, You can do this way for so fucking simple way.");
        System.out.println(hash_map);

        System.out.println("Iterate HashMap with iterator");
        Iterator itr = hash_map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(hash_map.get(itr.next()));
        }
    }

    @Override
    public void run() {
        Map hash_map = createHashMap();
        iterateHashMap(hash_map);
        updateHashMap(hash_map);
    }
}

class LinkedHashMapTest extends CollectionTest {
    public Map createLinkedHashMap() {
        Map<Integer, Engineer> linked_hashmap = new LinkedHashMap<Integer, Engineer>();
        // add elements to LinkedHashMap
        linked_hashmap.put(1, new Engineer("Dien", 24, "SW", "FPT"));
        linked_hashmap.put(null, new Engineer("Tuan", 27, "SW", "LG"));
        linked_hashmap.put(3, new Engineer("Dung", 20, "SW", "FPT"));
        linked_hashmap.put(4, null);
        return linked_hashmap;
    }

    static public void iterateLinkedHashMap(Map linked_hashmap) {
        Set<Map.Entry<Integer, Engineer>> entries = linked_hashmap.entrySet();
        for (Map.Entry entry : entries) {
//            Integer key = (Integer) entry.getKey();
//            Engineer value = (Engineer) entry.getValue();
            System.out.println(entry.getValue());
        }
    }

    @Override
    public void run() {
        Map linked_hashmap = createLinkedHashMap();
//        System.out.println(linked_hashmap);
        iterateLinkedHashMap(linked_hashmap);
    }
}

class TreeMapTest extends CollectionTest{
    public Map createTreeMap(){
        Map<Integer, Engineer> tree_map = new TreeMap();
        tree_map.put(1, new Engineer("Dien", 24, "SW", "FPT"));
        tree_map.put(3, new Engineer("Tuan", 27, "SW", "LG"));
        tree_map.put(2, new Engineer("Dung", 20, "SW", "FPT"));
        tree_map.put(4, null);
        return tree_map;
    }

    @Override
    public void run() {
        Map tree_map = createTreeMap();

        System.out.println(tree_map.get(1));
    }
}


