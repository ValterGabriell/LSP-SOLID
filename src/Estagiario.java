class Estagiario extends ProfissionalDeSaude implements ISupervisor {
    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public String realizarAtendimento() {
        return "Observando e aprendendo";
    }

    @Override
    public void iSetSupervisor(String supervisor) {
        this.setSupervisor(supervisor);
    }
}
