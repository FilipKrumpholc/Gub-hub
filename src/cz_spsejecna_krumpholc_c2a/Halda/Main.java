package cz_spsejecna_krumpholc_c2a;

public class Main {

    public static void main(String[] args) {

        Halda h = new Halda();
        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * (350 - 0));

            h.insert(randomNum);
        }

        h.heapPrint();

    }

}