public class res {
    public static void main(String[] args) {
        // Объявление переменных
        int a = 32;
        int b = 25;
        // Выполнение операций с переменными
        System.out.println("Сложение: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Вычетание: " + (a - b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));
        // Проверка на чётность значения переменной
        if (a % 2 == 0) {
            System.out.println(a + " Четное");
        }else {
            System.out.println(a + " Нечетное");
        }

        if (b % 2 == 0) {
            System.out.println(b + " Четное");
        }else {
            System.out.println(b + " Нечетное");
        }
    }
}
