public class Runner
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 10);
        }
        mergeSort.mergeSort(array);
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
