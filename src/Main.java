public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Angi");

        int a = 100;
        int b = 10;

        //Adunare
        int sum = a+b;
        System.out.println("Adunare:" + sum);

        //Impartire
        int Impartire = a/b;
        System.out.println("Impartire:" + Impartire);

        //Tema Lab 9
        //a.
        int x = -5;
        int y = 8;
        int z = 6;
        int result1 = x + y * z;
        System.out.println("Rezultat pentru a:" + result1);

        //b.
        int k = 55;
        int l = 9;
        int result2 = (k + l) % 9;
        System.out.println("Rezultat la b:" + result2);

        //c.
        float c = 20;
        float d = -3;
        float e = 5;
        float f = 8;
        float result3 = c + (d * e) / f;
        System.out.println("Rezultat la c:" + result3);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        float g = 5;
        float h = 15;
        float i = 3;
        float j = 2;
        float m = 8;
        float n = 3;
        float result4 = ((g + (h / i * j) - m)) % n;
        System.out.println("Rezultat la d:" + result4);








    }
}