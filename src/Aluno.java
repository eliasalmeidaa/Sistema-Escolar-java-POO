public class Aluno extends Usuario {

    private String matricula;
    private String curso;

    public Aluno(String nome, String email, String cpf, String matricula, String curso){
        super(nome,email,cpf);
        this.setCurso(curso);
        this.setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
