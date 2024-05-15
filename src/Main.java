import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[15];

        Util.filling(array);
//
//        System.out.println("Unsorted array:");
//        System.out.println(Arrays.toString(array.clone()));
//
//        long time;
//
//        // Сортування з опорою на останній елемент
//        time = System.currentTimeMillis();
//        int [] arrayLast = array.clone();
//        QuickSort.quickSortLast(arrayLast, 0, array.length - 1);
//        System.out.println("\nСортування з опорою на останній елемент: \n" + "Час: " + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(arrayLast));
//
//
//        // Сортування з опорою на середній елемент
//        time = System.currentTimeMillis();
//        int [] arrayMid = array.clone();
//        QuickSort.quickSortMid(arrayMid, 0, array.length - 1);
//        System.out.println("\nСортування з опорою на середній елемент: \n" + "Час: " + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(arrayMid));
//
//        // Сортування з опорою на випадковий елемент
//        time = System.currentTimeMillis();
//        int [] arrayRand = array.clone();
//        QuickSort.quickSortRan(arrayRand, 0, array.length - 1);
//        System.out.println("\nСортування з опорою на випадковий елементт: \n" + "Час: " + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(arrayRand));




        Tree<Integer> tree = new Tree<>();

        tree.insertElement(10);
        tree.insertElement(4);
        tree.insertElement(16);
        tree.insertElement(8);
        tree.insertElement(6);
        tree.insertElement(1);
        tree.insertElement(3);
        tree.insertElement(2);
        tree.insertElement(12);
        tree.insertElement(0);
        tree.insertElement(20);
        tree.insertElement(30);
        tree.insertElement(11);
        tree.insertElement(11);
        tree.insertElement(13);
        tree.printTree();
        tree.deleteNode(10);
        tree.printTree();
    }


}

