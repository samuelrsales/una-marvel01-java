package Alistamento;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        
        System.out.println("Olá, " + nome + "!");

        scanner.close();
    }
}
