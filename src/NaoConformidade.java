
public class NaoConformidade{

        String nc1;
        String conteudoNC1;

        String nc2;
        String conteudoNC2;

        String nc3;
        String conteudoNC3;

        public NaoConformidade(){

            nc1 = "NC Satisfacao de clientes";
            conteudoNC1 = "Cliente nao satisfeito com o produto";

            nc2 = "NC Problema com fornecedor";
            conteudoNC2 = "Fornecedor atrasou a entrega de materia prima";

            nc3 = "NC Falta de treinamento para funcionarios";
            conteudoNC3 = "Funcionarios sem o devido treinamento";

        }

//-----------------------------------------

        public String getNc1(){
            return nc1;
        }

        public String getConteudoNC1(){
            return conteudoNC1;
        }

        public String getNc2(){
            return nc2;
        }

        public String getConteudoNC2(){
            return conteudoNC2;
        }

        public String getNc3(){
            return nc3;
        }

        public String getConteudoNC3(){
            return conteudoNC3;
        }
}