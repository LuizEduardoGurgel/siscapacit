package unidade04;

/***********************/
public class Telefone {
/***********************/
	
	//Atributos
	private String tipo;
	private String numero;
	
	//Construtores
	
	public Telefone() {
		
	}
	
	public Telefone(String tipo, String numero) {
		this.tipo = tipo;
		this.numero = numero;
	}
	
	//Getters and Setters
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//String toString
	
	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", numero=" + numero + "]";
	}
	
	
	
}
