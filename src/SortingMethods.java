import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Driver Program for project 9
public class SortingMethods{
    public static void main(String[] args)throws IOException {
        int num = inputNum();
        String fileName= file();
        int [] arr= new int[num];

        //Input values from text file into array
        Scanner file= new Scanner(new File(fileName));
      for (int i=0; i<num; i++){
          arr[i]=Integer.parseInt(file.next());
      }
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");

        //HashBucket Sort for the desired Array
        HashSort t1= new HashSort();
        System.out.print("Hash (Bucket) sort array: ");
        System.out.println(Arrays.toString(t1.hashSort(arr)));

        //OrderedTree Sort for the desired Array
        OrderedTreeSort t2 = new OrderedTreeSort();
        System.out.print("Order Tree sort array: ");
        t2.tree(arr, 0);
        t2.inOrder(t2.root);
        System.out.println(" ");

        //QuickSort for desired Array
        QuickSort t3= new QuickSort();
        System.out.print("Quick sort array: ");
        System.out.println(Arrays.toString(t3.QuickSort(arr, 0, num-1)));

        //Selection Sort for desired Array
        SelectionSort t4= new SelectionSort();
        System.out.print("Selection sort array: ");
        System.out.println(Arrays.toString(t4.SelectionSort(arr, num)));

        //Insertion Sort for desired Array
        InsertionSort t5= new InsertionSort();
        System.out.print("Insertion sort array: ");
        System.out.println(Arrays.toString(t5.SelectionSort(arr, num)));

        //Merge Sort for desired Array
        MergeSort t6= new MergeSort();
        System.out.print("Merge sort array: ");
        System.out.println(Arrays.toString(t6.MergeSort(arr, 0, num )));

        //Shell Sort for desired Array
        ShellSort t7 = new ShellSort();
        System.out.print("Shell sort array: ");
        System.out.println(Arrays.toString(t7.sort(arr)));

        //Heap Sort for desired Array
        HeapSort t8 = new HeapSort();
        System.out.print("Heap Sort array: ");
        System.out.println(Arrays.toString(t8.HeapSort(arr, num)));

     new RunTime();
    }

    private static String file() {
        Scanner file= new Scanner(System.in);
        System.out.print("Enter a file to read:  ");
        return file.nextLine();
    }

    private static int inputNum() {
        Scanner num= new Scanner(System.in);
        System.out.print("Number of desired inputs: ");
        return num.nextInt();
    }
}
