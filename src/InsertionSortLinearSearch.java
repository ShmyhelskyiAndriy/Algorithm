public class InsertionSortLinearSearch extends Util{    public static int[] linearSort(int[] array){        for(int left = 1; left< array.length; left++){            int value = array[left];            int i = left - 1;            for(; i >= 0; i--){                if(value < array[i]){                    array[i+1] = array[i];                }else{                    break;                }            }array[i+1] = value;        }        return array;    }    public static int[] linearSortNeg(int[] array){        for(int left = 1; left< array.length; left++){            int value = array[left];            int i = left - 1;            for(; i >= 0; i--){                if(value > array[i]){                    array[i+1] = array[i];                }else{                    break;                }            }array[i+1] = value;        }        return array;    }}