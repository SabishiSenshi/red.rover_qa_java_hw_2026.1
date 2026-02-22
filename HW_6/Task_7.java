public class rez {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            int[] a = array[i];
            for (int j=0; j < a.length; j++){
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}
