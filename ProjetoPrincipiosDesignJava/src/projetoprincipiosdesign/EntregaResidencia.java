package projetoprincipiosdesign;

public class EntregaResidencia implements IEntrega{

    @Override
    public double calcularFrete(double total) {
        return 15.0;
    }

}