package unidade04;

/***********************/
public class Temporario 
extends ServidorPublico {
private static final int VALOR_HORA_EXTRA = 30;
/***********************/
	
	//Atributos
	
	private String contrato;
	private double salario;
	
	//Construtores
	
	public Temporario(int matricula, String nome, String contrato, double salario) {
		super(matricula, nome);
		this.contrato = contrato;
		this.salario = salario;
	}
	
	//Metodos
	
	 public final double calcularSalarioHorasExtras(int horasTrabalhadas) 
	 { 
		double salarioMensal = 0;
		
		salarioMensal = salarioMensal + horasTrabalhadas * VALOR_HORA_EXTRA;
		
		return (this.salario+salarioMensal);
	 }

	//Getters and Setters
	
	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Temporario [matricula=" + matricula + ", nome =" + nome + ", contrato=" + contrato + ", salario=" + salario + "]";
	}
	
}
