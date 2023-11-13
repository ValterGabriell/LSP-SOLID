public class Main {
    public static void main(String[] args) {
        ProfissionalDeSaude medico = new Medico("Dr. Smith");
        ProfissionalDeSaude enfermeiro = new Enfermeiro("Enf. Johnson");
        ProfissionalDeSaude estagiario = new Estagiario("Est. Davis");

        ((Enfermeiro) enfermeiro).iSetSupervisor(medico.getNome());
        ((Estagiario) estagiario).iSetSupervisor(enfermeiro.getNome());

        System.out.println("Médico: " + medico.realizarAtendimento()  + " - Supervisor " +
                medico.getSupervisor());
        System.out.println("Enfermeiro: " + enfermeiro.realizarAtendimento() + " - Supervisor " +
                enfermeiro.getSupervisor());
        System.out.println("Estagiário: " + estagiario.realizarAtendimento() + " - Supervisor " +
                estagiario.getSupervisor());
    }
}