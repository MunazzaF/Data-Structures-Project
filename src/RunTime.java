import java.util.Arrays;
import java.util.Collections;

//Run Times for different algorithms
public class RunTime {
    RunTime(){
        int[] test = new int[10000];//test case size of array
        for (int i = 0; i < test.length; i++) {
            test[i] = i;//initiate array
        }
        Collections.shuffle(Arrays.asList(test));

        //hashsort run time with test array
        long start = System.nanoTime();//start time
        HashSort t1 = new HashSort();
        t1.hashSort(test);
        long end = System.nanoTime();//end time

        System.out.println(" ");
        System.out.println("Hash Sort runtime: " + (end - start));//display the difference in run times

        //orderedtreesort run time with test array
        long start8= System.nanoTime();//start time
        OrderedTreeSort t2 = new OrderedTreeSort();
        t2.tree(test, 0);
        long end8= System.nanoTime();//end time
        System.out.println("Ordered Tree Sort runtime: " + (end8 - start8));//display the difference in run times

        //quicksort run time with test array
        long start2= System.nanoTime();//start time
        QuickSort t3= new QuickSort();
        t3.QuickSort(test, 0, test.length-1);
        long end2= System.nanoTime();//end time
        System.out.println("Quick Sort runtime: " + (end2 - start2));//display the difference in run times

        //selectionsortsort run time with test array
        long start3= System.nanoTime();//start time
        SelectionSort t4= new SelectionSort();
        t4.SelectionSort(test, test.length);
        long end3= System.nanoTime();//end time
        System.out.println("Selection Sort runtime: " + (end3 - start3));//display the difference in run times

        //insertionsort run time with test array
        long start4= System.nanoTime();//start time
        InsertionSort t5= new InsertionSort();
        t5.SelectionSort(test, test.length);
        long end4= System.nanoTime();//end time
        System.out.println("Insertion Sort runtime: " + (end4 - start4));//display the difference in run times

        //mergesort run time with test array
        long start5= System.nanoTime();//start time
        MergeSort t6= new MergeSort();
        t6.MergeSort(test, 0, test.length );
        long end5= System.nanoTime();//end time
        System.out.println("Merge Sort runtime: " + (end5 - start5));//display the difference in run times

        //shellsort run time with test array
        long start6= System.nanoTime();//start time
        ShellSort t7= new ShellSort();
        t7.sort(test);
        long end6= System.nanoTime();//end time
        System.out.println("Shell Sort runtime: " + (end6 - start6));//display the difference in run times

        //heapsort run time with test array
        long start7= System.nanoTime();//start time
        HeapSort t8= new HeapSort();
        t8.HeapSort(test, test.length);
        long end7= System.nanoTime();//end time
        System.out.println("Heap Sort runtime: " + (end7 - start7));//display the difference in run times
    }
}

