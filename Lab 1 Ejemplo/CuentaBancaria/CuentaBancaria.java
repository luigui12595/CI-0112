import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double balance;

    // Constructor que inicializa las variables
    public CuentaBancaria(String titular, double balanceInicial) {
        this.titular = titular;
        if (balanceInicial >= 0) {
            this.balance = balanceInicial;
        } else {
            this.balance = 0;
            System.out.println("El balance inicial no puede ser negativo. Se ha establecido en 0.");
        }
    }

    // Getters
    public String getTitular() {
        return this.titular;
    }

    public double getBalance() {
        return this.balance;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("El balance no puede ser negativo.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retiro(double cantidad) {
        if (cantidad > 0 && cantidad <= balance) {
            balance -= cantidad;
            System.out.println("Retiro exitoso. Nuevo balance: $" + balance);
        } else if (cantidad > balance) {
            System.out.println("Error: El monto del retiro excede el balance de la cuenta.");
        } else {
            System.out.println("Error: La cantidad de retiro debe ser positiva.");
        }
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Balance: $" + balance);
    }
}
