import Folha_Empregados.*;
public class Main {
    public static void main(String[] args) {

        FuncionarioPadrao batata = new FuncionarioPadrao("GAbbriel", 123);

        Funcionario arroz = new FuncionarioComissionado("Luca", 122, 50, 0.5 );

        System.out.print(batata.getSalario_base());
        System.out.print(arroz.getSalario_base());

    }
}