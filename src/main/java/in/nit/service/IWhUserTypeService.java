package in.nit.service;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeService {
	

	public	Integer saveWhUserType(WhUserType wh);

	List<WhUserType> getAllWhUserType();
	public void deleteWhUserType(Integer id);
	WhUserType getOneWhUserType(Integer id);
	void updateWhUserType(WhUserType wh);

		 boolean isUserCodeExist(String userCode);
		 boolean isUserEmailExist(String userEmail);
		 boolean isUserContactExist(String userCont);
		 public boolean isIdNumberExist(String idNumber);
}
