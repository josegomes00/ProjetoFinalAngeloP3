package uniesp.angelo.projeto;

abstract class PaymentGenerator {
    public void generatePayment(){
        generateUp();
        generateMiddle();
        generateDown();
    }

    protected abstract void generateUp();

    protected abstract void generateMiddle();

    protected abstract void generateDown();
}
