package FinobacciGustavo;
import java.util.Scanner;

public class fibonacci {
	public static boolean pertenceSequenciaFibonacci(int numero) {
	    int a = 5; // declaração das variaveis
	    int b = 10; // declaração das variaveis

	    while (b < numero) {
	      int temp = b; // 10 , 15 , 25
	      b = a + b; // atribuição no caso 5,15,25 + 10 = 25;
	      a = temp; // 10, 15, 25
	      /*
	       * no caso não precisaria do a = temp, mas serve para deixar o código em um
	       * clico perfeito
	       */
	    }
	    return b == numero; // 10 , 15 , 25
	  }

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    int numeroInserido = scanner.nextInt();
	    scanner.close();

	    if (pertenceSequenciaFibonacci(numeroInserido)) {
	      System.out.println("O número " + numeroInserido + " pertence à sequência de Fibonacci.");
	    } else {
	      System.out.println("O número " + numeroInserido + " não pertence à sequência de Fibonacci.");
	    }
	  }
	}

