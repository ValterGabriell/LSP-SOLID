class Enfermeiro extends ProfissionalDeSaude implements ISupervisor{
    public Enfermeiro(String nome) {
        super(nome);
    }

    @Override
    public String realizarAtendimento() {
        return "Realizando cuidados de enfermagem";
    }

    @Override
    public void iSetSupervisor(String supervisor) {
        this.setSupervisor(supervisor);
    }
}
