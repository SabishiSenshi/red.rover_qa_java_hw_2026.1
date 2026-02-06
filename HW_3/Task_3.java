public class qwerty3 {
    public static void main(String[] args) {
        int e = 35;

        if (e > 10) {
            System.out.println("больше 10");
        } if (e < 100) {
            System.out.println("меньше 100");
        } if ((e / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        } if (e >= 5 && e <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else if (e <= 5 || e >= 40) {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
