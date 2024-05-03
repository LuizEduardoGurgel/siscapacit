/*************************************/
package unidade04;
/*************************************/

/*******************/
public class Curso {
/*******************/	
	/*ATRIBUTOS*/
	private int idcurso; 
	private String nome; 
	private String formarealizacao; 
	private String ofertante;
	private double valor; 

	//Construtores

	public Curso() {

	}

	public Curso(int idcurso, String nome, String formarealizacao, double valor, String ofertante) {
		this.idcurso = idcurso;
		this.nome = nome;
		this.formarealizacao = formarealizacao;
		this.valor = valor;
		this.ofertante = ofertante;
	}

	//Getters and Setters

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormarealizacao() {
		return formarealizacao;
	}

	public void setFormarealizacao(String formarealizacao) {
		this.formarealizacao = formarealizacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getOfertante() {
		return ofertante;
	}

	public void setOfertante(String ofertante) {
		this.ofertante = ofertante;
	}

	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", nome=" + nome + ", formarealizacao=" + formarealizacao + ", ofertante="
				+ ofertante + ", valor=" + valor + "]";
	} 

	

}
