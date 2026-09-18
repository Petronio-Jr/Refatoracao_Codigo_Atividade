public class Atividade_POO_Problema {

    public static void main(String[] args) {

        IConsole nintendo = new Nintendo();
        IConsole playstation = new Playstation();
        IConsole portatil = new PlaystationPortatil();
        IConsole xbox = new Xbox();

        Loja loja = new Loja();

        loja.venderConsole(nintendo);
        loja.venderConsole(playstation);
        loja.venderConsole(portatil);
        loja.venderConsole(xbox);
    }
}
