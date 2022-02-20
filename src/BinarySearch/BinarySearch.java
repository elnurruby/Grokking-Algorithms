package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int num) {
        var low = 0;
        var high = arr.length - 1;
        while (low <= high) {
            var midIndex = low + (high-low)/2;
            var guess = arr[midIndex];
            if (guess == num)
                return midIndex;
            else if (guess > num)
                high = midIndex - 1;
            else
                low = midIndex + 1;
        }
        return -1;
    }
}
