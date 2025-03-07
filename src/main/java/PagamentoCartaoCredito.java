public class PagamentoCartaoCredito implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com Cartão de Crédito! Sucesso!");
    }
}