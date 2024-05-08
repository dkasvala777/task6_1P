package sit707_week6;

public class ConditionalLoops {
	// Function with a simple conditional loop (for loop)
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function with a conditional loop and a conditional statement inside the loop
    public static boolean containsNumber(int[] numbers, int target) {
        for (int num : numbers) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
