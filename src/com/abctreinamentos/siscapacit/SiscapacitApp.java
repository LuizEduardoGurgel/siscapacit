/*************************************/
package com.abctreinamentos.siscapacit;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.LinkedList;

/*************************************/

/***************************/
public class SiscapacitApp {
	/***************************/
	//Atributos
	List<ServidorPublico> servidores = new LinkedList<>();
	List<Curso> cursos = new LinkedList<>();

	//Metodos CRUD - Servidor Publico

	public void adicionarServidorPublico() {

		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String orgao = JOptionPane.showInputDialog("Digite o orgão");
		String cargo = JOptionPane.showInputDialog("Digite o cargo");
		String lotacao = JOptionPane.showInputDialog("Digite a lotação");
		String email = JOptionPane.showInputDialog("Digite o email");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

		ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);
		servidores.add(servidor);
	}

	public void listarServidoresPublicos() 
	{
		for(ServidorPublico servidor : servidores) 
		{
			System.out.println(servidor);
		}
	}

	public void listarServidorPublico(int matricula) {

		boolean encontrou = false;

		for(ServidorPublico servidor : servidores) 
		{
			if(servidor.getMatricula() == matricula) {
				System.out.println(servidor);
				encontrou = true;
				break;
			}
		}
		if(!encontrou)
			System.out.println("O Servidor Público com a matrícula informada não existe.");
	}
	public void alterarServidorPublico(ServidorPublico servidorAlterado) {

		boolean encontrou = false;

		for(ServidorPublico servidor : servidores) 
		{
			if(servidor.getMatricula() == servidorAlterado.getMatricula()){
				servidores.remove(servidor);
				servidores.add(servidorAlterado);
				encontrou = true;
				break;
			}
		}	
		if(!encontrou) 
			System.out.println("O Servidor Público com a matrícula informada não existe.");
		else 
			System.out.println("A alteração do Servidor Público com a matrícula "+servidorAlterado.getMatricula()+" foi realizada com sucesso!");

	}
	public void excluirServidorPublico(int matricula) {
		boolean encontrou = false;
		for(ServidorPublico servidor : servidores) 
		{
			if(servidor.getMatricula() == matricula) {
				servidores.remove(servidor);
				encontrou = true;
				break;
			}
		}
		if(!encontrou) 
			System.out.println("O Servidor Público com a matrícula informada não existe.");
		else 
			System.out.println("A Exclusão do Servidor Público com a matrícula "+matricula+" foi realizada com sucesso!");
	}

	//Metodo Servidor Publico

	public void calcularFolhaServidoresPublicos() 
	{
		double folhaSalarial = 0;
		for(ServidorPublico servidor : servidores) { 
			folhaSalarial = folhaSalarial + servidor.getSalario();;
		}
		System.out.println("A folha salarial é "+folhaSalarial);
	}	

	//Metodos CRUD - Cursos
	public void adicionarCurso() 
	{
		int idcurso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do curso")); 
		String nome = JOptionPane.showInputDialog("Digite o nome do curso"); 
		String formarealizacao = JOptionPane.showInputDialog("Digite a forma de realização do curso");  
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso"));
		String ofertante = JOptionPane.showInputDialog("Digite o ofertante do curso");  

		Curso curso = new Curso(idcurso, nome, formarealizacao, valor, ofertante);
		cursos.add(curso);
	}
	public void listarCursos() {
		for(Curso curso : cursos) {
			System.out.println(curso);
		}
	}
	public void listarCurso(int idCurso) {
		boolean encontrou = false;

		for(Curso curso : cursos)
		{
			if(curso.getIdcurso() == idCurso) {
				System.out.println(curso);
				encontrou = true;
				break;
			}
		}
		if(!encontrou)
			System.out.println("O Curso com a ID informada não existe.");
	}
	public void alterarCurso(Curso cursoAlterado) {

		boolean encontrou = false;

		for(Curso curso : cursos) 
		{
			if(curso.getIdcurso() == cursoAlterado.getIdcurso()){
				cursos.remove(curso);
				cursos.add(cursoAlterado);
				encontrou = true;
				break;
			}
		}	
		if(!encontrou) 
			System.out.println("O Curso com a ID informada não existe.");
		else 
			System.out.println("A alteração do Curso com a ID "+cursoAlterado.getIdcurso()+" foi realizada com sucesso!");

	}
	public void excluirCurso(int idCurso) { 
		boolean encontrou = false;
		for(Curso curso : cursos) 
		{
			if(curso.getIdcurso() == idCurso) {
				cursos.remove(curso);
				encontrou = true;
				break;
			}
		}
		if(!encontrou) 
			System.out.println("O Curso com a ID informada não existe.");
	}

	public static void main(String[] args) {
		SiscapacitApp sistema = new SiscapacitApp();

		//sistema.adicionarServidorPublico();
		//sistema.adicionarServidorPublico();
		//sistema.listarServidoresPublicos();
		//sistema.calcularFolhaServidoresPublicos();
		//sistema.listarServidorPublico(2);
		//sistema.excluirServidorPublico(1);
		ServidorPublico servidorAlterado = new ServidorPublico(2, "Luiz Eduardo", "IFRN", "Estudante", "Natal", "luizeduardo@gmail.com", 0);
		//sistema.alterarServidorPublico(servidorAlterado);
		//sistema.listarServidoresPublicos();
		//sistema.calcularFolhaServidoresPublicos();
		sistema.adicionarCurso();
		sistema.adicionarCurso();
		sistema.listarCursos();
		sistema.listarCurso(1);
		sistema.excluirCurso(2);
		Curso cursoAlterado = new Curso(1, "Matematica para leigos", "EAD", 50, "Luiz Eduardo CO");
		sistema.alterarCurso(cursoAlterado);
		sistema.listarCursos();
	}

}
