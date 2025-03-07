public class PagamentoPix implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Você pagou R$" + valor + " usando Pix! Muito rápido!");
    }
}