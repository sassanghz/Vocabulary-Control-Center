package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Vocab {
    private String topic;
    private LinkedList<String> words;

    public Vocab(String topic){
        this.topic = topic;
        words = new LinkedList<>();
    }

    public String getTopic() {
        return topic;
    }

    public LinkedList<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }

    public boolean removeWord(String word){
        return words.remove(word);
    }

    public List<String> getWordsStartingWith(char letter){
        /*
         It filters the words in that specific vocabulary (Vocab object)
          to include only those words that start with the specified letter.
         */
        List<String> result = new ArrayList<>();
        // Goes through all the words in the list to check if they match with the inputted letter
        for(String word: words){
            if(word.charAt(0) == letter){

                result.add(word);
            }
        }
        //this line sorts the list in alphabetical order.
        Collections.sort(result);
        return result;
    }

    @Override
    public String toString() {
        String result = topic + ": ";

        if (words.isEmpty()) {
            return result + "No words in this vocab";
        }

        int count = 1;
        for (String word : words) {
            result += "\n" + count++ + ": " + word;
        }

        return result;
    }


    
}
