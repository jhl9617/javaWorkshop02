package ncs.test4;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] dob = new double[3][6];

        for(int i = 0; i < dob.length; i++){
            dob[i][0] = i;
            System.out.print("����1 : ");
            dob[i][1] = scanner.nextDouble();
            System.out.print("����2 : ");
            dob[i][2] = scanner.nextDouble();
            System.out.print("����3 : ");
            dob[i][3] = scanner.nextDouble();
            dob[i][4] = dob[i][1] + dob[i][2] + dob[i][3];
            dob[i][5] = dob[i][4] / 3;

        }
        System.out.println("indext\t����1\t����2\t����3\t����\t���");
        for(int i = 0; i < dob.length; i++){
            System.out.println(i +"\t" +dob[i][1] + "\t"+dob[i][2] +"\t" +dob[i][3] + "\t"+dob[i][4] +"\t" +dob[i][5]);
        }
    }
}
