class Medico extends ProfissionalDeSaude {
    public Medico(String nome) {
        super(nome);
    }

    @Override
    public String realizarAtendimento() {
        return "Realizando consulta médica";
    }
}
