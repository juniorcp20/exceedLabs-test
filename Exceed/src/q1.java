
public class q1 {

	public static void main(String[] args) {
		
		boolean b = false,c;
		// Essa � uma forma abreviada de usar o o bloco if else, utilizada para melhor legibilidade
		// A leitura seria: se b eh true ent�o c recebe nega��o de true(false) sen�o c recebe o valor boolean de b(false).
		// Logo, em ambos os casos, c recebe false.
		c = b ? !b : b;  
		System.out.println(c);
	}

}
