package ncs.test3;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] in = new int[10];
        for(int i = 0; i < in.length;i++){
            in[i] = (int)(Math.random()*50) + 51;
            System.out.print(in[i] + " ");
        }
        System.out.println();

        Arrays.sort(in);
        for(int i = 0; i < in.length;i++){

            System.out.print(in[i] + " ");
        }
    }
}
