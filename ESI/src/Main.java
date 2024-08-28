public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.cadastrarFuncionario(new Funcionario("Vitor", 12345678, new Cargo("Júnior")));
        empresa.cadastrarFuncionario(new Funcionario("Ana", 87654321, new Cargo("Pleno")));
        empresa.cadastrarFuncionario(new Funcionario("Maria", 52348765, new Cargo("Sênior")));

        System.out.println(empresa.funcionarioList());
        System.out.println(empresa.ordenarFuncionarioPorNome());
        System.out.println(empresa.ordenarFuncionarioPorCpf());
    }
}
