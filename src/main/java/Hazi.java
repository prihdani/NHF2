import java.util.Scanner;
public class Hazi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Milyen nyelven szeretnél beszélni? --> Olasz; Magyar; Angol; ");
        String nyelv = scanner.nextLine();
        System.out.println("Hogy hívnak?");
        String neve = scanner.nextLine();

        if (nyelv.equals("Magyar")){
            System.out.println("Szia "+neve+"!");}
        else if (nyelv.equals("Angol")){
            System.out.println("Hello "+neve+"!");
        } else if (nyelv.equals("Olasz")) {
            System.out.println("Ciao "+neve+"!");}
        else{
            System.out.println("Sajnálom "+neve+", nem ismerek ilyen nyelvet!");
        }


    }


}
