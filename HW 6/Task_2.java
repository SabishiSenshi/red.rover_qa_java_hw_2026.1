public class task {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( c == 'е') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
