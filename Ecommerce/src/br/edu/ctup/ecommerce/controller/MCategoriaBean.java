package br.edu.ctup.ecommerce.controller;

import javax.faces.bean.ManagedBean;

import br.edu.ctup.ecommerce.model.Categoria;

@ManagedBean(name="mCategoriaBean")
public class MCategoriaBean {
	
	private Categoria categoria = new Categoria();
	
	

	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	public void gravarCategoria(Categoria c) {
		//CatssssegoriaDAO.adicionarCategoria(c);
		System.out.println("nome: " + c.getNome() + " " + c.getDesc());
	}
	
	public void chacachsaca1(){
	}
	
}
