import java.time.LocalDate;

public class Main {


    public static void main(String[] args){

        Nume nume = new Nume();
        String numelemeu = nume.nume();


        LogicalOperators op = new LogicalOperators();


        System.out.println(op.Snow(6));
        System.out.println(op.isNumberEven(103));
        System.out.println(op.isEligibleToVote(17));
        System.out.println(op.BiggestNumber(3f,3f,3f));










        /*Calculator calc = new Calculator();

        calc.sum(10, 20);
        calc.sum(1, 100);
        calc.sum(9, -3);
        calc.devide_multiply(17, 8, 2);
        calc.devide_multiply(1407189, 483, 594);
        calc.multiply(4726, 46);
        calc.multiply(976, 27);*/

    }

}





     /*   public static void lab(){
        int a = 100;
        int b = 10;

        //Adunare
        int sum = a + b;
        System.out.println("Adunare:" + sum);

        //Impartire
        int Impartire = a / b;
        System.out.println("Impartire:" + Impartire);

        //Tema Lab 9
        //a.
        System.out.println("a.");
        int x = -5;
        int y = 8;
        int z = 6;
        int result1 = x + y * z;
        System.out.println("Rezultat pentru a:" + result1);

        //b.
        System.out.println("b.");
        int k = 55;
        int l = 9;
        int result2 = (k + l) % 9;
        System.out.println("Rezultat la b:" + result2);

        //c.
        System.out.println("c.");
        float c = 20;
        float d = -3;
        float e = 5;
        float f = 8;
        float result3 = c + (d * e) / f;
        System.out.println("Rezultat la c:" + result3);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println("d.");
        float g = 5;
        float h = 15;
        float i = 3;
        float j = 2;
        float m = 8;
        float n = 3;
        float result4 = ((g + (h / i * j) - m)) % n;
        System.out.println("Rezultat la d:" + result4);

        //test
        System.out.println("random");
        int v = 5;
        int q = 10;
        if (q - 2 * v < 0)
            System.out.println("True");
        if (q - 2 * v > 0)
            System.out.println("False");
        else
            System.out.println("Nu merge");
    }*/
