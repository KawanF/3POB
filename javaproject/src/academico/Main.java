package academico;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor("257","Bispo","Meier","01234567891","Matemática");
		System.out.println("matricula: " + professor.getMatricula());
		System.out.println("nome: " + professor.getNome());
		System.out.println("cpf: " + professor.getCpf());
		System.out.println("endereço: " + professor.getEndereço());
	}

}

/*	public static void main(String[] args) {
// TODO Auto-generated method stub
Aluno aluno = new Aluno("211012","Kawan","Copa","169");
System.out.println("matricula: " + aluno.getMatricula());
System.out.println("nome: " + aluno.getNome());
System.out.println("cpf: " + aluno.getCpf());
System.out.println("endereço: " + aluno.getEndereço());
}*/