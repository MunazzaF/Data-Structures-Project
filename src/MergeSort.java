//MergeSort algorithm
public class MergeSort {
        int[] MergeSort(int[] list, int lowIndex, int highIndex) {//takes in 3 variables; list array, low and high index
            if (lowIndex == highIndex)
                return list;//checks if low index  is same value as high index
            else {
                int midIndex;
                midIndex = (highIndex + lowIndex) / 2;//initialize center index
                MergeSort(list, lowIndex, midIndex);//recursive call
                MergeSort(list, midIndex + 1, highIndex);//increment mid value
                merge(list, lowIndex, midIndex + 1, highIndex);//perform merge
            }
            return list;
        }
    private void merge(int[] list, int lowIndex, int i, int highIndex) {
    }

}

