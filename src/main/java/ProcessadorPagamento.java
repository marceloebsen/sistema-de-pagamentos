public class ProcessadorPagamento {
    private EstrategiaPagamento estrategiaPagamento;

    public ProcessadorPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void processarPagamento(double valor) {
        if (estrategiaPagamento != null) {
            estrategiaPagamento.pagar(valor);
        } else {
            System.out.println("Não foi possível processar o pagamento.");
        }
    }
}