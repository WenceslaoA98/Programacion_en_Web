package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "vaccines")
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVaccine;
	
	@Column(name = "nameVaccine", nullable = false, length = 45)
	private String nameVaccine;
	
	private double priceVaccine;
	
	@ManyToOne
	@JoinColumn(name = "idLaboratory", nullable = false )
	private Laboratory laboratory;
	
	
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vaccine(int idVaccine, String nameVaccine, double priceVaccine, Laboratory laboratory) {
		super();
		this.idVaccine = idVaccine;
		this.nameVaccine = nameVaccine;
		this.priceVaccine = priceVaccine;
		this.laboratory = laboratory;
	}

	public int getIdVaccine() {
		return idVaccine;
	}

	public void setIdVaccine(int idVaccine) {
		this.idVaccine = idVaccine;
	}

	public String getNameVaccine() {
		return nameVaccine;
	}

	public void setNameVaccine(String nameVaccine) {
		this.nameVaccine = nameVaccine;
	}

	public double getPriceVaccine() {
		return priceVaccine;
	}

	public void setPriceVaccine(double priceVaccine) {
		this.priceVaccine = priceVaccine;
	}

	public Laboratory getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(Laboratory laboratory) {
		this.laboratory = laboratory;
	} 
	
	
	
	
}
