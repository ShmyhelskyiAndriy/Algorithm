import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[100];
        int [] outArray = new int[100];
        Util.filling(array);

        System.out.println(Arrays.toString(array));

        long time = System.currentTimeMillis();
        outArray = CountingSort.countSortWithNegatives(array);
        System.out.println(System.currentTimeMillis() - time);

        System.out.println(Arrays.toString(outArray));

    }
}
