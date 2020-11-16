
public class ShellSort{
    //sorting algorithm
    public static int[] sort(int[] sample)
    {
        int n = sample.length;//get length of array

        for (int gap = n/2; gap >= 1; gap /= 2)//initialize the gap operations
        {

            for (int i = gap; i < n; i ++)//get first element which will be the gap value
            {
                int k;
                int swap = sample[i];//initiate swapping elements
                //store element in index i into the swap integer

                for (k = i; k >= gap && sample[k - gap] > swap; k -= gap)
                    sample[k] = sample[k - gap];//reduce element in sample by gap to get next element


                sample[k] = swap;
                //store element in sample array into the swap integer

            }
        }
        return sample;
    }
}
