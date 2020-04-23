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

import in.nit.model.Uom;
import in.nit.service.IUomService;
import in.nit.validator.UomValidator;

@Controller
@RequestMapping("/uom")
public class UomController {
	@Autowired
	private UomValidator validator;
	
	@Autowired
	private IUomService service;
	
	@RequestMapping("/show")
	public String showUom(Model model) {
		model.addAttribute("uom", new Uom());
		return "UomRegister";
		
	}
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String saveUom(@ModelAttribute Uom uom,Errors errors,ModelMap map) {
		
		validator.validate(uom, errors);
		if(!errors.hasErrors()) {
		map.addAttribute("uom", new Uom());
	Integer Id=service.saveUom(uom);
	String msg="save successfully"+Id;
	map.addAttribute("message", msg);
		}else {
			map.addAttribute("message", "please check all errors");
		}
		return "UomRegister";
		
	}

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Uom>list=service.getAllUom();
		model.addAttribute("list", list);
		return "UomAllData";
		
	}
	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("uid")Integer uomId, Model model) {
		service.deleteOneUOm(uomId);
		String msg="Uom deleted";
		model.addAttribute("message", msg);
		
		List<Uom>list=service.getAllUom();
		model.addAttribute("list",list);
		return "UomAllData";
		
	}
	@RequestMapping("/edit")
	public String updateUom(@RequestParam("uid")Integer uomId,Model model) {
		Uom um=service.getOneUom(uomId);
		model.addAttribute("uom",um);
		return "UomEditPage";
		
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String uomUpdate(@ModelAttribute Uom uom,Model model) {
		service.updateUom(uom);
		String msg="update"+uom.getUomId()+"successfully";
		model.addAttribute("message", msg);
		List<Uom>list=service.getAllUom();
		model.addAttribute("list",list);
		return "UomAllData";
		
	}
	@RequestMapping("/view")
	public String viewUom(@RequestParam("uid")Integer uomId,Model model) {
	Uom um=	service.getOneUom(uomId);
		model.addAttribute("ob",um);
		return "UomView";
		
	}
}
