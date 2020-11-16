//selection sort & insertion sort algorithm
public class SelectionSort {
    static int[] SelectionSort(int[] a, int length) {//requires array and length of array
        for (int i = 0; i < length - 1; i++) {
            int temp = a[0];//store temp value
            for (int j = 0; j < length; j++) {
                if (a[j] < temp) {//check if element is less than temp value
                    temp = a[j];
                }
            }
            //swap
            temp = a[i];
            a[i] = temp;
        }

        return a;//return array
    }
}
