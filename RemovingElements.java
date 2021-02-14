import java.util.Arrays;

/**
 * Created by shaker on 02/13/2021.
 */
public class RemovingElements {
    int [] a ={1,2,3,4,5};

    public void remove(int arr[],int index){
        if (index>=0 && index<arr.length)
        {
            int i = index;
            while (i<arr.length-1){
                arr[i]=arr[i+1];
                i++;
            }
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        RemovingElements r = new RemovingElements();
        System.out.println(Arrays.toString(r.a));
        r.remove(r.a,2);
        System.out.println(Arrays.toString(r.a));
    }
}
