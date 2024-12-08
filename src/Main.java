import algorithms.ResizingArrays;
import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        ResizingArrays dyn_resize_arr = new ResizingArrays();
        int ele1 = 1;
        int ele2 = 4;
        int[] arr = {ele1};
        try{
            arr[2] = ele2;
        }
        catch (Exception ex) {
            System.out.println("Array size exceeds "+ arr.length+ "\n");
            arr = dyn_resize_arr.resize(arr, arr.length);
            arr[1] = ele2;

        }
        System.out.println("New Array size is: "+ arr.length);
        System.out.println("Array is :\n");
        for(int i: arr) {
            System.out.print(i+ " ");
        }
        System.out.println("\n");

    }
}