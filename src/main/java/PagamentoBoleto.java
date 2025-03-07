public class PagamentoBoleto implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Você gerou um Boleto de R$" + valor + ". Não esquece de pagar, hein?");
    }
}