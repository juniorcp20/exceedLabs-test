
public class q1 {

	public static void main(String[] args) {
		
		boolean b = false,c;
		// Essa é uma forma abreviada de usar o o bloco if else, utilizada para melhor legibilidade
		// A leitura seria: se b eh true então c recebe negação de true(false) senão c recebe o valor boolean de b(false).
		// Logo, em ambos os casos, c recebe false.
		c = b ? !b : b;  
		System.out.println(c);
	}

}
