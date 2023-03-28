package exercice1;

public class Factorielle {
    public int factorielle(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n doit être positif");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorielle f = new Factorielle();
        System.out.println(f.factorielle(5));
    }

}