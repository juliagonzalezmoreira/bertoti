import java.util.Comparator;

public class Funcionario {
    private String nome;
    private long Cpf;
    private Cargo cargo;

    public Funcionario(String nome, long cpf, Cargo nomeCargo) {
        this.nome = nome;
        Cpf = cpf;
        this.cargo = nomeCargo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return Cpf;
    }

    public void setCpf(long cpf) {
        Cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int compareTo(Funcionario f) {
        return nome.compareTo(f.getNome());
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", Cpf=" + Cpf +
                ", cargo=" + cargo.getNomeCargo()  + '}';
    }

    static class ComparatorPorNome implements Comparator<Funcionario> {
        @Override
        public int compare(Funcionario f1, Funcionario f2) {
            return f1.getNome().compareTo(f2.getNome());
        }
    }

    static class ComparatorPorCpf implements Comparator<Funcionario>{

        @Override
        public int compare(Funcionario f1, Funcionario f2) {
            return Long.compare(f1.getCpf(), f2.getCpf());
        }
    }
}
