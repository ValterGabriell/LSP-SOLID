abstract class ProfissionalDeSaude {
    private String nome;
    private String supervisor;

    public ProfissionalDeSaude(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public abstract String realizarAtendimento();

    public String getSupervisor() {
        if (this instanceof Medico) return "Não há supervisão para médicos";
        return supervisor;
    }
}
