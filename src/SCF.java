import java.util.Scanner;

public class SCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            System.out.println("Scrivi sasso, carta o forbice, oppure \"q\" per uscire:");
            userChoice = scanner.nextLine().toLowerCase().trim();

            try {
                Integer userValue = getUserChoice(userChoice);
                if (userValue == -1) {
                    System.out.println("Alla prossima!");
                    break;
                }
                if (userValue == 0) {
                    System.out.println("Input non valido! Riprova.");
                    continue;
                }

                Integer computerChoice = getComputerChoice();
                System.out.println(getResult(userValue, computerChoice) + "\n");
            } catch (Exception e) {
                System.out.println("Si è verificato un errore: " + e.getMessage());
            }
        } while (!userChoice.equals("q"));
        
        scanner.close();
    }

    public static Integer getComputerChoice() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Integer getUserChoice(String userChoice) {
        return switch (userChoice) {
            case "sasso" -> 1;
            case "carta" -> 2;
            case "forbice" -> 3;
            case "q" -> -1;
            default -> 0;
        };
    }

    public static String getResult(Integer userChoice, Integer computerChoice) {
        String[] choices = {"", "sasso", "carta", "forbice"};
        String userString = choices[userChoice];
        String computerString = choices[computerChoice];
        
        if (userChoice.equals(computerChoice)) {
            return "Hai scelto " + userString + " e il computer ha scelto " + computerString + ". Pareggio!";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            return "Hai scelto " + userString + " e il computer ha scelto " + computerString + ". Hai vinto!";
        } else {
            return "Hai scelto " + userString + " e il computer ha scelto " + computerString + ". Hai perso!";
        }
    }
}
