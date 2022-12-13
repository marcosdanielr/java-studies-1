package javastudies1;

import java.util.Scanner;

public class ClasseScaner {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Escreva seu nome: ");
    String nome = scan.nextLine();

    System.out.println(nome);

    // scan com int
    System.out.println("Escreva sua idade");
    int idade = scan.nextInt();
    // System.out.println("Sua idade é " + idade);

    // System.out.println("Multiplicar");

    // System.out.println("Escreva o primeiro valor: ");
    // int primeiroValor = scan.nextInt();

    // System.out.println("Escreva o segundo valor: ");
    // int segundoValor = scan.nextInt();

    // System.out.println(
    // "Resultado igual de " + primeiroValor + " * " + segundoValor + " é de: " +
    // primeiroValor * segundoValor);

    System.out.printf("Nome: %s \nIdade: %d ", nome, idade);

    scan.close();
  }
}
