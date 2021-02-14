/**
 * Created by shaker on 02/10/2021.
 */
public class Opr1 {
    int [] a = {1,2,3,4,5};

    public void revers(){
        int n = a.length - 1;
        for (int i = 0; i < a.length/2 ; i++) {
            int t = a[i];
            a[i] = a[n];
            a[n] = t;
            n--;
        }
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
         Opr1 o = new Opr1();
        o.print();
        o.revers();
        o.print();
    }
}

