//Kekeli Yao Agblobi
//45862028
import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        //Inputing the player details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player Name-");
        String name=scanner.nextLine();
        System.out.println();
        System.out.print("Enter Age-");
        int age=scanner.nextInt();
        System.out.println();
        System.out.print("Enter Height(m)-");
        double height=scanner.nextDouble();
        System.out.println();
        System.out.print("Enter Weight(lbs)-");
        double weight=scanner.nextDouble();
        System.out.println();
        System.out.print("Enter Jersey Number-");
        int jerseyNumber=scanner.nextInt();
        System.out.println();
        
        //Weight and age conversion
        double pound=0.45359237;
        double meter=100;
        double heightCm=height*meter;
        double weightKg=weight*pound;
        int weightKG=(int)weightKg;
        System.out.println("Player Name-"+name);
        System.out.println("Age-"+age);
        System.out.println("Height in centometers-"+heightCm+"cm");
        System.out.println("Weight in kilograms-"+weightKG+"kg");
        System.out.println("Jersey Number-"+jerseyNumber);
       
        //Checking Player Eligibiliy
        if (age>=18 && age<=35){
            if(weightKG<90){
                String eligible="Eligible";
                System.out.println("Eligibility:"+eligible);
                
            }else{
                String eligible="Not Eligible";
                System.out.println("Eligibility:"+eligible);
            }
        }else{
            String eligible="Not Eligible";
            System.out.println("Eligibility:"+eligible);
        }
        
        //Checking Player Category
        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        System.out.println("Category: " + category);

        //Determining Player Position
        switch (jerseyNumber){
            case 1:
                System.out.println("Position: Goalkeeper");
                System.out.println("Attacker jersey:No");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                System.out.println("Attacker jersey:No");
                break;
            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                System.out.println("Attacker jersey:No");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                System.out.println("Attacker jersey:Yes");
                break;
            case 9:
                System.out.println("Position: Striker");
                System.out.println("Attacker jersey:Yes");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                System.out.println("Attacker jersey:Yes");
                break;
            default:
                System.out.println("Position: Player postion not known");
                System.out.println("Attacker jersey:No");
                break;
        }
        //Checking Player Lineup Decision
        String lineup;
        if (category.equals("Prime Player")) {
            if (weightKG < 80) {
                lineup = "Starting Lineup";
            } else {
                lineup = "Bench";
            }
        } else {
            lineup = "Bench";
        }
        System.out.println("Lineup: " + lineup);

        //Final Conversion
        String finalDecision = (age >= 18 && age <= 35 && weightKG < 90) ? "Play" : "Rest";
        System.out.println("Final Decision: " + finalDecision);
    }
}