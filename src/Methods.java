package src;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        int topicChoice = readTopicChoice();
        System.out.println("---------------------------");
        if(topicChoice >= 1 && topicChoice <= vocabList.size()){
            Vocab selectedTopic = vocabList.remove(topicChoice - 1);
            System.out.println("Topic has been removed from list: " + selectedTopic.getTopic());
        }else{
            System.out.println("Invalid topic choice.");
        }


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
        System.out.println(" a add a word");
        System.out.println(" r remove a word");
        System.out.println(" c change a word");
        System.out.println(" 0 Exit");
        System.out.println("--------------------------");
        System.out.print("Enter Your Choice: ");
        String choice5 = sc.next().toLowerCase();
        sc.nextLine(); // Consume the newline character
    
        switch(choice5){
            case "0":
                break;
            case "a":
                System.out.println("Enter the word to add:");
                String wordToAdd = sc.nextLine().trim();
    
                System.out.println("Select the topic to add the word to:");
                int topicChoice = readTopicChoice();
    
                if(topicChoice >= 1 && topicChoice <= vocabList.size()){
                    Vocab selectedTopic = vocabList.get(topicChoice - 1);
                    selectedTopic.addWord(wordToAdd);
                    System.out.println("Word has been added to the topic: " + selectedTopic.getTopic());
                }else{
                    System.out.println("Invalid topic choice.");
                }
                break;
            case "r":
                System.out.println("Enter the word to remove:");
                String wordToRemove = sc.nextLine().trim();
    
                System.out.println("Select the topic to remove the word from:");
                int topicChoice2 = readTopicChoice();
    
                if(topicChoice2 >= 1 && topicChoice2 <= vocabList.size()){
                    Vocab selectedTopic2 = vocabList.get(topicChoice2 - 1);
                    selectedTopic2.removeWord(wordToRemove);
                    System.out.println("Word has been removed from the topic: " + selectedTopic2.getTopic());
                }else{
                    System.out.println("Invalid topic choice.");
                }
                break;
            case "c":
                System.out.println("Enter the word to change:");
                String wordToChange = sc.nextLine().trim();
    
                sc.nextLine();
                System.out.println("Select the topic to change the word from:");
                int topicChoice3 = readTopicChoice();
    
                if(topicChoice3 >= 1 && topicChoice3 <= vocabList.size()){
                    Vocab selectedTopic3 = vocabList.get(topicChoice3 - 1);
                    LinkedList<String> wordsList = selectedTopic3.getWords();
                    
                    if(wordsList.contains(wordToChange)){
                        System.out.println("Enter the new word:");
                        String newWord = sc.nextLine().trim();
    
                        wordsList.set(wordsList.indexOf(wordToChange), newWord);
                        System.out.println("Word changed in the topic: " + selectedTopic3.getTopic());
                    }else{
                        System.out.println("Word not found in the selected topic.");
                    }
                }else{
                    System.out.println("Invalid topic choice.");
                }
                break;
            default:
                System.out.println("Incorrect User Input!");
                break;
        }
    }
    

    public static void searchTopicsForWord(){
        
        System.out.print("Enter the word to search: ");
        String wordToSearch = sc.nextLine().trim();
        
        System.out.println("Topics containing " + wordToSearch + ":");
        
        for (Vocab vocab : vocabList) {
        
            if (vocab.getWords().contains(wordToSearch)) {
                System.out.println("Topic found in: " + vocab.getTopic());
            }else if(!vocab.getWords().contains(wordToSearch)){
                System.out.println(wordToSearch + " not found in " + vocab.getTopic());
            }
        }
    }

    public static void loadFromFile(){
        // USER INPUT
        System.out.print("Enter the name of the input file: ");
        String fileName = sc.nextLine().trim();
        Scanner fileScanner = null;

        try{
            //READ FILE
            fileScanner = new Scanner(new FileReader(fileName));
            vocabList.clear();
            
            // READ EACH LINE
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                // SPECIFY WHICH LINE TO PICK
                if (line.startsWith("#")) {
                    Vocab vocab = new Vocab(line.substring(1));
                    // ADD TO THE ARRAYLIST
                    vocabList.add(vocab);
                } else if (!line.isEmpty()) {
                    // ADD REST OF LINES
                    vocabList.getLast().addWord(line);
                }
            }
            System.out.println("Done loading.");

        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }finally{
            // CLOSE FILE
            fileScanner.close();
        }
    }

    public static void showWordsStartingWithLetter(){
        System.out.print("Enter the letter to filter words: ");
        char letter = sc.nextLine().charAt(0);
        //It reads the input line as a string and extracts the first character
        
        ArrayList<String> filteredWords = new ArrayList<>();
        // The enhanced for loop iterates through each Vocab object in vocabList
        for (Vocab vocab : vocabList) {
            //filters the words in that vocabulary to include only those starting with the specified letter
            filteredWords.addAll(vocab.getWordsStartingWith(letter));
            // addAll is a method of arrayList which is used to add all these words to the list
        }
        
        System.out.println("Filtered words:");
        
        for (String word : filteredWords) {
            /*
             provides a way for the user to see all the words in the vocabulary that start with a particular letter they specify
             */
            System.out.println(word);
        }
    }

    public static void saveToFile(){
        // USER INPUT
        System.out.print("Enter the name of the output file: ");
        
        String fileName = sc.nextLine().trim();
        
        // WRITE TO FILE
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
          
            // ITERATE THROUGH THE LIST
            for (Vocab vocab : vocabList) {
                //WRITE THE TOPIC
                writer.println("# " + vocab.getTopic());
                // ITERATE THROUGH THE WORDS IN LIST
                for (String word : vocab.getWords()) {
                    // WRITE WORDS
                    writer.println(word);
                }
            }
        
            System.out.println("Data saved to file successfully.");
        
        } catch (IOException e) {
            System.out.println("Error saving data to file.");
        }
    }

    private static int readTopicChoice() {
        int topicChoice = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter topic number: ");
            try {
                topicChoice = Integer.parseInt(sc.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid topic number.");
            }
        }
        return topicChoice;
    }
}
