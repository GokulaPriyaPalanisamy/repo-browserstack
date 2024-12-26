import java.util.HashMap;
import java.util.Map;

public class RepeatedWordsInHeaders {
    public static void main(String[] args) {
        String[] headers = {
            "Can the fight against climate change be won without the United States?",
            " Is the solution to the Israeli-Palestinian conflict two states or one?",
            "Does Spain have to apologize to Mexico?",
            "Is it worth it for a city to host the Olympic Games?"
        };
         Map<String, Integer> wordCountMap = new HashMap<>();
                for (String header : headers) {
            String[] words = header.split("\\s+");
                      for (String word : words) {
                word = word.toLowerCase();
                 wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Repeated words (appearing more than twice):");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 2) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
