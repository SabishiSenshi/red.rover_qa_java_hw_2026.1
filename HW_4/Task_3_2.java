public class rez {
    public static void main(String[] args) {
        for (int a = 40; a <= 60; a += 3) {
            System.out.print((a % 4 == 0) ? a + " " : "");
        }
    }
}
