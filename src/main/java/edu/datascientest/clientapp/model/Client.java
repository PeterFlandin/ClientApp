package edu.datascientest.clientapp.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String adresse;

    @Override
    public String toString() {
	return "Client [id=" + this.id + ", nom=" + this.nom + ", adresse=" + this.adresse + "]";
    }

    @Override
    public int hashCode() {
	return Objects.hash(adresse, id, nom);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Client other = (Client) obj;
	return Objects.equals(this.adresse, other.adresse) && Objects.equals(this.id, other.id)
		&& Objects.equals(this.nom, other.nom);
    }

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

    public String getAdresse() {
	return this.adresse;
    }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

}
