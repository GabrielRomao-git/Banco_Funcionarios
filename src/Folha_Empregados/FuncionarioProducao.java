package Folha_Empregados;

public class FuncionarioProducao extends Funcionario {

    private double salario;

    public FuncionarioProducao(String name , int matricula, double valor_peca, int quantidade_produzida) {
        super(name, matricula);
        this.salario = getSalario_base() + calculoProdutividade(valor_peca,quantidade_produzida);
    }

    public double calculoProdutividade(double valor, int quantidade){
        double bonus = valor * quantidade;
        return bonus;
    }

    @Override
    public void listar(){
        System.out.print("Nome " + super.getName()
                + "\nMatricula " + super.getMatricula()
                + "\nSalário " + super.getSalario_base());
    }

}
