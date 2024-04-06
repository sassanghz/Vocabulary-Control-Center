package src;
import java.util.LinkedList;
import java.util.Scanner;
public class Methods {

    public static LinkedList<Vocab> vocabList = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);
    
    public static void browseTopic() {
        System.out.println("---------------------------");
        System.out.println("      Pick a topic ");
        System.out.println("---------------------------");
        int index = 1;
        for (Vocab vocab : vocabList) {
            System.out.println(index + ". " + vocab.getTopic());
            index++;
        }
        System.out.println("0. Exit");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        if (choice > 0 && choice <= vocabList.size()) {
            System.out.println(vocabList.get(choice - 1));
        } else if (choice != 0) {
            System.out.println("Invalid choice.");
        }
    }

    public static void insertTopicBefore(){}

    public static void insertTopicAfter(){}

    public static void removeTopic(){}

    public static void modifyTopic(){}

    public static void searchTopicsForWord(){}

    public static void loadFromFile(){}

    public static void showWordsStartingWithLetter(){}

    public static void saveToFile(){}
}
