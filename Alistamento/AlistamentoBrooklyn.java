package Alistamento;

import java.util.Scanner;

public class AlistamentoBrooklyn {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do(a) recruta: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "!");

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Seu peso é: " + peso + " kg");
        
        System.out.println("Digite sua altura: ");
        double alturaCm = scanner.nextDouble();
        
        System.out.println("Sua altura é: " + alturaCm + " cm");
        

        if (peso < 50) {
            System.out.println("Você está abaixo do peso ideal para o alistamento!");
        } else if (peso >= 50 && peso <= 100) {
            System.out.println("Você está dentro do peso ideial para o alistamento.");
        } else {
        System.out.println("Você está acima do peso ideal");
        }

        scanner.close();
    }
}

