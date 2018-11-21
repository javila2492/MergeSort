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
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }
}
