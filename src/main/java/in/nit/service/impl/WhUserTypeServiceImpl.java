package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService{

	@Autowired
	private IWhUserTypeDao dao;
	
	@Transactional
	public Integer saveWhUserType(WhUserType wh) {
		
		return dao.saveWhUserType(wh);
	}

	@Transactional(readOnly=true)
	public List<WhUserType> getAllWhUserType() {
	List<WhUserType>list=dao.getAllWhUserType();
	Collections.sort(list,(wh1,wh2)->{return wh1.getUserId()-wh2.getUserId();});
		return list;
	}

	@Transactional
	public void deleteWhUserType(Integer id) {
		dao.deleteWhUserType(id);
		
	}

	@Transactional(readOnly=true)
	public WhUserType getOneWhUserType(Integer id) {
		
		return dao.getOneWhUserType(id);
	}
	
	@Transactional
	public void updateWhUserType(WhUserType wh) {
		
		dao.updateWhUserType(wh);}

	@Override
	public boolean isUserCodeExist(String userCode) {
		return dao.isUserCodeExist(userCode);
	}
		
	@Override
		public boolean isUserEmailExist(String userEmail) {
			
			return dao.isUserEmailExist(userEmail);
		}	
	@Override
	public boolean isUserContactExist(String userCont) {
		
		return dao.isUserContactExist(userCont);
	}
	@Override
	public boolean isIdNumberExist(String idNumber) {
		
		return dao.isIdNumberExist(idNumber);
	}
}
