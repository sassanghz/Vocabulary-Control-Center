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
        List<String> result = new ArrayList<>();

        for(String word: words){
            if(word.charAt(0) == letter){
                result.add(word);
            }
        }
        Collections.sort(result);
        return result;
    }

    @Override
    public String toString(){
        return topic + ": " + words.toString();
    }

    
}
