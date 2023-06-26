package edu.datascientest.clientapp.dto;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClientDto {
    @NotBlank(message = "obligatoire")
    @Size(min = 3, message = "3 lettre minimum et 10 maximum", max = 10)
    private String nom;
    @NotBlank(message = "obligatoire")

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
