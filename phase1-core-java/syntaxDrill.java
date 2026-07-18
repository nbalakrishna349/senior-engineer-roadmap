import java.net.Inet4Address;
import java.util.*;

public class syntaxDrill {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);

        String words = "Bala Bala Chandu";

        List<String> stringList = Arrays.asList("shirt", "pants", "shirt", "shirt", "pants");


        Map<String, Integer> output = wordsLenght(words);
        List<Integer> result = getValidAdultAges(stringList);
        String stringresult = mostFrequentProduct(stringList);
        System.out.println(stringresult);
    }

    public static int countvowels(String sentance) {
        sentance = sentance.toLowerCase();
        int count = 0;

        for (int i = 0; i < sentance.length(); i++) {
            char charecter = sentance.charAt(i);
            if (charecter == 'a' || charecter == 'e' || charecter == 'o' || charecter == 'u') {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        // your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }

    public static Map<String, Integer> wordFrequency(String[] words) {

        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (result.containsKey(word)) {

                result.put(word, result.get(word) + 1);
            } else {

                result.put(word, 1);
            }
        }
        return result;
    }

    public static int sumofvalidNumbers(List<String> numberstrings) {
        int sum = 0;
        for (int i = 0; i < numberstrings.size(); i++) {
            String word = numberstrings.get(i);
            try {
                int num = Integer.parseInt(word);
                sum = sum + num;
            } catch (NumberFormatException e) {
            }
        }
        return sum;
    }

    public static Map<String, Integer> wordsLenght(String sentance) {

        String[] newString = sentance.split(" ");

        Map<String, Integer> result = new HashMap<>();

        for (String string : newString) {

            result.put(string, string.length());
        }

        return result;
    }

    public static List<Integer> getValidAdultAges(List<String> ageStrings) {
        // e.g. ["25", "abc", "15", "40", "xyz"] -> [25, 40]
        List<Integer> resultlist = new ArrayList<>();
        for (String ageString : ageStrings) {

            try {
                int validnum = Integer.parseInt(ageString);

                if (validnum >= 18) {
                    resultlist.add(validnum);
                }
            } catch (NumberFormatException _) {

            }
        }
        return resultlist;
    }

    public static String mostFrequentProduct(List<String> products) {
        // e.g. ["shirt", "pants", "shirt", "shirt", "pants"] -> "shirt"
        Map<String, Integer> resultmap = new HashMap<>();
        for (String word : products) {

            if (resultmap.containsKey(word)) {

                resultmap.put(word, resultmap.get(word) + 1);
            } else {

                resultmap.put(word, 1);
            }
        }

        String bestKey = null;
        int bestcount = 0;

        for(Map.Entry<String, Integer> entry : resultmap.entrySet()){

            if( entry.getValue() > bestcount){

                bestKey = entry.getKey();
                bestcount = entry.getValue();
            }

        }
        return bestKey;
    }
}