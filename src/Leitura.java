import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

    public String entDados(String scan){

        System.out.println(scan);
        String ret = "";

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        try{
            ret = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\n ERRO: JVM ou RAM");
        }

        return ret;

    }
}
