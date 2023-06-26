package edu.datascientest.clientapp.dto;

import java.util.Objects;

public class ClientDtoConsultation {

    private Integer id;
    private String nom;

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getNom() {
	return this.nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public ClientDtoConsultation(Integer integer, String string) {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
	return Objects.hash(id, nom);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ClientDtoConsultation other = (ClientDtoConsultation) obj;
	return Objects.equals(this.id, other.id) && Objects.equals(this.nom, other.nom);
    }

}
