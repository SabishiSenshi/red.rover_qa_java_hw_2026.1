public class rez {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char j = s.charAt(i);
            if (j == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }
}
