public class Disciplina {
    private String materia;
    private String codigo;
    private int cargadeHoras;
    private Professor professorResponsavel;

    public Disciplina(String materia, String codigo, int cargadeHoras, Professor professorResponsavel) {
        this.setCargadeHoras(cargadeHoras);
        this.setMateria(materia);
        this.setCodigo(codigo);
        this.setProfessorResponsavel(professorResponsavel);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargadeHoras() {
        return cargadeHoras;
    }

    public void setCargadeHoras(int cargadeHoras) {
        this.cargadeHoras = cargadeHoras;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}