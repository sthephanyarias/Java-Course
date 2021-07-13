package model;

public class Wallet {

    public static final int LIMITE_BILLETERA = 500000;
    
    /**
     * Saldo de la billetera
     */
    private int saldo;
    private boolean tieneLimite;

    public Wallet(boolean limite) {
        super();
        saldo = 0;
        tieneLimite = limite;

    }

    public int getSaldo (){
        return saldo;
    }

    public String putSaldo(int valor){
        if(saldo + valor > LIMITE_BILLETERA && tieneLimite){
            return "No puede superar el límite";
        }
        saldo += valor;
        return "Operación exitosa, nuevo saldo " + saldo;
    }

    public String getMoney(int valor) {
        // if(valor > saldo){
        //    return "Saldo insuficiente";
        // }
        if(valor > saldo){
            int saldoTemp = saldo;
            saldo = 0;
            return "Solo se retiró " + saldoTemp;
        }
        saldo -= valor;
        return "Retiro exitoso, nuevo saldo " + saldo;
    }
}
