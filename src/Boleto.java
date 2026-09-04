public class Boleto implements Pagamentos {

    private String boletoBancario;

    public Boleto(String boletoBancario){
        this.boletoBancario=boletoBancario;
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento foi de"+valor+"no boleto bancario de:"+boletoBancario);
    }
}
