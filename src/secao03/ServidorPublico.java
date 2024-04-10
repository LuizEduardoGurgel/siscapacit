package secao03;

public class ServidorPublico {
	
	/*** CONSTRUTORES ***/
	
	public ServidorPublico() {
		
	}
	
	 public ServidorPublico(int matricula, String nome, String cargo) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
	}
	 
	public ServidorPublico(int matricula, String nome, String foto, String orgao, String vinculo, double salario,
			int idade, int tempoContribuicao, String cargo, String lotacao, String exercicio, String email,
			String telefone, String celular, String cpf, String naturalidade) {
		this.matricula = matricula;
		this.nome = nome;
		this.foto = foto;
		this.orgao = orgao;
		this.cargo = cargo;
		this.lotacao = lotacao;
		this.email = email;
		this.salario = salario;
		this.idade = idade;
		this.tempoContribuicao = tempoContribuicao;
		this.vinculo = vinculo;
		this.exercicio = exercicio;
		this.telefone = telefone;
		this.celular = celular;
		this.cpf = cpf;
		this.naturalidade = naturalidade;
	}
	
	/*** ATRIBUTOS ***/
	
	 private Avaliacao avaliacao; // tipo enum
	 private final int VALOR_HORA_EXTRA = 40; // atributo fixo (nao muda nunca)
	 private static int totalServidores; //atributo de classe
	 private int matricula; 
	 private String nome; 
	 private String foto; 
	 private String orgao; 
	 private String vinculo; 
	 private double salario; 
	 private int idade; 
	 private int tempoContribuicao;
	 private String cargo; 
	 private String lotacao; 
	 private String exercicio; 
	 private String email; 
	 private String telefone; 
	 private String celular; 
	 private String cpf; 
	 private String naturalidade;

	/*** METODOS + GET/SET***/
	 
	 
	public static int getTotalServidores() { //metodo de classe
		 return totalServidores;
	}
	 
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTempoContribuicao() {
		return tempoContribuicao;
	}

	public void setTempoContribuicao(int tempoContribuicao) {
		this.tempoContribuicao = tempoContribuicao;
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

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	public final double calcularSalarioHorasExtras(int... horasTrabalhadas) 
	 { 
		double salarioHorasExtras = 0;
		for(int horasExtras : horasTrabalhadas)
			salarioHorasExtras = salarioHorasExtras + horasExtras * VALOR_HORA_EXTRA;
		return (salario+salarioHorasExtras);
	 }
	
	/*public String tamanhoNomeSobrenome(String nome) {  <--- OQ EU FIZ/ TENTEI FAZER tava no caminho so faltou acertar
		int tamanhoNome = nome.length();
		boolean prenome = nome.startsWith() ????????
		return tamanhoNome,y,z;
	}*/
	
	public void mostrarTamanhoNome() {
		System.out.println(this.nome.length()-1);
	}
	
	public void mostrarPreNome() {
		System.out.println(this.nome.substring(0, nome.indexOf(" ")));
	}
	
	public void mostrarSobreNome() {
		System.out.println(this.nome.substring(nome.indexOf(" ")+1, nome.length()));
	}

	public static void main(String[] args) {
		
		ServidorPublico isabela = new ServidorPublico(1, "Isabela Sampaio", "Auditor");
		totalServidores++;
		isabela.setSalario(5000);
		//System.out.println(isabela.calcularSalarioHorasExtras(10));
		isabela.mostrarTamanhoNome();
		isabela.mostrarPreNome();
		isabela.mostrarSobreNome();
		isabela.setAvaliacao(Avaliacao.EXCELENTE);
		
		ServidorPublico heila =  new ServidorPublico(2, "Heila Ghassan", "Estagiário");
		totalServidores++;
		heila.setAvaliacao(Avaliacao.INSATISFATORIO	);
		//System.out.println(heila.nome);
		
		ServidorPublico maria = new ServidorPublico(3, "Maria Fontanele", "Analista");
		totalServidores++;
		//System.out.println(maria.cargo);
		
		ServidorPublico caio = new ServidorPublico(4, "Caio Santos", "Analista Tributário");
		totalServidores++;
		caio.setAvaliacao(Avaliacao.BOM);
		
		//System.out.println(caio.matricula);
		
		ServidorPublico luiz = new ServidorPublico(5, "Luiz Eduardo", "dudu.png", "Não possui", "IFRN", 1500, 18, 3, "Estudante", "Rio Grande do Norte", "Não possui", "luizeduardogurgel@gmail.com", "(84)987279389", "(84)987279389", "154.616.564-98", "Natalense");
		totalServidores++;
		//System.out.println(luiz.nome);
		
		ServidorPublico leandro = new ServidorPublico();
		totalServidores++;
		//System.out.println(leandro.cargo);
		//System.out.println(getTotalServidores()); 	
	}

}
