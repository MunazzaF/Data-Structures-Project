//insertion algorithm
public class InsertionSort {
     static int[] SelectionSort(int[] a, int num) {//requires array and an integer
         int[] aSorted = new int[a.length];//gets length value

         for (int i = 0; i < num; i++) {
             int position = a[i];//marks position of elements
             int value = i - 1;//reduces the value of index

             while (value >= 0 && a[value] > position) {
                 a[value + 1] = a[value];//checks position and assigns into the value array
                 value--;//count is decremented
             }
             a[value + 1] = position;//the new array value is the position
         }
         return a;//return array
     }
}
