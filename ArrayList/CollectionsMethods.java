import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {
        // Initial List
        List<String> list = new ArrayList<>(Arrays.asList("Bardx", "GPT", "Java", "DeepSeek", "MSI"));

        // 1️⃣ sort()
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder()); // Sorting in reverse order

        //  Comparators - a type of function that defines a custom order
        System.out.println("Sorted List: " + list);

        // 2️⃣ reverse()
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 3️⃣ shuffle()
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // 4️⃣ swap()
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("Swapped List (first and last): " + list);

        // 5️⃣ fill()
        Collections.fill(list, "Filled");
        System.out.println("Filled List: " + list);

        // Reinitialize list for further examples
        list = new ArrayList<>(Arrays.asList("Bardx", "GPT", "Java", "GPT", "Bardx"));

        // 6️⃣ copy()
        List<String> dest = new ArrayList<>(Arrays.asList(new String[list.size()])); // Empty list with same size
        Collections.copy(dest, list);
        System.out.println("Copied List: " + dest);

        // 7️⃣ binarySearch() — requires sorted list
        Collections.sort(list);
        int index = Collections.binarySearch(list, "Java");
        System.out.println("Index of 'Java': " + index);

        // 8️⃣ max() / min()
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println("Max: " + max + ", Min: " + min);

        // 9️⃣ frequency()
        int freq = Collections.frequency(list, "GPT");
        System.out.println("Frequency of 'GPT': " + freq);

        // 🔟 replaceAll()
        Collections.replaceAll(list, "GPT", "AI");
        System.out.println("After replaceAll(): " + list);

        // 🔟🔟 unmodifiableList()
        List<String> unmodifiable = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiable);
        // unmodifiable.add("New"); // Uncomment to see runtime exception

        // 🔟🔟🔟 synchronizedList()
        List<String> syncList = Collections.synchronizedList(list);
        System.out.println("Synchronized List: " + syncList);

        // 🔟🔟🔟🔟 singletonList()
        List<String> singleton = Collections.singletonList("OnlyBardx");
        System.out.println("Singleton List: " + singleton);

        // 🔟🔟🔟🔟🔟 emptyList()
        List<String> empty = Collections.emptyList();
        System.out.println("Empty List: " + empty);
    }
}