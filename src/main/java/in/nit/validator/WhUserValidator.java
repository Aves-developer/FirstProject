package in.nit.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Component
public class WhUserValidator implements Validator {

	@Autowired
	private IWhUserTypeService service;
	@Override
	public boolean supports(Class<?> cls) {
		return WhUserType.class.equals(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		WhUserType user=(WhUserType) target;

		if(service.isUserCodeExist(user.getUserCode())) {
			errors.rejectValue("userCode",null, "User code'"+user.getUserCode()+"' already exist");
		}

		if(service.isUserEmailExist(user.getUserEmail())) {
			errors.rejectValue("userEmail",null, "User email'"+user.getUserEmail()+"'already exist" );
		}
		
		if(service.isUserContactExist(user.getUserCont())) {
			errors.rejectValue("userContact",null,"User cont'"+user.getUserCont()+"' already exist");
		}
		if(service.isIdNumberExist(user.getIdNumber())) {
			errors.rejectValue("idNumber", null, "Id Number'"+user.getIdNumber()+"'is already exist");
		}
	}

}
