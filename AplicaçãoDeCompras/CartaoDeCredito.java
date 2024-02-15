package AplicaçãoDeCompras;

import java.util.ArrayList;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private ArrayList<Compras> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList();
    }

    public boolean lancaCompra(Compras compras) {
        if (this.saldo > compras.getValor()) {
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Compras> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compras> compras) {
        this.compras = compras;
    }

}
