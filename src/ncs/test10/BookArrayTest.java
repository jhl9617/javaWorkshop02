package ncs.test10;

public class BookArrayTest {

    public static void main(String args[]) {
        Book bArray [] = new Book[3];
        // Book ��ü�� 3�� �����Ͽ� �迭�� �ִ´�.
        // �迭�� �ִ� ��ü ������ ��� getter �� ��� �Ѵ�. ? for ���� �̿� �� ��
        // ���� ����� ���� ��� ���
        {
            bArray[0] = new Book("�ڹ��� ����", "���ü�", 30000,"��������", 10);
            bArray[1] = new Book("�������� �ڹ�","������", 29000, "������", 10);
            bArray[2] = new Book("��ü���� JAVA8", "�ݿ���", 30000, "�Ͻ�Ȩ", 10);
        }
        for (Book book : bArray) {System.out.println(book);}
    }
}
