package br.com.getnet;

public class Dados {
	
	String urlCadastro = "api/users"; 
	String corpoCadastro = "{\"name\": \"jean\", \"job\": \"leader\"}";
	
	String urlAtualiza = "api/users/page=2";
	String corpoAtualiza = "{\"name\": \"jean\", \"job\": \"resident\"}" ;
	
	String urlListaUsuarios = "api/users?page=2";
}
