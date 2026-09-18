public class Xbox implements IConsole{

    DadosConsole dadosConsole = new DadosConsole("Xbox", 2500);;

    @Override
    public void ligar() {
        System.out.println("Ligando console Xbox ...");
    }

    @Override
    public String getNome() {
        return dadosConsole.getNome();
    }

    @Override
    public double calcularPreco() {
        return dadosConsole.getPrecoBase() * 1.18;
    }
}
