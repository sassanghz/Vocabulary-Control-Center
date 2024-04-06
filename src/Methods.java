package src;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
            System.out.println(index + ": " + vocabList.get(choice - 1));
        } else if (choice != 0) {
            System.out.println("option out of range, try again!");
        }
    }

    public static void insertTopicBefore(){
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
        String choice = sc.nextLine().trim();
        System.out.println("Enter a topic name:");
        //insert a node 'topic' before the selected topic name and add it
    }

    public static void insertTopicAfter(){
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
        String choice = sc.nextLine().trim();
        System.out.println("Enter a topic name:");
    }

    public static void removeTopic(){
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
        String choice = sc.nextLine().trim();
    }

    public static void modifyTopic(){
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
        String choice = sc.nextLine().trim();
        System.out.println("---------------------------");
        System.out.println("      Modify Topics Menu ");
        System.out.println("---------------------------");
    }

    public static void searchTopicsForWord(){}

    public static void loadFromFile(){
        System.out.print("Enter the name of the input file: ");
        String fileName = sc.nextLine().trim();
        Scanner fileScanner = null;

        try{
            fileScanner = new Scanner(new FileReader(fileName));
            vocabList.clear();
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.startsWith("#")) {
                    Vocab vocab = new Vocab(line.substring(1));
                    vocabList.add(vocab);
                } else if (!line.isEmpty()) {
                    vocabList.getLast().addWord(line);
                }
            }
            System.out.println("Done loading.");

        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }finally{
            fileScanner.close();
        }
    }

    public static void showWordsStartingWithLetter(){}

    public static void saveToFile(){}
}
