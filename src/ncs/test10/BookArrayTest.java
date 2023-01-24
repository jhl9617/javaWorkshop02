package ncs.test10;

public class BookArrayTest {

    public static void main(String args[]) {
        Book bArray [] = new Book[3];
        // Book 객체를 3개 생성하여 배열에 넣는다.
        // 배열에 있는 객체 정보를 모두 getter 로 출력 한다. ? for 문을 이용 할 것
        // 실행 결과와 같이 계산 출력
        {
            bArray[0] = new Book("자바의 정석", "남궁성", 30000,"도우출판", 10);
            bArray[1] = new Book("열혈강의 자바","구정은", 29000, "프리렉", 10);
            bArray[2] = new Book("객체지향 JAVA8", "금영옥", 30000, "북스홈", 10);
        }
        for (Book book : bArray) {System.out.println(book);}
    }
}
