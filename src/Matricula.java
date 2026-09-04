public class Matricula {
    private String codigo;
    private Aluno alunoMatricula;
    private Disciplina disciplinaMatricula;
    private double nota1;
    private double nota2;
    private double media;

    public Matricula(String codigo, Aluno alunoMatricula, Disciplina disciplinaMatricula, double nota1, double nota2){
        this.codigo=codigo;
        this.alunoMatricula=alunoMatricula;
        this.disciplinaMatricula=disciplinaMatricula;
        this.nota1=nota1;
        this.nota2=nota2;
    }

    public double calcularMedia(){
        media = (nota1 + nota2)/ 2;
        return media;
    }

    public String verificarStatus(){
        if (media >= 7){
            return "Aprovado!!";
        } else if (media >= 5) {
            return "Recuperação!!!";
        }else {
            return "Reprovado!!";
        }
    }
}
