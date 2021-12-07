package switchExpression;

public class Teste {
	public static void main(String[] args) {

		// Novidade do java 14 - Switch Expressions.
		String nome = "Jo�o";
		switch (nome) {
		case "Renata" -> System.out.println("Acertou: " + nome);
		case "Jo�o" -> System.out.println("Acertou>: " + nome);
		default -> System.out.println("Nenhum nome encontrado");
		}
		
		/* Modo antigo
		String nome = "Jo�o";
		switch (nome) {
		case "Renata": {
			System.out.println("Acertou: " + nome);
			break;
		}
		case "Jo�o": {
			System.out.println("Acertou>: " + nome);
			break;
		}
		default:
			System.out.println("Nenhum nome encontrado");
		}
		*/
		
	}

}
