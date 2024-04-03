import java.util.Random;public class Util {    public static void swap(int[] array, int ind1, int ind2){        int tmp=array[ind1];        array[ind1]=array[ind2];        array[ind2]=tmp;    }    static int partition(int[] arr, int low, int high) {        int pivot = arr[high];        int i = (low - 1);        for (int j = low; j < high; j++) {            if (arr[j] < pivot) {                i++;                int temp = arr[i];                arr[i] = arr[j];                arr[j] = temp;            }        }        int temp = arr[i + 1];        arr[i + 1] = arr[high];        arr[high] = temp;        return i + 1;    }    static void filling(int[] arr){        Random random = new Random();        for (int i = 0; i < arr.length; i++) {        int randNum = random.nextInt(100)-200;        arr[i] = randNum;        }    }    static int randOp(int startLim, int stopLim){        Random random = new Random();        return random.nextInt(stopLim-startLim) + 1 + startLim;    }    static void merge(int[] arr, int[] arrLeft, int[] arrRight){        int i = 0;        int j = 0;        int id = 0;        while (i < arrLeft.length && j < arrRight.length) {            if (arrLeft[i] < arrRight[j]) {                arr[id] = arrLeft[i];                i++;            } else {                arr[id] = arrRight[j];                j++;            }            id++;        }        while (i < arrLeft.length) {            arr[id] = arrLeft[i];            i++;            id++;        }        while (j < arrRight.length) {            arr[id] = arrRight[j];            j++;            id++;        }    }        static void mergeNeg(int[] arr, int[] arrLeft, int[] arrRight){            int i = 0, j = 0, idx = 0;            while (i <  arrLeft.length && j < arrRight.length) {                if ( arrLeft[i] >=arrRight[j]) {                    arr[idx] = arrLeft[i];                    i++;                } else {                    arr[idx] = arrRight[j];                    j++;                }                idx++;            }            while (i < arrLeft.length) {                arr[idx] =  arrLeft[i];                i++;                idx++;            }            while (j <arrRight.length) {                arr[idx] = arrRight[j];                j++;                idx++;            }        }        static int maxFrom(int[] arr){            int max = 0;            for (int i : arr) {                if (i >= max) {                    max = i;                }            }            return max;        }}