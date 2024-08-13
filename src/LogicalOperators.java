
public class LogicalOperators {

    public float getHigherNumber(float first, float second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String textAndNumberCompare(String text, int numar) {

        if (text.equals("FastTrack") && numar <= 3) {
            return text + numar;

        } else if (!text.equals("FastTrack") && numar >= 4) {
            return numar + text;
        } else
            return "Nu s-a indeplinit nici-o conditie";
    }


    public String Snow(int snow) {

        if (snow > 8 || snow == 6) {
            return ("The amount of snow this winter was " + snow);
        } else {
            return ("The forecast snow is " + snow);
        }
    }

    public String isNumberEven(float number) {

        if (number % 2 == 0) {
            return "true";
        } else return "false";
    }

    public String isEligibleToVote(int varsta) {

        if (varsta >= 18) {
            return "Has right to vote";
        } else return "Doesn't have the right to vote";
    }


    public float BiggestNumber(float first, float second, float third) {

        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        } else return 0;

    }
}





