import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private List<Disciplina> disciplinas;

    public Curso(String codigo, String nome, int cargaHoraria){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.setDisciplinas(new ArrayList<>());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}