package mada;

public class Eratosthenes {

    public static void sieb(int n) {
        boolean [] prim = new boolean[n+1];

        for (int i = 2;  i <=n; i++) {
            prim[i] = true;
            System.out.println(i);
        }
        System.out.println("----");


        for (int i = 2; i * i <=n; i++) {
            if (prim[i]) {
                for (int j = i; i * j <=n; j++) {
                    prim[i*j] = false;
                }
            }
            System.out.println(i);
        }
        System.out.println("----");
        System.out.println("Primzahlen sind: ");


        for (int i = 2;  i <=n; i++) {
            if (prim[i]) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        sieb(20);
    }

}