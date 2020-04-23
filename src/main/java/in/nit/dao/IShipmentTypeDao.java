package in.nit.dao;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeDao {

	Integer saveShipmentType(ShipmentType st);
	List<ShipmentType> getAllShipmentType();
	 void deleteShipmentType(Integer id);
	 ShipmentType getOneShipmentType(Integer id);
	 void updateShipmentType(ShipmentType st);
	 
	 List<Object[]> getShipmentModeCount();
	 
	 List<Object[]> getShipmentIdAndCode();
	 
	 boolean isShipmentCodeExist(String shipCode);
}
