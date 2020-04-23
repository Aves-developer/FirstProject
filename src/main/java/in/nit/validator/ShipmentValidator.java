package in.nit.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentType;

@Component
public class ShipmentValidator implements Validator {
	@Autowired
	private IShipmentType service;

	@Override
	public boolean supports(Class<?> cls) {

		return ShipmentType.class.equals(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ShipmentType user=(ShipmentType) target;


		if(service.isShipmentCodeExist(user.getShipCode())) {
			errors.rejectValue("shipCode", null, "Ship Code'"+user.getShipCode()+"'is Already exist");
		}
			
	}

}
