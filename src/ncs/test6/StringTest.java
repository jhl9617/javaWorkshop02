package ncs.test6;

public class StringTest {
    public static void main(String[] args) {
        String str = "1.22,4.12,5.93,8.71,9.34";
        double[] data = new double[5];
        double sum = 0;
        // str���� �����͸� �и��Ѵ�.
        String[] st= str.split(",");

        for(int i = 0; i < st.length;i++){
            data[i] = Double.parseDouble(st[i]);
            sum += data[i];
            //for~each �� ����Ѵ�.
            // �迭�� �Ǽ� �����͸� �ִ´�.
//�迭 �������� ���� ���Ѵ�.
        }
        System.out.println("�հ� : " + sum);
        System.out.println("��� : " + sum / st.length);
        // ��� ���� ��� �Ѵ�.
    }
}
