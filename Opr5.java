import java.util.Scanner;

/**
 * Created by shaker on 02/12/2021.
 */
public class Opr5 {
    int [] a = new int[5];
    int num=0;
    public void addstored(int newE){
        if (num<a.length){
            num++;
            int i = num -1;
            while(i>0 && (newE<a[i-1])){
                a[i]=a[i-1];
                i--;
            }
            a[i]=newE;
        }
        else
            System.out.println("Array is full ");
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
        Opr5 o = new Opr5();
        Scanner s = new Scanner(System.in);
        o.print();
        while (true) {
            o.addstored(s.nextInt());
            o.print();
        }
    }
}

