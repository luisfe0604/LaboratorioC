import java.util.List;
import java.util.ArrayList;

public class Cadastro {

    private List <Funcionario> BDFunc = new ArrayList <Funcionario> ();
        public void setBDFunc(Funcionario func){
            BDFunc.add(func);
            System.out.println("\nFuncionario " +func.getIdFuncionario()+" cadastrado com sucesso");
        }
    //método para RETORNAR a lista
    //public List<Funcionario> getBDFunc(){
    //   System.out.println("\n\nLista de Gestores retornadas cadastrada com sucesso!");
    //   return BDFunc; //retornando a lista
    //}

}
