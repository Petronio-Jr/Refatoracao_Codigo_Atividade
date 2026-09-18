public class PlaystationPortatil extends Playstation{

    @Override
    public void ligar() {
        System.out.println("Ligando Playstation Portatil ...");
    }

    @Override
    public double calcularPreco(){
        return dadosConsole.getPrecoBase() * 1.15;
    }

}
