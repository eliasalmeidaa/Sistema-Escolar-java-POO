public class Professor extends Usuario {

    private String salario;
    private String especialidade;

    public Professor(String nome, String cpf, String email, String salario, String especialidade){
        super(nome,cpf,email);
        this.setSalario(salario);
        this.setEspecialidade(especialidade);
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
