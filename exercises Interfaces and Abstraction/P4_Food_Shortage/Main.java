package Food_Shortage;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map< String,Buyer> byers = new HashMap<>();

        for (int i = 1; i <=numberOfPeople ; i++) {

            String input = scanner.nextLine();
            String[] buyerParts = input.split("\\s+");

            if (input.length()==3){
                String rebelName = buyerParts[0];
                int rebelAge = Integer.parseInt(buyerParts[1]);
                String rebeGroup = buyerParts[2];
               Rebel rebel = new Rebel(rebelName,rebelAge,rebeGroup);

            }else if (input.length()==4){
                String citizenName = buyerParts[0];
                int citizenAge = Integer.parseInt(buyerParts[1]);
                String citizenId= buyerParts[2];
                String citizenBirthDate = buyerParts[3];

                Citizen citizen = new Citizen(citizenName,citizenAge,citizenId,citizenBirthDate);
            }
        }

    }
}
