package unidade04;

public class App {

	public static void main(String[] args) {
		
		ServidorPublico servidor = new ServidorPublico(2, "Luiz Eduardo", "IFRN", "Estudante", "Natal", "luizeduardo@gmail.com", 1500);
		Curso curso = new Curso(1, "Matematica para leigos", "EAD", 100, "Luiz Eduardo CO");
		servidor.adicionarCurso(curso);
		servidor.getCursos();
		Dependente dependente = new Dependente("Joao","12312312345", "Masculino", 19);
		servidor.adicionarDependente(dependente);
		servidor.getDependentes();
		Telefone telResidencial = new Telefone("Residencial", "(84)988203324");
		servidor.adicionarTelefone(telResidencial);
		servidor.getTelefones();
		Temporario cleiton = new Temporario(1, "Luiz Cleiton","2 anos", 6000);
		Comissionado jojo = new Comissionado(2, "Maria Jojo", 5000, 5000);
		Estatutario eduardo = new Estatutario(3, "Luiz Eduardo", 3, 25000.60);
		System.out.println(cleiton);
		System.out.println(cleiton.calcularSalarioHorasExtras(20));//Sobrecarga
		System.out.println(cleiton.matricula);
		System.out.println(cleiton.getNome());
		System.out.println(jojo);
		System.out.println(jojo.salario);
		System.out.println(jojo.getMatricula());
		System.out.println(eduardo);
		System.out.println(eduardo.matricula);
		System.out.println(eduardo.getMatricula());
	}
}
