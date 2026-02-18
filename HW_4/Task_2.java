public class rez {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        while (a < 10000) {
            System.out.println(a);
            a = a * b;
        }
    }
}
