package BilletraVirtual;

import java.util.ArrayList;

//saldo disponible, realizar depósitos y retiros de fondos

public class Usuario {
	protected String nombre;
	protected String apellido;
	protected String rut;
	protected String correo;
	protected String contrasena;//TODO: Implementar a futuro restricción de acceso
	protected ArrayList<Cuenta> cuentas;
	protected int edad;
	
	public Usuario(String nombre, String apellido, String rut, String correo, String contrasena) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.correo = correo;
		this.contrasena = contrasena;
		this.cuentas = new ArrayList<>();
	}
	
	//TODO: Implementar método para mostrar la información de las cuentas
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/*
	public String getContrasena() {
		return contrasena;
	}*/

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	
}
