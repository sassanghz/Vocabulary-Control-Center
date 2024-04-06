import java.util.LinkedList;
import java.util.Scanner;
public class Main{

    private static LinkedList<Vocab> vocabList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       
        int choice;

        do{
            displayMenu();
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    browseTopic();
                    break;
                case 2:
                    insertTopicBefore();
                    break;
                case 3:
                    insertTopicAfter();
                    break;
                case 4:
                    removeTopic();
                    break;
                case 5:
                    modifyTopic();
                    break;
                case 6:
                    searchTopicsForWord();
                    break;
                case 7:
                    loadFromFile();
                    break;
                case 8:
                    showWordsStartingWithLetter();
                    break;
                case 9:
                    saveToFile();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }


        }while(choice != 0);

        switch (choice) {
            case 0:
                System.out.println("Exiting the Program!");
                System.exit(0);
                break;

            case 1:
                System.out.println("---------------------------");
                System.out.println("      Pick a topic ");
                System.out.println("---------------------------");
                System.out.println(" 1  Sports");
                System.out.println(" 2  Food");
                System.out.println(" 0  Exit");
                System.out.println("---------------------------");
                System.out.println("Enter Your Choice:");
                int choice1 = sc.nextInt();

                switch (choice1) {
                    case 0:
                        System.out.println("Exiting the Program!");
                        System.exit(0);
                        break;
                
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("---------------------------");
                System.out.println("\t + Pick a topic ");
                System.out.println("---------------------------");
                System.out.println(" 1  Sports");
                System.out.println(" 2  Food");
                System.out.println(" 0  Exit");
                System.out.println("---------------------------");
                System.out.println("Enter Your Choice:");
                int choice2 = sc.nextInt();

                switch (choice2) {
                    case 0:
                        System.out.println("Exiting the Program!");
                        System.exit(0);
                        break;
                
                    default:
                        break;
                }
                break;

            case 3:
                System.out.println("---------------------------");
                System.out.println("\t + Pick a topic ");
                System.out.println("---------------------------");
                System.out.println(" 1  Fruits");
                System.out.println(" 2  Sports");
                System.out.println(" 3 Food");
                System.out.println(" 0  Exit");
                System.out.println("---------------------------");
                System.out.println("Enter Your Choice:");
                int choice3 = sc.nextInt();

                switch (choice3) {
                    case 0:
                    System.out.println("Exiting the Program!");
                    System.exit(0);
                    break;
                
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        sc.close();

    }

    private static void displayMenu(){
        System.out.println("---------------------------------");
        System.out.println("   Vocabulary Control Center");
        System.out.println("---------------------------------");
        System.out.println("1  browse a topic");
        System.out.println("2  insert a new topic before another one");
        System.out.println("3  insert a new topic after another one");
        System.out.println("4  remove a topic");
        System.out.println("5  modify a topic");
        System.out.println("6  search topics for a word");
        System.out.println("7  load from a file");
        System.out.println("8  show all words starting with a given letter");
        System.out.println("9  save to file");
        System.out.println("0  exit");
        System.out.println("---------------------------------");
    }

    private static void browseTopic() {
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

    private static void insertTopicBefore(){}

    private static void insertTopicAfter(){}

    private static void removeTopic(){}

    private static void modifyTopic(){}

    private static void searchTopicsForWord(){}

    private static void loadFromFile(){}

    private static void showWordsStartingWithLetter(){}

    private static void saveToFile(){}
}