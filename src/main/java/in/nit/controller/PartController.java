package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Part;
import in.nit.service.IPartService;

@RequestMapping("/part")
@Controller
public class PartController {
	@Autowired
	private IPartService service;
	
	@RequestMapping("/show")
	 public String showPart(Model model) {
		model.addAttribute("part",new Part());
		return "PartRegister";
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savePart(@ModelAttribute Part part, Model model) {
		model.addAttribute("part", new Part());
		Integer Id=service.savePart(part);
		String msg="save"+Id+"successfully";
		model.addAttribute("message",msg);
		return "PartRegister";
		
	}
	@RequestMapping("/getAll")
	public String getPart(Model model) {
		List<Part>list=service.getAllPart();
		model.addAttribute("list", list);
		return "PartAllData";
		
	}
	
	@RequestMapping("/delete")
	public String deletePart(@RequestParam("pid")Integer id,Model model) {
		service.deletePart(id);
		String msg="delete successfully";
		model.addAttribute("message", msg);
		//fetch all data
		List<Part>list=service.getAllPart();
		model.addAttribute("list",list);
		return "PartAllData";
		
	}
	@RequestMapping("/edit")
	public String getPart(@RequestParam("pid")Integer id,Model model) {
	Part p=	service.getOnePart(id);
	model.addAttribute("part",p);
		return "EditPart";
		
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updatePart(@ModelAttribute Part part,Model model) {
		service.updatePart(part);
		String msg="update"+part.getId()+"successfully";
		model.addAttribute("message",msg);
		List<Part>list=service.getAllPart();
		model.addAttribute("list",list);
		return "PartAllData";
		
	}
	@RequestMapping("/view")
	public String getOnePart(@RequestParam ("pid")Integer id,Model model) {
		Part p=service.getOnePart(id);
		model.addAttribute("pt",p);
		return "ViewPart";
		
	}
	}
	
		
	

