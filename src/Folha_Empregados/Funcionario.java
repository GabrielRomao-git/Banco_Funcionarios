package Folha_Empregados;

public abstract class Funcionario {

    private String name;
    private final double salario_base = 2000;
    private int matricula;


    Funcionario(String name, int matricula){
        this.name = name;
        this.matricula = matricula;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public String getName() {
        return name;
    }

    public int getMatricula() {
        return matricula;
    }

    public abstract void listar();


}
