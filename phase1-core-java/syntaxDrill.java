import java.util.*;

public class syntaxDrill{
    public static void main ( String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);

        String [] words = {"Bala","Bala","Chandu"};

        Map<String,Integer> output = wordFrequency(words);
        List<Integer> result = getEvenNumbers(num);
        System.out.println(output);
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

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        // your code here
        List<Integer> result = new ArrayList<>();
        for( int i = 0; i<numbers.size();i++){

            if ( numbers.get(i) % 2 == 0){
                result.add(numbers.get(i));
            }
        }
        return result;
    }

    public static Map<String, Integer> wordFrequency(String[] words) {

        Map<String , Integer> result = new HashMap<>();

        for ( int i =0 ; i < words.length; i++){

            String word = words[i];

            if ( result.containsKey(word)){

                result.put(word,result.get(word)+1);
            }
            else{

                result.put(word,1);
            }
        }
        return result;
    }
}