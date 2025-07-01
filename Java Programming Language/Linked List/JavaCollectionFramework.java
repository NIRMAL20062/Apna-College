import java.util.*;
import java.util.concurrent.*;

public class JavaCollectionFramework {
    public static void main(String[] args) {

        // ===== LIST IMPLEMENTATIONS =====
        System.out.println("===== LIST =====");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("ArrayList");
        arrayList.add("Java");
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("LinkedList");
        linkedList.add("DSA");
        System.out.println("LinkedList: " + linkedList);

        List<String> vector = new Vector<>();
        vector.add("Vector");
        vector.add("Legacy");
        System.out.println("Vector: " + vector);

        Stack<String> stack = new Stack<>();
        stack.push("Stack");
        stack.push("LIFO");
        System.out.println("Stack (pop): " + stack.pop());

        // ===== SET IMPLEMENTATIONS =====
        System.out.println("\n===== SET =====");
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(10, 20, 30));
        System.out.println("HashSet (Unordered): " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(10, 20, 30));
        System.out.println("LinkedHashSet (Ordered): " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(20, 10, 30));
        System.out.println("TreeSet (Sorted): " + treeSet);

        // ===== QUEUE IMPLEMENTATIONS =====
        System.out.println("\n===== QUEUE =====");
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("B"); priorityQueue.add("A"); priorityQueue.add("C");
        System.out.println("PriorityQueue: " + priorityQueue);

        Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("First");
        arrayDeque.add("Second");
        System.out.println("ArrayDeque (FIFO): " + arrayDeque);

        Queue<String> linkedQueue = new java.util.LinkedList<>();
        linkedQueue.offer("One");
        linkedQueue.offer("Two");
        System.out.println("LinkedList as Queue: " + linkedQueue);

        // ===== MAP IMPLEMENTATIONS =====
        System.out.println("\n===== MAP =====");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        System.out.println("TreeMap: " + treeMap);

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        System.out.println("Hashtable: " + hashtable);

        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Thread");
        concurrentHashMap.put(2, "Safe");
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);

        // ===== DEQUE IMPLEMENTATIONS =====
        System.out.println("\n===== DEQUE =====");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);

        // ===== NAVIGABLESET =====
        System.out.println("\n===== NAVIGABLESET =====");
        NavigableSet<Integer> navSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Lower than 25: " + navSet.lower(25));

        // ===== NAVIGABLEMAP =====
        System.out.println("\n===== NAVIGABLEMAP =====");
        NavigableMap<Integer, String> navMap = new TreeMap<>();
        navMap.put(1, "One");
        navMap.put(3, "Three");
        navMap.put(2, "Two");
        System.out.println("NavigableMap: " + navMap);
        System.out.println("Ceiling Entry for key 2: " + navMap.ceilingEntry(2));
    }
}
