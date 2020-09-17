package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.ILaboratoryDao;
import pe.edu.upc.entity.Laboratory;
import pe.edu.upc.serviceinterface.ILaboratoryService;

@Named
@RequestScoped
public class LaboratoryServiceImpl implements ILaboratoryService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ILaboratoryDao lD;

	public void insert(Laboratory lab) {
		lD.insert(lab);
	}

	public List<Laboratory> list() {
		// TODO Auto-generated method stub
		return lD.list();
	}

}
