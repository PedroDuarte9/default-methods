package application;

import services.BrasilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double amount = sc.nextDouble();
        System.out.println("Digite o tempo em meses: ");
        int months = sc.nextInt();

        InterestService bis = new BrasilInterestService(2.0);
        double recebe = bis.payment(amount, months);

        System.out.println("Pagamento após " + months + " meses: ");
        System.out.printf("%.2f" , recebe);



        sc.close();

        /*Considerações Importantes:
        * - Sim: agora as intefaces podem prover reuso
        *
        * - Sim: agora temos uma forma de herança múltipla
        *   - Mas o compilador reclama se houver mais de um método com a mesma assinatura, obrigado a sobrescreve-lo*

        INTERFACES ainda são bem diferentes de classes abstratas. Interfaces não possuem recursos tais como construtores e atributos.
         */

    }
}
