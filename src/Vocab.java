package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Vocab {
    private String topic;
    private Node head;
    private Node tail;
    private int size;
    private LinkedList<String> words;

    public Vocab(String topic){
        this.topic = topic;
        head = null;
        tail = null;
        size = 0;
        words = new LinkedList<>();
    }

    
    /** 
     * @return String
     */
    public String getTopic() {
        return topic;
    }

    
    /** 
     * @return LinkedList<String>
     */
    public LinkedList<String> getWords() {
        return words;
    }

    
    /** 
     * @return int
     */
    public int getSize(){
        return size;
    }
    
    /** 
     * @param word
     */
    public void addWord(String word) {
        // Create a new node with the word
        Node newNode = new Node(word);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        // Increment the size of the list
        size++;
    }
    
    /** 
     * @param word
     * @return boolean
     */
    public boolean removeWord(String word){
        Node current = head;
        while (current != null) {
            if (current.word.equals(word)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        size--;
        return false;
    }

    
    /** 
     * @param letter
     * @return List<String>
     */
    public List<String> getWordsStartingWith(char letter){
        /*
         It filters the words in that specific vocabulary (Vocab object)
          to include only those words that start with the specified letter.
         */
        List<String> result = new ArrayList<>();
        Node current = head;
        while (current != null) {
            if (current.word.charAt(0) == letter) {
                result.add(current.word);
            }
            current = current.next;
        }
        Collections.sort(result);
        return result;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(topic + ": ");
        Node current = head;
        int count = 1;
        while (current != null) {
            result.append("\n").append(count++).append(": ").append(current.word);
            current = current.next;
        }
        if (size == 0) {
            result.append("No words in this vocab");
        }
        return result.toString();
    }

    private class Node{

        private String word;
        private Node prev;
        private Node next;

        public Node(String word){
            this.word = word;
            this.next = null;
            this.prev = null;
        }
    }
}
