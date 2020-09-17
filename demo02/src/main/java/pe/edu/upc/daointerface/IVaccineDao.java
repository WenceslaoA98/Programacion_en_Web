package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Vaccine;

public interface IVaccineDao {
	public void insert(Vaccine vac);

	public List<Vaccine> list();
}
