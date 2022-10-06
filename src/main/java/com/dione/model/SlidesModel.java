package com.dione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SlidesModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_slides")
	private float idSlides;
	private String titre;
	private String sous_titre;
	private String image;
	private String url;
	
	// Constructors
	
		public SlidesModel() {	
		}

		public SlidesModel(int idSlides, String titre, String sous_titre, String image, String url) {
			this.idSlides = idSlides;
			this.titre = titre;
			this.sous_titre = sous_titre;
			this.image = image;
			this.url = url;
		}

		public float getIdSlides() {
			return idSlides;
		}

		public void setIdSlides(float idSlides) {
			this.idSlides = idSlides;
		}

		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}

		public String getSous_titre() {
			return sous_titre;
		}

		public void setSous_titre(String sous_titre) {
			this.sous_titre = sous_titre;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		@Override
		public String toString() {
			return "SlidesModel [idSlides=" + idSlides + ", titre=" + titre + ", sous_titre=" + sous_titre + ", image="
					+ image + ", url=" + url + "]";
		}



		

}
