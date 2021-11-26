public class SelectionSort {

    /* Sorts an unsorted array in increasing order (left-most value is the
    * smallest value). Sorts it 1 value at a time, starting from the
    * left-most value (anchor) to the end (length-1). Any values left of the
    * anchor are assumed to be sorted. Thus, our *range* of values needed to
    * check (if they're of smaller value than our anchor) decreases the more
    * values we do. We swap values at the end of our search of ALL terms,
    * since many smaller values may be found, but we're only concerned with
    * picking the absolute smallest value that's to the right of our
    * anchor point.
    * 
    * Outputs: Sorted array in increasing value
    * */
    public static void main(String[] args) {
        //Unsorted Array
        int[] unsortedArr = {22, 4, 8, 12, 9, 3, 2};

        // Selection Sort Algorithm
        int length = unsortedArr.length;
        //Move through each value, one at a time, starting at left-most value
        for(int anchor = 0; anchor < length-1; anchor++){

            //Min Value Index, default assumes our anchor is smallest val
            int minVal = anchor;

            // Search for new Min Value in Range (anchor -> length)
            for(int current = anchor+1; current < length; current++) {
                // New Smaller Min Value found, record index
                if (unsortedArr[current] < unsortedArr[minVal]) {
                    minVal = current;
                }
            }

            // Absolute Smallest Min Value Found
            // Swap Position of Min Value & Current Value
            int temp = unsortedArr[anchor];
            unsortedArr[anchor] = unsortedArr[minVal];
            unsortedArr[minVal] = temp;
        }

        //Print New Sorted Array
        System.out.print("Sorted Array: ");
        for(int i = 0; i < length; i++)
            System.out.print(unsortedArr[i] + " ");
        System.out.print("\n");

    }
}
