package academico;

public class Professor {
	private String matricula;
	private String nome;
	private String endereço;
	private String cpf;
	private String disciplina;
	
	public Professor(String _matricula, String _nome, String _endereço, String _cpf, String _disciplina) {
		matricula = _matricula;
		nome = _nome;
		endereço = _endereço;
		cpf = _cpf;
		disciplina = _disciplina;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
}