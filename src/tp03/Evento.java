package tp03;

public class Evento {

	private static String nomeEvento;
	private static Usuario nomeUs ;
	
	
	public static String setNomeEvento() {
		
		System.out.println("festa do " + Usuario.getNomeUs());
		return nomeEvento;
	}


}
