import java.util.Random;

/**
 * Created by shaker on 02/13/2021.
 */
public class Rand {

    static void RemovingElements(int [] a){
        Random r = new Random();
        while(a.length > 0){
            int index = r.nextInt(a.length);
            System.out.println("index = " + index + "element = " + a[index]);
            int [] x1 = new int [a.length-1];
            for (int i = 0; i <index ; i++)
                x1[i]= a[i];
            for (int j = 0; j <a.length-1 ; j++)
                x1[j]=a[j+1];
            a=x1;
        }
    }
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5};
        RemovingElements(a);
    }
}
