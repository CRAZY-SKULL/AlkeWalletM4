package BilletraVirtual;

import java.util.ArrayList;

public class Wallet {

    public static void main(String[] args) {
        // Datos de usuarios y cuentas con nombres y bancos modificados
        Usuario samuel = new Usuario("Samuel", "Apellido", "18.000.000-0", "samuel@gmail.com", "1234");
        Usuario simon = new Usuario("Simon", "Apellido", "19.777.391-k", "simon@gmail.com", "5678");
        Usuario daffnee = new Usuario("Daffnee", "Apellido", "18.000.000-0", "daffnee@gmail.com", "1234");

        Cuenta ctaSamuel1 = new Cuenta(0.0, 789521, "Banco Santander", "Cuenta Rut", "CLP");
        Cuenta ctaSamuel2 = new Cuenta(0.0, 2557894, "Banco de Chile", "Tenpo Prepago", "CLP");

        samuel.setCuentas(ctaSamuel1);
        samuel.setCuentas(ctaSamuel2);

        Cuenta ctaSimon1 = new Cuenta(0.0, 225879, "Itau", "Cuenta Rut", "USD");
        Cuenta ctaSimon2 = new Cuenta(0.0, 596742, "BCI", "Tenpo Prepago", "USD");

        simon.setCuentas(ctaSimon1);
        simon.setCuentas(ctaSimon2);

        Cuenta ctaDaffnee1 = new Cuenta(0.0, 225879, "Banco Itau", "Cuenta Rut", "CLP");
        Cuenta ctaDaffnee2 = new Cuenta(0.0, 596742, "Banco BCI", "Tenpo Prepago", "USD");

        daffnee.setCuentas(ctaDaffnee1);
        daffnee.setCuentas(ctaDaffnee2);

        // Transacciones
        Transacciones transacciones = new Transacciones();

        // Depositar en cuentas
        System.out.println("===== DEPOSITOS ======");
        transacciones.setRealizarDeposito(ctaSamuel1, 1300.0);
        transacciones.setRealizarDeposito(ctaSamuel2, 876990.0);
        transacciones.setRealizarDeposito(ctaSimon1, 1650.0);
        transacciones.setRealizarDeposito(ctaSimon2, 679800.0);
        transacciones.setRealizarDeposito(ctaDaffnee1, 2300.0);
        transacciones.setRealizarDeposito(ctaDaffnee2, 9900.0);

        // Consultar saldo
        System.out.println("===== CONSULTA DE SALDO ======");
        System.out.println("Saldos cuentas de " + samuel.getNombreCompleto());
        samuel.getCuentas().get(0).saldoDisponible();
        samuel.getCuentas().get(1).saldoDisponible();

        // Retiros de fondos
        System.out.println("===== RETIRO DE FONDOS ======");
        transacciones.setRetirosFondos(ctaSamuel1, 500);
        ctaSamuel1.saldoDisponible();

        transacciones.setRetirosFondos(ctaSimon1, 376);
        ctaSimon1.saldoDisponible();

        // Transferencias
        System.out.println("===== TRANSFERENCIAS ======");
        transacciones.transferencia(ctaSamuel2, ctaSimon2, 150000);
        ctaSamuel2.saldoDisponible();
        ctaSimon2.saldoDisponible();

        transacciones.transferencia(ctaSimon2, ctaDaffnee2, 100000);
        ctaSimon2.saldoDisponible();
        ctaDaffnee2.saldoDisponible();
    }
}
