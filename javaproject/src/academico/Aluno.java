package academico;

public class Aluno {
	private String matricula;
	private String nome;
	private String endere�o;
	private String cpf;
	
	public Aluno(String _matricula, String _nome, String _endere�o, String _cpf) {
		matricula = _matricula;
		nome = _nome;
		endere�o = _endere�o;
		cpf = _cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
