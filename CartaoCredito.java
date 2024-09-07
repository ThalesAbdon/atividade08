public class CartaoCredito extends FormaPagamento {
    
    private String numeroCartao;
    
    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito.");
        } else {
            System.out.println("Pagamento com Cartão de Crédito não validado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao != null && numeroCartao.length() == 16;
    }
}
