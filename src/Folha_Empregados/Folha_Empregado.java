package Folha_Empregados;
import Folha_Empregados.Funcionario;
import java.util.ArrayList;

public class Folha_Empregado {

    private ArrayList<Funcionario> folha;

    Folha_Empregado(int numero_funcionarios) {
        this.folha = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        folha.add(funcionario);
    }

}
