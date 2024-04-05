import java.util.LinkedList;

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

    

    
}
