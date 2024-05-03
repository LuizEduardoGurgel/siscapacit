package unidade04;

public class Appv2 {

	public static void verificarTipoServidorPublico(ServidorPublico servidor) {
		
		if(servidor instanceof Estatutario) {
			System.out.println("O servidor é Estatutário");
		}
		else if(servidor instanceof Comissionado) {
			System.out.println("O servidor é Comissionado");
		}
		else if(servidor instanceof Temporario) {
			System.out.println("O servidor é Temporario");
		}
		else {
			System.out.println("Não foi especializado. Permanece Servidor Público");
		}
	}
	
	public static void main(String[] args) {
		
		ServidorPublico isabela = new Comissionado(1, "Isabela Gurgel", 5000, 25000);
		verificarTipoServidorPublico(isabela);
		isabela = new Estatutario(1, "Isabela Gurgel" , 2, 30000);
		verificarTipoServidorPublico(isabela);
		System.out.println(((Estatutario)isabela).getSalarioBase());
		System.out.println(((Estatutario)isabela).getTempoServico());
		
		ServidorPublico pedro = new Temporario(2, "Pedro Feijao", "2 anos", 4000);
		System.out.println(pedro.calcularSalarioHorasExtras(40));
	}

}
