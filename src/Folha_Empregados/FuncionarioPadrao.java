package Folha_Empregados;

public class FuncionarioPadrao extends Funcionario {

    public FuncionarioPadrao(String name, int matricula) {
        super(name, matricula);
    }

    @Override
    public void listar(){
        System.out.print("Nome " + super.getName()
                + "\nMatricula " + super.getMatricula()
                + "\nSalário " + super.getSalario_base());
    }
}
