import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("---------------------------------");
        System.out.println("\t + Vocabulary Control Center ");
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
        System.out.println("Enter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Exiting the Program!");
                System.exit(0);
                break;

            case 1:
                System.out.println("---------------------------");
                System.out.println("\t + Pick a topic ");
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
}