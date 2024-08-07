public class Calculator {

    public int sum(int first, int second) {
        int result = first + second;
        System.out.println("Adunarea dintre " + first + " si " + second + " este: " + result);
        return result;
    }

    public float devide_multiply(float first, float second, float third) {
        float result = first / second * third;
        System.out.println("Rezultatul dintre " + first + " impartit la " + second + " si inmultit cu " + third + " este: " + result);
        return result;
    }

    public float multiply(float first, float second) {
        float result = first * second;
        System.out.println("Rezultatul inmultirii dintre " + first + " si " + second + " este: " + result);
        return result;
    }
    public float rest(float first, float second) {

        float result = first % second;
        System.out.println("Restul impartirii dintre " + first + " si " + second + " este: " + result);
        return result;
    }

    public float celsius_farenheit(float F){
    float result = (5.0f / 9.0f) * ( F - 32 );
    System.out.println("Conversia de la " + F + " grade Farenheit este " + result + " grade Celsius");
    return result;
    }

}
