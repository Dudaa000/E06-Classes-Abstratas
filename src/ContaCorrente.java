public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente dono, double limite, double saldo, int numero) {
        super(dono, saldo, numero);
        setLimite(limite);
    }

    @Override
    public boolean setLimite(double limite) {
        if (limite <= -100) {
            super.limite = -100;
            return false;
        } else {
            super.limite = limite;
            return true;
        }
    }
}
