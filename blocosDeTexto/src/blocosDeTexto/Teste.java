package blocosDeTexto;

public class Teste {

	public static void main(String[] args) {
		
		//Novidade do java 13 - Text Blocks.
		
		/*String texto = "\"Lorem ipsum dolor sit amet, \n"
				+ "consectetur adipiscing elit. \n"
				+ "Etiam eget ligula eu lectus lobortis \n"
				+ "condimentum. Aliquam nonummy auctor massa. \n"
				+ "Pellentesque habitant morbi tristique senectus \n"
				+ "et netus et malesuada fames ac turpis egestas. \n"
				+ "Nulla at risus. Quisque purus magna, auctor et, \n"
				+ "sagittis ac, posuere eu, lectus. Nam mattis, \n"
				+ "felis ut adipiscing.\"";
				*/
		
		//System.out.println(texto);
		
		String textoFormatado = """
				Lorem ipsum dolor sit amet, 
				consectetur adipiscing elit. 
				Etiam eget ligula eu lectus lobortis 
				condimentum. Aliquam nonummy auctor massa. 
				Pellentesque habitant morbi tristique senectus 
				et netus et malesuada fames ac turpis egestas. 
				Nulla at risus. Quisque purus magna, auctor et, 
				sagittis ac, posuere eu, lectus. Nam mattis, 
				felis ut adipiscing.
				""";
		System.out.println(textoFormatado);
	}

}
