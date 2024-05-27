package BilletraVirtual;

public class Cuenta {
	protected Double saldo;
	protected int numeroCuenta;
	protected String banco;
	protected String tipo;//CTE, CTA, CTV, etc
	protected String simbolo;//USD, EUR, CLP 
	
	public Cuenta(Double saldo, int numeroCuenta, String banco, String tipo, String simbolo) {
		this.saldo = saldo;//TODO: verificar como se agregaria el saldo inicial
		this.numeroCuenta = numeroCuenta;
		this.banco = banco;
		this.tipo = tipo;
		this.simbolo = simbolo;
	}
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void saldoDisponible() {
		System.out.println("El saldo de la cuenta " + this.getTipo() + " del banco " + this.getBanco() + " es de: " + this.getSaldo() + " " + this.getSimbolo());
	}
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", banco=" + banco + ", tipo=" + tipo
				+ "]";
	}
	
	
}
