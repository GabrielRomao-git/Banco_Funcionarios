package Folha_Empregados;

public class FuncionarioComissionado extends Funcionario{

    private double salario;
    private double comissao;

    public FuncionarioComissionado(String name, int matricula, int vendas, double percentual) {
        super(name, matricula);
        this.salario = getSalario_base() + calculoComissao(vendas,percentual);
    }

    public double calculoComissao(int vendas, double percentual){
        this.comissao = vendas * percentual / 100;;
        return this.comissao;
    }

    @Override
    public void listar(){
        System.out.print("Nome " + super.getName()
                + "\nMatricula " + super.getMatricula()
                + "\nSalário " + super.getSalario_base());
    }


}
