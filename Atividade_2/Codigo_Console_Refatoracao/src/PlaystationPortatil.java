public class PlaystationPortatil extends Playstation{

    @Override
    public void ligar() {
        System.out.println("Playstation Portátil ligado.");
    }

    @Override
    public double calcularPreco(){
        return dadosConsole.getPrecoBase() * 1.15;
    }

}
