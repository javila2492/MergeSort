public class mergeSort
{
    public static void mergeSort(int[] arr)
    {
        int a = arr.length;
        int[] temp = new int[a];
        mergeSortHelper(arr, 0, a - 1, temp);
    }

    private static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, left + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        for(int i = left; i < mid; i++)
        {
            if (arr[i] > arr[mid + i - 1])
            {
                int a = arr[i];
                int b = arr[mid + i];
                arr[i] = b;
                arr[mid + i] = a;
            }
        }
    }
}
