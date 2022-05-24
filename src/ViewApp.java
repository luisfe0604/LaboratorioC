public class ViewApp{
    public void impApp(){

        Leitura l = new Leitura();
        Colaborador c = new Colaborador();
        Administrador adm = new Administrador();
        Gestor gest = new Gestor();

        String esc = "";

        System.out.println("\n\t -------------- BEM VINDO --------------");
        System.out.println("\nQual seu cargo?");
        System.out.println("\n\t[1] -> Gestor \n\t[2] -> Administrador \n\t[3] -> Colaborador");
        int cargo = (Integer.parseInt(l.entDados(esc)));


        switch (cargo){
            case 1:
                gest.impFuncGest();
                break;
            case 2:
                adm.impFuncAdmin();
                break;
            case 3:
                c.impFuncCol();
                break;
        } // FIM DO SWITCH

    }
}
