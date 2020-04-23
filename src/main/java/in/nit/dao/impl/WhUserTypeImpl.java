package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
@Repository
public class WhUserTypeImpl implements IWhUserTypeDao {

	@Autowired
	private HibernateTemplate ht;
	
	public Integer saveWhUserType(WhUserType wh) {

		return (Integer) ht.save(wh);
	}
	@Override
	public List<WhUserType> getAllWhUserType() {
		
		return ht.loadAll(WhUserType.class);
		
	}
	@Override
	public void deleteWhUserType(Integer id) {
		ht.delete(new WhUserType(id));
		
	}
	
	  @Override 
	  public WhUserType getOneWhUserType(Integer id) {
	  
	  return ht.get(WhUserType.class, id); 
	  }
	 

	
	  @Override public void updateWhUserType(WhUserType wh) { 
		  
		  ht.update(wh);
	  
	  }
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public boolean isUserCodeExist(String userCode) {
	
		boolean flag=false;
		String hql="SELECT COUNT(userCode) FROM in.nit.model.WhUserType WHERE userCode=?0";

	List<Long>list=(List<Long>) ht.find(hql, userCode);
	if(list!=null && !list.isEmpty()) {
		long count=list.get(0);
		if(count==0)
			flag=false;
		else 
			flag=true;
	}
		return flag;
	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public boolean isUserEmailExist(String userEmail) {
		boolean flag=false;
		String hql="SELECT COUNT(userEmail) FROM in.nit.model.WhUserType WHERE userEmail=?0";
		List<Long>list=(List<Long>) ht.find(hql, userEmail);
		if(list!=null && !list.isEmpty()) {
			long count=list.get(0);
			if(count==0)
				flag=false;
			else
				flag=true;
		}
		return flag;
	}
     @SuppressWarnings({ "unchecked", "deprecation" })
	@Override
    public boolean isUserContactExist(String userCont) {
	boolean flag=false;
	String hql="SELECT COUNT(userCont) From in.nit.model.WhUserType WHERE userCont=?0";
	List<Long>list=(List<Long>) ht.find(hql, userCont);
	if(list!=null && !list.isEmpty()) {
		long count=list.get(0);
		if(count==0)
			flag=false;
		else
			flag=true;
	}
	return flag;
}
     @SuppressWarnings({ "unchecked", "deprecation" })
	@Override
    public boolean isIdNumberExist(String idNumber) {
    	boolean flag=false;
    	String hql="SELECT COUNT(idNumber)FROM in.nit.model.WhUserType WHERE idNumber=?0";
    	List<Long>list=(List<Long>) ht.find(hql, idNumber);
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
