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

    public float inchi_metru(float inch){
        float result = inch / 39.37f;
        System.out.println("Conversia de la " + inch + " la este " + result + " metri. ");
        return result;
    }

    public float vms(float metri, float secunde){

        float result_vms = metri / secunde;
        System.out.println("Ai mers cu " + result_vms + " metri pe secunda.");
        return result_vms;

    }

    public float vkmo(float metri, float ore){

        float result_vkmo = (metri / 1000f) / ore;
        System.out.println("Ai mers cu " + result_vkmo + " kilometri pe ora.");
        return result_vkmo;
    }

    public float vmo(float metri, float minute, float ore){
        float result_vmo = (metri / 1609f) / ore;

        if (minute >= 1 ) {
            float result_vmo_min = (metri / 1609f) / (minute / 60);
            System.out.println("Daca ai parcurs " + metri + " metri in " + minute + " minute ai mers cu " + result_vmo_min +
                    " mile pe ora.");
            return result_vmo_min;

        }

        else
            System.out.println("Daca ai parcurs " + metri + " metri in " + ore + " ore ai mers cu " + result_vmo +
                    " mile pe ora.");
            return result_vmo;


        }

    }
