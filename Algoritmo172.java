public class Algoritmo172 {
    public static void main(String[] args) {
        int L, c, t;

        System.out.println("\nABAIXO DA DIAGONAL SECUNDÁRIA\n");
        System.out.println(" ");

        for (L = 2; L < 10; L++) {
            for (t = 11 - L; t >= 1; t--) {
                System.out.print("\t");
            }
            for (c = 12 - L; c <= 10; c++) {
                System.out.print(L + "-" + c + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}