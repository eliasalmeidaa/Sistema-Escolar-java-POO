public class Cartao implements Pagamentos{
    private String cartaoCredito;

    public Cartao(String cartaoCredito){
        this.cartaoCredito=cartaoCredito;
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento foi de"+valor+"no cartao de crédito: "+cartaoCredito);
    }
}
