import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int [] array = new int[10000];
        Util.filling(array);
        long time = System.currentTimeMillis();
        QuickSort.quickSortMid(array, 0, 10000);
        System.out.println(System.currentTimeMillis() - time);
        //System.out.println(Arrays.toString(array));

        int[] array2 = new int[10000];
        Util.filling(array2);

        time = System.currentTimeMillis();
        BubleSort.bubleSort(array2);
        System.out.println(System.currentTimeMillis() - time);

        ///////////////////////
        int[] array3 = new int[10000];
        Util.filling(array3);
        //System.out.println(Arrays.toString(array3));

        time = System.currentTimeMillis();
        QuickSort.quickSortRand(array3,0, 10000);
        System.out.println(System.currentTimeMillis() - time);


        int[] array244 = new int[10000];
        Util.filling(array244);

        time = System.currentTimeMillis();
        MergeSort.mergeSort(array244);
        System.out.println(System.currentTimeMillis() - time);

        System.out.println(Arrays.toString(array244));


        int[] array242 = new int[100];
        Util.filling(array242);

        MergeSort.mergeSSort(array242);


        System.out.println(Arrays.toString(array242));

    }
}
