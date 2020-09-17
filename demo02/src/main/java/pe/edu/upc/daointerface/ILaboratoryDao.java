package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Laboratory;

public interface ILaboratoryDao {
	public void insert(Laboratory lab);

	public List<Laboratory> list();
}
