import java.util.Scanner;

/**
 * Created by shaker on 02/12/2021.
 */
public class Opr4 {
    int [] a = new int[5];
    int num=0;
    public void add(int newE){
        if (num<a.length){
            a[num]=newE;
            num++;
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
        Opr4 o = new Opr4();
        Scanner s = new Scanner(System.in);
        o.print();
        while (true) {
            o.add(s.nextInt());
            o.print();
        }
    }
}

