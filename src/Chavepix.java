public class Chavepix implements Pagamentos {

    private String chavepix;

    public Chavepix(String chavepix){
        this.chavepix=chavepix;
    }

    @Override
    public void pagar( double valor){
        System.out.println("Pagamento foi de"+valor+"via pix, chave:"+chavepix);
    }
}
