package in.nit.dao;

import java.util.List;

import in.nit.model.Uom;

public interface IUomDao {
	Integer saveUom(Uom um);
	List<Uom> getAllUom();
	void deleteOneUOm(Integer id);
	Uom getOneUom(Integer id);
	void updateUom(Uom um);
	
	boolean isUomModelExist(String uomModel);
    boolean isUomDescExist(String uomDesc);
}
