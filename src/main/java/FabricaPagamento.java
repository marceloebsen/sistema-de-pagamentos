public class FabricaPagamento {
    public static EstrategiaPagamento obterMetodoPagamento(String metodo) {
        if (metodo.equalsIgnoreCase("pix")) {
            return new PagamentoPix();
        } else if (metodo.equalsIgnoreCase("cartão de crédito")) {
            return new PagamentoCartaoCredito();
        } else if (metodo.equalsIgnoreCase("boleto")) {
            return new PagamentoBoleto();
        } else {
            System.out.println("Método de pagamento inválido. Tente de novo!");
            return null;
        }
    }
}