package academico;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor("257","Bispo","Meier","01234567891","Matem�tica");
		System.out.println("matricula: " + professor.getMatricula());
		System.out.println("nome: " + professor.getNome());
		System.out.println("cpf: " + professor.getCpf());
		System.out.println("endere�o: " + professor.getEndere�o());
	}

}

/*	public static void main(String[] args) {
// TODO Auto-generated method stub
Aluno aluno = new Aluno("211012","Kawan","Copa","169");
System.out.println("matricula: " + aluno.getMatricula());
System.out.println("nome: " + aluno.getNome());
System.out.println("cpf: " + aluno.getCpf());
System.out.println("endere�o: " + aluno.getEndere�o());
}*/