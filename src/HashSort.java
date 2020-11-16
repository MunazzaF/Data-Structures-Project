public class HashSort {
    static int[] hashSort(int[] a) {

        //Fine the max value in the array
        int max = max(a, a.length);
        //Set the number of buckets to equal length of array a -2
        int buckets = a.length - 2;

        //Array to hold buckets
        int[] b = new int[max + 1];

        //Initialize 2nd array to store sorted array
        int[] aSorted = new int[a.length];

        //Initial bucket sort of the array a
        for (int m = 0; m < a.length; m++) {
            b[a[m]]++;
        }

        //Insert values from buckets into sorted array
        int place=0;
        for(int i=0; i< b.length; i++){
            for (int k=0; k<b[i]; k++){
                aSorted[place]=i;
                place++;
            }
        }

        return aSorted;
    }

    //Method to find max value of array
    private static int max(int[] a, int size){
        int temp= a[0];
        for (int i=0; i< size; i++){
            if (a[i] > temp){
                temp= a[i];
            }
        }
        return temp;
    }
}
