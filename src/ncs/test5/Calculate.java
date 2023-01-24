package ncs.test5;

public class Calculate {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int res = 0;
        if(b > 0) res = a / b;
        return res;
    }

}
