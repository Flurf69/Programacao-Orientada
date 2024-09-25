import java.util.ArrayList;

public class Turma {

    private String disciplina;
    private Professor professor;
    private ArrayList<Aluno>aluno;
    private Turno turno;


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void incluirAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.aluno.remove(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem(){
        return null;
    }


}
