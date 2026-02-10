package stepkin.les24;

import java.util.Arrays;

public class Massiv {


    void sort_2_Mass(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = new int[a.length + b.length];
        for (int i = 0, j = 0, k = 0; k < (a.length + b.length - 1); k++) {
         int m = a[i];

        c[k] = Math.min(m,b[j]);

        if (a[i]>b[j]) {
            m = a[i];
            j++;
            }
        else {
            m = b[j];
            i++;
        }
            }
        c[c.length -1] = Math.max(a[a.length-1],b[b.length -1]);
        System.out.println(Arrays.toString(c));
        }


    public static void main(String[] args) {
        int[] m1 = {33,22,11,1};
        int[] m2 = {42, 10};
        Massiv d = new Massiv();
        d.sort_2_Mass(m1,m2);
    }

}
