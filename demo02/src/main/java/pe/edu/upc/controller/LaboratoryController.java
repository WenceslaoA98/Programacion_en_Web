package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Laboratory;
import pe.edu.upc.serviceinterface.ILaboratoryService;

@Named
@RequestScoped
public class LaboratoryController {
	@Inject
	private ILaboratoryService lService;
	private Laboratory l;
	List<Laboratory> listLaboratories;

//constructor
	@PostConstruct
	public void init() {
		this.listLaboratories = new ArrayList<Laboratory>();
		this.l = new Laboratory();
		this.list();
	}

	// métodos
	public String newLaboratory() {
		this.setL(new Laboratory());
		return "laboratory.xhtml";
	}

	public void insert() {
		try {
			lService.insert(l);
			cleanLaboratory();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listLaboratories = lService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanLaboratory() {
		this.init();
	}

///get y set
	public Laboratory getL() {
		return l;
	}

	public void setL(Laboratory l) {
		this.l = l;
	}

	public List<Laboratory> getListLaboratories() {
		return listLaboratories;
	}

	public void setListLaboratories(List<Laboratory> listLaboratories) {
		this.listLaboratories = listLaboratories;
	}

}
