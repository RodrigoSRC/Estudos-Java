package academy.devdojo.maratonajava.introducao;

public class _08_ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31,28,31,30,31 dias

        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for(int[] arrBase: dias) {
            for(int num: arrBase) {
                System.out.println(num);
            }
        }

    }
}
