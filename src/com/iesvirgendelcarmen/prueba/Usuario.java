package com.iesvirgendelcarmen.prueba;

public class Usuario {

	//atributos
	private String login;
	private int password; //un nº aleatorio del 0 al 9
	
	
	//constructor/es
	public Usuario(String login) {
		this.login = login;
		this.password = (int) (Math.random() * 10);
	}

	//getters y setters
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", password=" + password + "]";
	}
	
	
	
}
