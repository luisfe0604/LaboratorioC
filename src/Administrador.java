
public class Administrador{

    public void impFuncAdmin(){

        Leitura l = new Leitura();
        Documentos doc = new Documentos();
        NaoConformidade nc = new NaoConformidade();
        Clientes cl = new Clientes();
        String esc = "";

        int i = 1;

        while (i == 1) {
            while (i == 1) {
                System.out.println("\n\t -------------- SELECIONE UMA DAS OPCOES --------------");
                System.out.println("\n\t[1] -> Visualizar documentos \n\t[2] -> Visualizar Nao conformidades\n\t[3] -> Visualizar clientes");
                int opc = (Integer.parseInt(l.entDados(esc)));
                if (opc == 1) {
                    System.out.println("\n\t -------------- SELECIONE UMA DAS OPCOES --------------");
                    System.out.println("\n\t[1] -> " + doc.getDoc1() + "\n\t[2] -> " + doc.getDoc2() + "\n\t[3] -> " + doc.getDoc3());
                    int opc1 = (Integer.parseInt(l.entDados(esc)));
                    switch (opc1) {
                        case 1:
                            System.out.println("\n" + doc.getDoc1());
                            System.out.println("\n" + doc.getConteudo1());
                            break;

                        case 2:
                            System.out.println("\n" + doc.getDoc2());
                            System.out.println("\n" + doc.getConteudo2());
                            break;

                        case 3:
                            System.out.println("\n" + doc.getDoc3());
                            System.out.println("\n" + doc.getConteudo3());
                            break;
                    } // FIM DO SWITCH
                } else if (opc == 2){
                    System.out.println("\n\t -------------- SELECIONE UMA DAS OPCOES --------------");
                    System.out.println("\n\t[1] -> " + nc.getNc1() + "\n\t[2] -> " + nc.getNc2() + "\n\t[3] -> " + nc.getNc3());
                    int opc2 = (Integer.parseInt(l.entDados(esc)));
                    switch (opc2) {
                        case 1:
                            System.out.println("\n" + nc.getNc1());
                            System.out.println("\n" + nc.getConteudoNC1());
                            break;

                        case 2:
                            System.out.println("\n" + nc.getNc2());
                            System.out.println("\n" + nc.getConteudoNC2());
                            break;

                        case 3:
                            System.out.println("\n" + nc.getNc3());
                            System.out.println("\n" + nc.getConteudoNC3());
                            break;
                    } // FIM DO SWITCH

                } else {
                    System.out.println("\n\t -------------- SELECIONE UMA DAS OPCOES --------------");
                    System.out.println("\n\t[1] -> " +cl.getCliente1() + "\n\t[2] -> " +cl.getCliente2() + "\n\t[3] -> " +cl.getCliente3());
                    int opc3 = (Integer.parseInt(l.entDados(esc)));
                    switch (opc3) {
                        case 1:
                            System.out.println("\n" + cl.getCliente1());
                            System.out.println("\n" + cl.getConteudoCL1());
                            break;

                        case 2:
                            System.out.println("\n" + cl.getCliente2());
                            System.out.println("\n" + cl.getConteudoCL2());
                            break;

                        case 3:
                            System.out.println("\n" + cl.getCliente3());
                            System.out.println("\n" + cl.getConteudoCL3());
                            break;
                    } // FIM DO SWITCH
                }
                System.out.println("\nDeseja vizualisar outro arquivo? (1 sim / 2 nao)");
                int confirm = (Integer.parseInt(l.entDados(esc)));
                if (confirm == 2){
                    i++;
                }
            }
            i = 1;
            System.out.println("\nEscolha 1 para sair ou 2 para retornar ao menu");
            int confirm = (Integer.parseInt(l.entDados(esc)));
            if (confirm == 1){
                i++;
            }
        }
    }
}