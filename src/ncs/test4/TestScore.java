package ncs.test4;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] dob = new double[3][6];
        for(int i = 0; i < dob.length; i++){
            System.out.print(i + "번째 과목들 입력 : ");
            String st = scanner.nextLine();
            int[] tmp = new int[5];
            dob[i] = st.split("\\s");
        }
    }
}
