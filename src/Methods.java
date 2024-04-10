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

    public static void insertTopicBefore() {
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
        sc.nextLine(); // Consume the newline character after reading int
    
        if (choice == 0) {
            return; // Exit if the choice is 0
        } else if (choice > 0 && choice <= vocabList.size()) {
            // Get the new topic name from the user
            System.out.println("Enter a new topic name:");
            String newTopicName = sc.nextLine().trim();
    
            // Check if the new topic already exists
            boolean topicExists = false;
            for (Vocab vocab : vocabList) {
                if (vocab.getTopic().equalsIgnoreCase(newTopicName)) {
                    topicExists = true;
                    break;
                }
            }
    
            if (topicExists) {
                System.out.println("Topic already exists.");
            } else {
                // Create a new Vocab object with the new topic
                Vocab newTopic = new Vocab(newTopicName);
    
                // Add words to the new topic until the user presses enter
                System.out.println("Enter words for the new topic. Press Enter to finish.");
                while (true) {
                    String word = sc.nextLine().trim();
                    if (word.isEmpty()) {
                        break; // Exit the loop if the user presses Enter
                    }
                    newTopic.addWord(word);
                }
    
                // Add the new topic to the beginning of the vocabList
                vocabList.addFirst(newTopic);
                System.out.println("New topic added successfully.");
            }
        } else {
            System.out.println("Invalid choice.");
            return;
        }
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
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 0){
            return;
        }else if(choice > 0 && choice <= vocabList.size()){
            System.out.println("Enter a new topic name:");
            String newTopic = sc.nextLine().trim();

            boolean topicexists = false;
            for(Vocab vocab: vocabList){
                if(vocab.getTopic().equalsIgnoreCase(newTopic)){
                    topicexists = true;
                    break;
                }
            }

            if(topicexists){
                System.out.println("Topic already exists.");
            }else{
                Vocab newtopic = new Vocab(newTopic);

                System.out.println("Enter words for the new topic. Press Enter to finish:");
                while(true){
                    String word = sc.nextLine().trim();
                    if(word.isEmpty()){
                        break;
                    }
                    newtopic.addWord(word);
                }

                vocabList.addLast(newtopic);
                System.out.println("New topic added successfully.");
            }
        }else{
            System.out.println("Invalid choice.");
            return;
        }
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
        sc.nextLine();
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
        System.out.println("Enter Your Choice: ");
        String choice = sc.nextLine().trim();
        System.out.println("---------------------------");
        System.out.println("      Modify Topics Menu ");
        System.out.println("---------------------------");
        System.out.println(" a add a word");
        System.out.println(" r remove a word");
        System.out.println(" c change a word");
        System.out.println(" 0 Exit");
        System.out.print("--------------------------");
        System.out.println("Enter Your Choice: ");
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
    

    public static void searchTopicsForWord() {
        sc.nextLine();
        System.out.print("Enter the word to search: ");
        String wordToSearch = sc.nextLine().trim();
    
        System.out.println("Topics containing " + wordToSearch + ":");
    
        boolean wordFound = false; // Flag to track if the word is found in any topic
    
        for (Vocab vocab : vocabList) {
            boolean topicContainsWord = false; // Flag to track if the topic contains the word
            System.out.println("Checking topic: " + vocab.getTopic());
            for (String word : vocab.getWords()) {
                System.out.println("Checking word: " + word);
                if (word.equalsIgnoreCase(wordToSearch)) {
                    topicContainsWord = true;
                    wordFound = true; // Update the flag for the entire search
                    break; // No need to continue checking other words in this topic
                }
            }
            if (topicContainsWord) {
                System.out.println("Topic found in: " + vocab.getTopic());
            } else {
                System.out.println(wordToSearch + " not found in " + vocab.getTopic());
            }
        }
    
        if (!wordFound) {
            System.out.println("Word '" + wordToSearch + "' not found in any topic.");
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
        sc.nextLine(); // Consume newline character
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
