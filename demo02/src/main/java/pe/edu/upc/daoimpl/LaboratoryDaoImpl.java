package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.ILaboratoryDao;
import pe.edu.upc.entity.Laboratory;

public class LaboratoryDaoImpl implements Serializable, ILaboratoryDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "demo02")
	private EntityManager em;

	@Transactional
	public void insert(Laboratory lab) {
		try {
			em.persist(lab);

		} catch (Exception e) {
			System.out.println("Error al insertar ");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Laboratory> list() {
		List<Laboratory> lista = new ArrayList<Laboratory>();
		try {
			Query q = em.createQuery("from Laboratory l");
			lista = (List<Laboratory>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}

}
