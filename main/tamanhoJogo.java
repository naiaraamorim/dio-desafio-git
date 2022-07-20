package main;
import java.util.Scanner;
public class tamanhoJogo {
  
	public static void main(String[] args) {
	  //int N = 3;
		Scanner leitor = new Scanner(System.in);
	  int n = leitor.nextInt();
    System.out.println(((n + 1) * (n+2))/2);
    	
	}
}

