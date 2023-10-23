package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Long getId(){
        return this.idCliente;
    }

    public void setId(Long id){
        this.idCliente = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
}
