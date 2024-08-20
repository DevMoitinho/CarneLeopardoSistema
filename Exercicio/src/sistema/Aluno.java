package sistema;

public class Aluno {
	private String nome;
	private int matricula;
	private int cpf;
	
	public Aluno(String nome, int matricula, int cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		
	}
	
	public String exibir() {
		String out = "nome: "+ this.nome;
		out += "\nMatricula: "+ this.matricula;
		out += "\nCPF: "+ this.cpf;
		return out;
	}

}
