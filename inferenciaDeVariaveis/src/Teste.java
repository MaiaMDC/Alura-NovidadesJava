import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {
		
		/*
		HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "04813189");
		System.out.println(cpfPorNomes);
		*/
		
		//Novidade do Java 10 - Infer�ncia de vari�vel.
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "04813189");
		System.out.println(cpfPorNomes);
		
	}

}
