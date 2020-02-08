package br.com.jee.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.jee.loja.models.Livro;

//CDI Possibilita a integração do xhtml com o java
@Named // amarra o xmhtml com este bean
@RequestScoped // não perde o q foi preenchido no formulario
public class AdminLivrosBean {

	private Livro livro = new Livro();
	
	public void salvar() {
		System.out.println("Livro Cadastrado: "+livro);
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}	
}
