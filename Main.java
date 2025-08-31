class Test {
    int x;

    Test() {
        x = 10;
    }

    Test(int y) {
        x = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(20);

        System.out.println(t1.x + " " + t2.x);
    }
}