//algorithm geared towards building an array into a heap tree
//this program arranges elements from the smallest to the largest
//HeapSort algorithm
public class HeapSort
{
    //sorting algorithm
    public int[] HeapSort(int[] unheap, int n)
    {
        for (int i = (n / 2) - 1; i >= 0; i--)
            heapify(unheap, n, i);//call the heapify function recursively


        for (int i=n-1; i>0; i--)//swapping elements
        {

            int swap = unheap[0];
            unheap[0] = unheap[i];
            unheap[i] = swap;
            heapify(unheap, i, 0);//recursion
        }

        return unheap;
    }


    void heapify(int arr[], int n, int i) {
        int great = i;//parent node
        int left = 2 * i + 1;//left node
        int right = 2 * i + 2;//right node


        if (left < n && arr[left] > arr[great])
            great = left;//check if criteria matches to move left to parent node


        if (right < n && arr[right] > arr[great])
            great = right;//check if criteria matches to move right to parent node


        if (great != i)//swapping elements using a temporary holder
        {
            int swap = arr[i];
            arr[i] = arr[great];
            arr[great] = swap;


            heapify(arr, n, great);//recursion
        }
    }
} 