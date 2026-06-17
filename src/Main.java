public class Main {
    public static void main(String[] args) {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Get array elements
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get target value
        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        // Perform and display linearSearch Results
        System.out.println("Linear Search Result:");
        int linearResult = Algorithm.linearSearch(array, target);
        printResult(linearResult);

        // binarySearch Requirement: Array MUST be sorted
        // We sort a copy or the original array to assure correctness
        Arrays.sort(array);
        System.out.println("\n(Note: Array has been sorted for Binary Search)");

        // Perform and display binarySearch Results
        System.out.println("Binary Search Result:");
        int binaryResult = Algorithm.binarySearch(array, target);
        printResult(binaryResult);

        scanner.close();
    }

    /**
     * Helper method to cleanly format and display the search outcome.
     */
    private static void printResult(int index) {
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
