import java.util.ArrayList;

public class SwapFirstLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Before swap
        System.out.println("Before swap: " + list);

        // Swap first and last elements
        swapFirstLast(list);

        // After swap
        System.out.println("After swap: " + list);
    }

    public static void swapFirstLast(ArrayList<String> list) {
        if (list == null || list.size() <= 1) {
            return; // No swapping if the list is null or has 1 or fewer elements
        }

        String first = list.get(0);
        String last = list.get(list.size() - 1);

        // Swap the elements
        list.set(0, last);
        list.set(list.size() - 1, first);
    }
}