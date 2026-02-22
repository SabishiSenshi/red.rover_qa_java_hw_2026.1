public class rez {
    public static void main(String[] args) {
        String s = "“Перестановочный алгоритм быстрого действия”";
        for (int i = 0; i < s.length(); i++) {
            char j = s.charAt(i);
            if (j == 'о') {
                System.out.print(j);
            }
        }
    }
}
