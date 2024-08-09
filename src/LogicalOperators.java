public class LogicalOperators {

    public float getHigherNumber(float first, float second){

        if(first>second){
            return first;
        }
        else{
            return second;
        }
    }
    public String textAndNumberCompare(String text, int numar) {

        if (text.equals("FastTrack") && numar <= 3) {
            return text + numar;

        } else if (!text.equals("FastTrack") && numar >= 4) {
            return numar + text;
        }
          else
              return "Nu s-a indeplinit nici-o conditie";
    }
}
