package unidade04;

/***********************/
public class Comissionado 
extends ServidorPublico{
private static final int VALOR_HORA_EXTRA = 50;
/***********************/
	
	//Atributos
	
	private double comissao;
	private double salarioFixo;
	
	//Contrutores
	
	public Comissionado(int matricula, String nome, double comissao, double salarioFixo) {
		super(matricula, nome);
		this.comissao = comissao;
		this.salarioFixo = salarioFixo;
		super.salario = this.comissao + this.salarioFixo;
	}
	
	//Metodos
	
	public final double calcularSalarioHorasExtras(int horasTrabalhadas) 
	 { 
		double salarioMensal = 0;
		
		salarioMensal = salarioMensal + horasTrabalhadas * VALOR_HORA_EXTRA;
		
		return (this.salario+salarioMensal);
	 }
	
	//Getters and Setters
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	@Override
	public String toString() {
		return "Comissionado [matricula=" + matricula + ", nome =" + nome + ", comissao=" + comissao + ", salarioFixo=" + salarioFixo + "]";
	}

}
