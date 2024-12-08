package algorithms;

public class ResizingArrays {

    public int[] resize(int[] arr, int size) {
        int new_size = size * 2;
        int[] newArr = new int[new_size];
        for(int i=0; i<size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
