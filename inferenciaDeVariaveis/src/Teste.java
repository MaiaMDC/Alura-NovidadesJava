import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {
		
		/*
		HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");
		System.out.println(cpfPorNomes);
		*/
		
		//Novidade do Java 10 - Inferência de variável.
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");
		System.out.println(cpfPorNomes);
		
	}

}
