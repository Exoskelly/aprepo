public class prog460a {
    public static int LinearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.lentgh - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else    
                high = mid - 1;
        }
        return -1;
    }

    public static binarySearch(int[] arr, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        else if(arr[mid] > x) binarySearchRec(arr, x, low, mid-1);
        return binarySearchRec(arr, x, mid-1, high);
    }
}
