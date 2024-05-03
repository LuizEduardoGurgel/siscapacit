/*************************************/
package unidade04;

import java.util.LinkedList;
import java.util.List;

/*************************************/

/*
 * Autor: Luiz Eduardo Gurgel Marcelino de Oliveira
 * Versão: 1.0
 * Descrição: Classe que representa os Servidores Públicos.
 */

/****************************/
public class ServidorPublico {
/****************************/
	 
	 /*ATRIBUTOS*/
	 private static final int VALOR_HORA_EXTRA = 40;
	 protected int matricula; 
	 protected String nome; 
	 protected String orgao; 
	 protected String cargo; 
	 protected String lotacao; 
	 protected String email;
	 protected double salario; 
	 
	 //Reuso - Associação - "é usado por"
	 
	 private List<Curso> cursos = new LinkedList<Curso>();
	 
	 public void adicionarCurso(Curso curso) {
		 cursos.add(curso);
	 }
	 
	 public void listarCursos() {
		 for(Curso curso : cursos) {
			 System.out.println("Curso: "+ curso.getNome());
		 }
	 }
	 
	 //Reuso - Agregação - "é parte de"
	 
	 private List<Dependente> dependentes = new LinkedList<Dependente>();
	 
	 public void adicionarDependente(Dependente dependente) {
		 dependentes.add(dependente);
	 }
	 
	 //Reuso - Composição - "é parte essencial de"
	
	 private List<Telefone> telefones =  new LinkedList<Telefone>();
	 
	 public void adicionarTelefone(Telefone telefone) {
		 telefones.add(telefone);
	 }
	 
	 public void listarTelefones() {
		 for(Telefone telefone : telefones) {
			 System.out.println("Tipo: "+telefone.getTipo());
		 }
	 }
	 /*CONSTRUTORES*/
	 
	 public ServidorPublico(){
		 
	 }
	 
	 public ServidorPublico(int matricula, String nome, String orgao, String cargo, String lotacao, String email, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.orgao = orgao;
		this.cargo = cargo;
		this.lotacao = lotacao;
		this.email = email;
		this.salario = salario;
	}
	 
	 public ServidorPublico(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	 
	/*METODOS*/
	 
	 public final double calcularSalarioHorasExtras(int... horasTrabalhadas) 
	 { 
		double salarioHorasExtras = 0;
		for(int horasExtras : horasTrabalhadas)
			salarioHorasExtras = salarioHorasExtras + horasExtras * VALOR_HORA_EXTRA;
		return (salario+salarioHorasExtras);
	 }
	 
	/*GETTERS AND SETTERS*/
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getOrgao() {
		return orgao;
	}
	
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getLotacao() {
		return lotacao;
	}
	
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void getCursos() {
		for(Curso curso : cursos) 
			System.out.println(curso);
	}

	public void setCursos(Curso curso) {
		this.cursos.add(curso);
	}

	public void getDependentes() {
		for(Dependente dependente : dependentes) 
			System.out.println(dependente);	
	}

	public void setDependentes(Dependente dependente) {
		this.dependentes.add(dependente);
	}

	public void getTelefones() {
		for(Telefone telefone : telefones) 
			System.out.println(telefone);
	}

	public void setTelefones(Telefone telefone) {
		this.telefones.add(telefone);
	}

	@Override
	public String toString() {
		return "ServidorPublico [matricula=" + matricula + ", nome=" + nome + ", orgao=" + orgao + ", cargo=" + cargo
				+ ", lotacao=" + lotacao + ", email=" + email + ", salario=" + salario + "]";
	} 
	 
	 
}
