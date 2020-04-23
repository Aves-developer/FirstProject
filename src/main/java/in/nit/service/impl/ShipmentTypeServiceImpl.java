package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
import in.nit.service.IShipmentType;
@Service
public class ShipmentTypeServiceImpl implements IShipmentType {
	@Autowired
	private IShipmentTypeDao dao;

	@Transactional
	public Integer saveShipmentType(ShipmentType st) {
		
		return dao.saveShipmentType(st);
	}

	@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipmentType() {
		List<ShipmentType> list=dao.getAllShipmentType();
		Collections.sort(list,(st1,st2)->
		{return st1.getShipId()-st2.getShipId();});
		return list;
	}

	@Transactional
	public void deleteShipmentType(Integer id) {
     dao.deleteShipmentType(id);
		
	}

    @Transactional
	public ShipmentType getOneShipmentType(Integer id) {
		
		return dao.getOneShipmentType(id);
	}
    
    @Transactional
    public void updateShipmentType(ShipmentType st) {
    	dao.updateShipmentType(st);
    	
    	
    }

	@Override
	public List<Object[]> getShipmentModeCount() {
		
		return dao.getShipmentModeCount();
	}

	@Transactional(readOnly=true)
	public List<Object[]> getShipmentIdAndCode() {
		
		return dao.getShipmentIdAndCode();
	}

	@Override
	public boolean isShipmentCodeExist(String shipCode) {
		
		return dao.isShipmentCodeExist(shipCode);
	}

}
