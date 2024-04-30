import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[10];

        Util.filling(array);
//        Util.filling(outArray);
        int [] outArray = Arrays.copyOf(array,array.length);

//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(outArray));


        long time = System.currentTimeMillis();
        QuickSort.quickSortMid(array,1,10);
        System.out.println("Quick:" + (System.currentTimeMillis() - time));
        System.out.println(Arrays.toString(array));








//        System.out.println(Arrays.toString(CountingSort.countSortWithNegatives(array)));


//        SelectionSort.selecSort(array);
//
//        BubbleSort.bubbleSort(outArray);

//        time = System.currentTimeMillis();
//        QuickSort.quickSortMid(array, 0, array.length - 1);
////        System.out.println(Arrays.toString(array));
//        System.out.println("mid:" + (System.currentTimeMillis() - time));
//
//
//        long time = System.currentTimeMillis();
//        QuickSort.quickSortMid(outArray, 0, array.length - 1);
//        System.out.println(Arrays.toString(outArray));
//        System.out.println("rand:" + (System.currentTimeMillis() - time));

//        System.out.println(Arrays.toString(CountingSort.countSortWithNegatives(array)));

    }
}
