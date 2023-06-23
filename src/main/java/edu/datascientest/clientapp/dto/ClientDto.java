package edu.datascientest.clientapp.dto;

import java.util.Objects;

public class ClientDto {

    private String nom;
    private String adresse;

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

    @Override
    public int hashCode() {
	return Objects.hash(adresse, nom);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ClientDto other = (ClientDto) obj;
	return Objects.equals(this.adresse, other.adresse) && Objects.equals(this.nom, other.nom);
    }

}
