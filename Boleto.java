public class Boleto extends FormaPagamento {
    
    private String codigoBarras;
    
    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$ " + valor + " com Boleto.");
        } else {
            System.out.println("Pagamento com Boleto não validado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return codigoBarras != null && codigoBarras.length() == 44;
    }
}
