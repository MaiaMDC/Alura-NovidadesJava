import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	//novidade do JAVA 9 - Factory Method para Collection.
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome", "segundoNome");
		Set.of("TerceiroNome");
		Map.of("nome", "João");
		System.out.println(nomes);
	}

}
