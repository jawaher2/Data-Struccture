/**
 * Created by shaker on 02/12/2021.
 */
public class Opr3 {
    int [] a = {1,2,3,4,5};

    public void shiftleft(){
        int i;
        for (i=0 ; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[i]=0;
    }
    public void print(){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i==a.length-1)
                System.out.print(a[i]);
            else
                System.out.print(a[i] + ",");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Opr3 o = new Opr3();
        o.print();
        o.shiftleft();
        o.print();
    }
}
