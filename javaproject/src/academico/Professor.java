package academico;

public class Professor {
	private String matricula;
	private String nome;
	private String enderešo;
	private String cpf;
	private String disciplina;
	
	public Professor(String _matricula, String _nome, String _enderešo, String _cpf, String _disciplina) {
		matricula = _matricula;
		nome = _nome;
		enderešo = _enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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