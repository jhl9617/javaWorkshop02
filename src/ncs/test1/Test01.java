package ncs.test1;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(st);
        String[] intt = st.split("\\s");
        if (intt.length != 5) System.out.println("다시 입력하세요.");
        else {
            for (int i = 0; i < intt.length; i++) {
                if (Integer.parseInt(intt[i]) > 9 && Integer.parseInt(intt[i]) < 100) {
                } else {
                    System.out.println("다시 입력하세요.2");
                    return;
                }
            }
            int tot = 0;

            tot += (Integer.parseInt(intt[0]) + Integer.parseInt(intt[1])) * 0.3;
            tot += (Integer.parseInt(intt[2]) + Integer.parseInt(intt[3])) * 0.1;
            tot += (Integer.parseInt(intt[4])) * 0.2;
            System.out.println(tot);

            if(tot > 100){
            }else if(tot > 90) System.out.println("gold");
            else if (tot > 80) System.out.println("silver");
            else if (tot > 70) System.out.println("bronze");
            else System.out.println("normal");


        }






    }
}
