public class BinarySort extends Util {    public static int[] binarySort(int[] array){        for (int left = 1; left < array.length; left++) {            int key = array[left];            if (array[left-1]>array[left]) {                int leftIndex =0;                int rightIndex=left-1;                do{                    int ser = (leftIndex + rightIndex)/2;                    if(array[ser] < key) {                        leftIndex =ser +1;                    } else {                        rightIndex = ser;                    }                } while(leftIndex < rightIndex);                for (int j=left-1; j>=leftIndex; j--)                    array[j+1]=array[j];                array[leftIndex] = key;            }        }        return array;    }    public static int[] binarySortNeg(int[] array){        for (int left = 1; left < array.length; left++) {            int key = array[left];            if (array[left-1]<array[left]) {                int leftIndex =0;                int rightIndex=left-1;                do{                    int ser = (leftIndex + rightIndex)/2;                    if(array[ser] > key) {                        leftIndex =ser +1;                    } else {                        rightIndex = ser;                    }                } while(leftIndex < rightIndex);                for (int j=left-1; j>=leftIndex; j--)                    array[j+1]=array[j];                array[leftIndex] = key;            }        }        return array;    }}