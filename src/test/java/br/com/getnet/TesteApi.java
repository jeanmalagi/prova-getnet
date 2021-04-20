package br.com.getnet;

import static io.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TesteApi extends Dados {
	
	@BeforeClass
	public static void urlbase() {
		RestAssured.baseURI = "https://reqres.in/";
	}
	
	@Test
	public void cadastro() {
		Response response = given().contentType("application/json").body(corpoCadastro).when().post(urlCadastro);
		validacao(response);
	}
	
	@Test
	public void atualiza(){
		Response response = given().contentType("application/json").body(corpoAtualiza).when().put(urlAtualiza);
		validacao(response);
	}
	
	@Test
	public void listaUsuarios(){
		Response response = given().contentType("application/json").when().get(urlListaUsuarios);
		validacao(response);
	}
	
	
	public void validacao(Response response) {

		System.out.println("RETORNO DA API => " + response.body().asString());
		System.out.println("-----------------------------------------------");
	}

}
