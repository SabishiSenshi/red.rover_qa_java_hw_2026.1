import java.util.Arrays;

public class rez {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int j = Arrays.stream(array).sum();
        System.out.println(j);
    }
}
