package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IUomDao;
import in.nit.model.Uom;
import in.nit.service.IUomService;
@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private IUomDao dao;
	@Transactional
	public Integer saveUom(Uom um) {
		
		return dao.saveUom(um);
	}
	
	@Transactional(readOnly=true)
	public List<Uom> getAllUom() {
		List<Uom>list=dao.getAllUom();
		Collections.sort(list,(um1,um2)->{return um1.getUomId()-um2.getUomId();});
		return list;
	}
	
	@Transactional
	public void deleteOneUOm(Integer id) {
		dao.deleteOneUOm(id);
	}

	@Transactional(readOnly=true)
	public Uom getOneUom(Integer id) {
		
		return dao.getOneUom(id);
	}

	@Transactional
	public void updateUom(Uom um) {
		dao.updateUom(um);
		
	}

	@Override
	public boolean isUomModelExist(String uomModel) {
		
		return dao.isUomModelExist(uomModel);
	}

	@Override
	public boolean isUomDescExist(String uomDesc) {
		
		return dao.isUomDescExist(uomDesc);
	}
}
