package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IVaccineDao;
import pe.edu.upc.entity.Vaccine;

public class VaccineDaoImpl implements IVaccineDao{
	@PersistenceContext(unitName = "demo02")
	private EntityManager em;
	
	@Transactional
	
	@Override
	public void insert(Vaccine vac) {
		try {
			em.persist(vac);
		} catch (Exception e) {
			System.out.println("Error al insertar vacuna");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Vaccine> list() {
		List<Vaccine> lista = new ArrayList<Vaccine>();
		try {
			Query q = em.createQuery("from Vaccine v");
			lista = (List<Vaccine>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar vacuna");
		}
		return lista;
	}
	
}


