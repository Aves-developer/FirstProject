package in.nit.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.nit.model.Uom;
import in.nit.service.IUomService;
 
@Component
public class UomValidator implements Validator {
	@Autowired
	private IUomService service;

	@Override
	public boolean supports(Class<?> cls) {
		
		return Uom.class.equals(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
	
		Uom user=(Uom)target;
	
		if(service.isUomModelExist(user.getUomModel())) {
			errors.rejectValue("uomModel", null, "Uom model'"+user.getUomModel()+"'is already exist ");
		}
		
		if(service.isUomDescExist(user.getUomDesc())) {
			errors.rejectValue("uomDesc", null, "Uom Description'"+user.getUomDesc()+"'is already exist");
		}

	}

}
