package src;
import java.util.Scanner;
public class Main{

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       
        int choice;

        do{
            displayMenu();
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Methods.browseTopic();
                    break;
                case 2:
                    Methods.insertTopicBefore();
                    break;
                case 3:
                    Methods.insertTopicAfter();
                    break;
                case 4:
                    Methods.removeTopic();
                    break;
                case 5:
                    Methods.modifyTopic();
                    break;
                case 6:
                    Methods.searchTopicsForWord();
                    break;
                case 7:
                    Methods.loadFromFile();
                    break;
                case 8:
                    Methods.showWordsStartingWithLetter();
                    break;
                case 9:
                    Methods.saveToFile();
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

}