package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "movie")
public class Movie implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int id; 
	private String name;
	private String description;
	private String image;
	@Column(name = "create_at")
	private LocalDateTime createAt; 
	@Column(name = "releas_date")
	private LocalDate releaseDate;
	private String actors;
	@ManyToOne
	@JoinColumn(name = "gender_id")
	private Gender genderid;
	private int rating;
	
	public Movie () {
		
	}
	
	public Movie(int id, String name, String descriptin, String image, LocalDateTime createAt, LocalDate releasDate,
			String actors, Gender genderid, int raing) {
		super();
		this.id = id;
		this.name = name;
		this.description = descriptin;
		this.image = image;
		this.createAt = createAt;
		this.releaseDate = releasDate;
		this.actors = actors;
		this.genderid = genderid;
		this.rating = raing;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the descriptin
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param descriptin the description to set
	 */
	public void setDescription(String descriptin) {
		this.description = descriptin;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the createAt
	 */
	public LocalDateTime getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the releasDate
	 */
	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releasDate the releasDate to set
	 */
	public void setReleaseDate(LocalDate releasDate) {
		this.releaseDate = releasDate;
	}

	/**
	 * @return the actors
	 */
	public String getActors() {
		return actors;
	}

	/**
	 * @param actors the actors to set
	 */
	public void setActors(String actors) {
		this.actors = actors;
	}

	/**
	 * @return the genderid
	 */
	public Gender getGenderid() {
		return genderid;
	}

	/**
	 * @param genderid the genderid to set
	 */
	public void setGenderid(Gender genderid) {
		this.genderid = genderid;
	}

	/**
	 * @return the raing
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param raing the raing to set
	 */
	public void setRating(int raing) {
		this.rating = raing;
	}
		
}
