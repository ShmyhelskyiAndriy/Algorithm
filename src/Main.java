public class Main {
    public static void main(String[] args) {

        int [] array = new int[1000000];

        Util.filling(array);

        System.out.println("Unsorted array:");
//        System.out.println(Arrays.toString(array.clone()));

        long time;

        // Сортування з опорою на останній елемент
        time = System.currentTimeMillis();
        int [] arrayLast = array.clone();
        QuickSort.quickSortLast(arrayLast, 0, array.length - 1);
        System.out.println("\nСортування з опорою на останній елемент: \n" + "час" + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(arrayLast));


        // Сортування з опорою на середній елемент
        time = System.currentTimeMillis();
        int [] arrayMid = array.clone();
        QuickSort.quickSortMid(arrayMid, 0, array.length - 1);
        System.out.println("\nСортування з опорою на середній елемент: \n" + "час" + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(arrayMid));

        // Сортування з опорою на випадковий елемент
        time = System.currentTimeMillis();
        int [] arrayRand = array.clone();
        QuickSort.quickSortRandom(arrayRand, 0, array.length - 1);
        System.out.println("\nСортування з опорою на випадковий елементт: \n" + "час" + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(arrayRand));



//        Queue<Integer> queue = new Queue<>();
//        queue.enqueue(40);
//        queue.enqueue(30);
//        queue.enqueue(10);
//        queue.enqueue(50);
//        queue.show();
//        queue.dequeue();
//        queue.show();
//
//



//        Stack<Integer> stack = new Stack<>();
//        stack.push(55);
//        stack.push(10);
//        stack.push(155);
//        stack.push(206);
//        stack.show();
//        while(!stack.isEmpty()) {
//            stack.pop();
//        }
//        System.out.println();
//        stack.show();
//        stack.add(55);
//        stack.add(10);
//        stack.add(155);
//        stack.add(206);
//        stack.show();






//        Tree<Integer> tree = new Tree<>();
//
//        tree.insertElement(10);
//        tree.insertElement(4);
//        tree.insertElement(16);
//        tree.insertElement(8);
//        tree.insertElement(6);
//        tree.insertElement(1);
//        tree.insertElement(3);
//        tree.insertElement(2);
//        tree.insertElement(12);
//        tree.insertElement(0);
//        tree.insertElement(20);
//        tree.insertElement(30);
//        tree.insertElement(11);
//        tree.insertElement(13);
//        tree.printTree();
//        tree.deleteNode(10);
//        tree.printTree();
    }


}

