package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table (name = "tema")
public class Tema {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 100)
	private String descricao;
	
	@OneToMany (mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagens;

	public long getId()										
	{ return id; }

	public void setId(long id) 							
	{ this.id = id; }

	public String getTdescricao() 							
	{ return descricao; }

	public void setTdescricao(String descricao) 			
	{ this.descricao = descricao; }

	public List<Postagem> getPostagens() 					
	{ return postagens; }

	public void setPostagens(List<Postagem> postagens) 		
	{ this.postagens = postagens; }

}