package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDao;
import in.nit.model.Uom;
@Repository
public class UomDaoImpl implements IUomDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUom(Uom um) {
		
		return  (Integer) ht.save(um);
	}

	@Override
	public List<Uom> getAllUom() {
		
		return ht.loadAll(Uom.class);
	}

	@Override
	public void deleteOneUOm(Integer id) {
		ht.delete(new Uom(id));
		
	}

	@Override
	public Uom getOneUom(Integer id) {
		
		return ht.get(Uom.class, id);
	}
	
	@Override
	public void updateUom(Uom um) {
		ht.update(um);
		
	}

	@SuppressWarnings({ "deprecation", "unchecked", })
	@Override
	public boolean isUomModelExist(String uomModel) {
		boolean flag=false;
		String hql="select count(uomModel) from in.nit.model.Uom where uomModel=?0";
		List<Long>list=(List<Long>) ht.find(hql, uomModel);
		if(list!=null && !list.isEmpty()) {
			long count=list.get(0);
			if(count==0) 
				flag=false;
				else
					flag=true;
			}
		return flag ;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public boolean isUomDescExist(String uomDesc) {
		boolean flag=false;
		String hql="select count(uomDesc) from in.nit.model.Uom where uomDesc=?0";
		List<Long>list=(List<Long>) ht.find(hql, uomDesc);
		if(list!=null && !list.isEmpty()) {
			long count=list.get(0);
			if(count==0) 
				flag=false;
			else 
				flag=true;
		}
		return flag;
	}
}
