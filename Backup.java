/**
 * Created by shaker on 02/13/2021.
 */
public class Backup {
    int [] x = {1,2,3,4,5};
    int [] y = new int [x.length];

    public void backup(){
        for (int i = 0; i < y.length; i++) {

            y[i] = x[i];
        }
    }
    public void print(){
        System.out.print("[");
        for (int i = 0; i < y.length; i++) {
            if (i==y.length-1)
                System.out.print(y[i]);
            else
                System.out.print(y[i] + ",");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Backup b = new Backup();
        b.print();
        b.backup();
        b.print();
    }

}
