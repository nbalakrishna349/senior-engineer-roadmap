import java.util.Locale;

public class syntaxDrill{
    public static void main ( String[] args) {

        int result = countvowels("balakrishna");
        System.out.println(result);
    }

    public static int countvowels(String sentance){
        sentance = sentance.toLowerCase();
        int count = 0;

        for( int i = 0 ; i < sentance.length();i++){
            char charecter = sentance.charAt(i);
            if(charecter == 'a' || charecter =='e' || charecter == 'o' || charecter =='u'){
                count++;
            }
        }
        return count;
    }
}