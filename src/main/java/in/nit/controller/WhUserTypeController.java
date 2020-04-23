package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;
import in.nit.validator.WhUserValidator;

@Controller
@RequestMapping("/whuser")
public class WhUserTypeController {
	
	@Autowired
	private WhUserValidator validator;
	
	@Autowired
	private IWhUserTypeService service;
	
	@RequestMapping("/show")
	public String showWhUser(Model model) {
		model.addAttribute("whUserType",new WhUserType());
		return "WhUserType";
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveWhUserType(@ModelAttribute WhUserType whUserType, Errors errors,ModelMap map) {
		//call validate
		validator.validate(whUserType, errors);
		if(!errors.hasErrors()) {
			map.addAttribute("WhUserType",new WhUserType());
			Integer id=service.saveWhUserType(whUserType);
			String msg="WhUserType"+id+"is save"; 
			map.addAttribute("whUserType",new WhUserType());
			map.addAttribute("message",msg);
			
	}else {
		map.addAttribute("message","please Check all errors");
	}
		 return "WhUserType";
	}
	
	@RequestMapping("getAll")
	public String showUser(Model model) {
	List<WhUserType>list=service.getAllWhUserType();
	model.addAttribute("list",list);
		return "WhUserAllData";
		
	}
	@RequestMapping("/delete")
	public String deleteWhUser(@RequestParam ("uid")Integer userId,Model model) {
		service.deleteWhUserType(userId);
		String msg="delete successfully";
		model.addAttribute("message",msg);
		
		List<WhUserType>list=service.getAllWhUserType();
		model.addAttribute("list",list);
		return "WhUserAllData";
		
	}
	@RequestMapping("/edit")
	public String editWhUser(@RequestParam("uid")Integer userId,Model model) {
		WhUserType ut=service.getOneWhUserType(userId);
		model.addAttribute("WhUserType",ut);
		return "WhUserEditPage";
		
	}
	
	  @RequestMapping(value="/update",method=RequestMethod.POST) 
	  public String updateWhUser(@ModelAttribute WhUserType whUserType,Model model) {
	  service.updateWhUserType(whUserType);
	  String msg="update"+whUserType.getUserId()+"successfully";
	  model.addAttribute("message",msg);
	  
	  List<WhUserType>list=service.getAllWhUserType();
	  model.addAttribute("list",list); 
	  return "WhUserAllData";
	  
	  }
	  
	  
	  
	  @RequestMapping("/view")
	public String viewUser(@RequestParam("uid")Integer userId,Model model) {
		WhUserType ut=  service.getOneWhUserType(userId);
		model.addAttribute("us",ut);
		return "WhUserView";
		
	}
	  
	  
	  
	  
	  
	  
	  
	  
	 
}
