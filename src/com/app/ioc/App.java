package com.app.ioc;

public class App {

	public static void main(String[] args) {
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
		obj.getInsertarUsuario();
		obj.getEliminaUsuarioByID(1);
	}

}
