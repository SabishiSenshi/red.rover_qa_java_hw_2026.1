public class task {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int all = 0;
        for (int i = 0; i < array.length; i++){
            all += array[i].length;
        }
        System.out.println(all);
    }
}
