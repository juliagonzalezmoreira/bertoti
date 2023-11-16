import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Funcionario> ordenarFuncionarioPorNome(){
        List<Funcionario> funcionarioEncontradosporNome = new ArrayList<>(funcionarios);
        Collections.sort(funcionarioEncontradosporNome, new Funcionario.ComparatorPorNome());
        return funcionarioEncontradosporNome;
    }

    public List<Funcionario> ordenarFuncionarioPorCpf(){
        List<Funcionario> funcionarioEncontradosporCpf = new ArrayList<>(funcionarios);
        Collections.sort(funcionarioEncontradosporCpf, new Funcionario.ComparatorPorCpf());
        return funcionarioEncontradosporCpf;
    }

    public List<Funcionario> funcionarioList() {
        return funcionarios;
    }
}
