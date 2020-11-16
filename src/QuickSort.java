//quicksort algorithm
public class QuickSort {
     int[] QuickSort(int[] a, int start, int end) {
        if (start < end){//check start and compare to end integers
            int index= start-1;//get index value
            int value;
            for (int i=start; i<end; i++){
                if (a[i]< a[end]){//check if value is less than end value
                    index++;
                    value= a[index];//stor index in value variable
                    //swap
                    a[index]= a[i];
                    a[i]=value;
                }
            }
            //incrememnt and swap
            value= a[index+1];
            a[index+1]=a[end];
            a[end]=value;

            //position increment
            int position= index+1;
            QuickSort (a, start, position-1);//recursion of end element as it is decremented
            QuickSort(a, position+1, end);//recursively sort frm beginning till end
        }
        return a;//return array
    }
}
