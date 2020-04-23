package in.nit.service;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentType {
	
	Integer saveShipmentType(ShipmentType st);
	List<ShipmentType> getAllShipmentType();
	 void deleteShipmentType(Integer id);
	 ShipmentType getOneShipmentType(Integer id);
	 void updateShipmentType(ShipmentType st);
	 
	 List<Object[]> getShipmentModeCount();
	 List<Object[]> getShipmentIdAndCode();
	 
	 boolean isShipmentCodeExist(String shipCode);
}
