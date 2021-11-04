package org.artemanha.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
*Classe utilizada como entidade para categoria no banco de dados
*Esta Classe é responsável por definir os atributos da API/colunas do banco de dados MYSQL com suas respectivas anotations.
*As anotations são resposnsáveis pela definição do comportamento de cada atributo.
*
*@since 1.0
*@author Grupo Radia Perlman #3
*/
@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String artesanal;
	
	@NotNull
	private String forma_pagamento;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getArtesanal() {
		return artesanal;
	}
	public void setArtesanal(String artesanal) {
		this.artesanal = artesanal;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	

	
}
