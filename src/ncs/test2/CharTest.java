package ncs.test2;

import java.util.Scanner;

public class CharTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        char[] ch = new char[st.length()];
        ch = st.toCharArray();
        for(int i = ch.length -1 ; i > -1; i--){
            System.out.print(ch[i]);
        }
    }
}
