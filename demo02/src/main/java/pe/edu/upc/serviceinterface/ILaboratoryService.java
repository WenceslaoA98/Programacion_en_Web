package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Laboratory;

public interface ILaboratoryService {
	public void insert(Laboratory lab);

	public List<Laboratory> list();
}
