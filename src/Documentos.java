
public class Documentos{

    String doc1;
    String conteudo1;

    String doc2;
    String conteudo2;

    String doc3;
    String conteudo3;

    public Documentos(){

        doc1 = "DANFE 3562";
        conteudo1 = "Data: 10/03/2010 ----- Valor da NF: R$ 3.000,00";

        doc2 = "DANFE 1234";
        conteudo2 = "Data: 28/06/2011 ----- Valor da NF: R$ 4.000,00";

        doc3 = "DANFE 9876";
        conteudo3 = "Data: 12/08/2007 ----- Valor da NF: R$ 10.000,00";

    }

//-----------------------------------------

    public String getDoc1(){
        return doc1;
    }

    public String getConteudo1(){
        return conteudo1;
    }

    public String getDoc2(){
        return doc2;
    }

    public String getConteudo2(){
        return conteudo2;
    }

    public String getDoc3(){
        return doc3;
    }

    public String getConteudo3(){
        return conteudo3;
    }

}