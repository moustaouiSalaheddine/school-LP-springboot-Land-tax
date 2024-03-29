package com.mst.terrain.bean;

import javax.persistence.*;

@Entity
public class Terrain {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String ref;
	private String surface;
	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Redevable redevable;
	@ManyToOne
	private Quartier quartier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Redevable getRedevable() {
		return redevable;
	}

	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}

	public Quartier getQuartier() {
		return quartier;
	}

	public void setQuartier(Quartier quartier) {
		this.quartier = quartier;
	}

	@Override
	public String toString() {
		return "Terrain{" +
				"id=" + id +
				", ref='" + ref + '\'' +
				", surface='" + surface + '\'' +
				", categorie=" + categorie +
				", redevable=" + redevable +
				", quartier=" + quartier +
				'}';
	}
}
