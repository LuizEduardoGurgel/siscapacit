package unidade04;

/***********************/
public class Estatutario 
extends ServidorPublico{
/***********************/
	
	//Atributos
	
	private int tempoServico;
	private double salarioBase;
	private static final int VALOR_HORA_EXTRA = 50;
	
	//Contrutores
	
	public Estatutario(int matricula, String nome, int tempoServico, double salarioBase) {
		super(matricula, nome);
		this.tempoServico = tempoServico;
		this.salarioBase = salarioBase;
	}
	
	//Metodos
	
	 public final double calcularSalarioHorasExtras(int horasTrabalhadas) 
	 { 
		double salarioMensal = 0;
		
		salarioMensal = salarioMensal + horasTrabalhadas * VALOR_HORA_EXTRA;
		
		return (this.salarioBase+salarioMensal);
	 }
	
	//Getters and Setters
	
	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	@Override
	public String toString() {
		return "Estatutario [matricula=" + matricula + ", nome =" + nome + ", tempoServico=" + tempoServico + ", salarioBase=" + salarioBase + "]";
	}
	
}
