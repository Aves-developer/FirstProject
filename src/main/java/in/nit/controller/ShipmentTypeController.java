package in.nit.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.excelview.ShipmenttypeExcelView;
import in.nit.model.ShipmentType;
import in.nit.pdfview.ShipmentTypePdfView;
import in.nit.service.IShipmentType;
import in.nit.util.ShipmentUtils;
import in.nit.validator.ShipmentValidator;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	
	@Autowired
	private IShipmentType service;
	
	@Autowired
	private ShipmentUtils util;
	@Autowired
	private ServletContext context;
	@Autowired
	private ShipmentValidator validator;
	
	@RequestMapping("/show")
	public String registerPage() {
		return "ShipmentTypeRegister";
		
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType,
			Errors errors,ModelMap map) {
		
		validator.validate(shipmentType, errors);
		if(!errors.hasErrors()) {
		Integer Id=service.saveShipmentType(shipmentType);
		map.addAttribute("message","ShipmentType"+Id+"saved");
		}else {
			map.addAttribute("message", "Checks All errors");
		}
		return "ShipmentTypeRegister";
		
	}
	@RequestMapping("/getAll")
	public String getAllShipment(Model model) {
		List<ShipmentType> list=service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
		
	}
	@RequestMapping("/delete")
	public String getShipmentById(@RequestParam("sid")Integer id,Model model) {
		service.deleteShipmentType(id);
		String message="Shipment"+id+"deleted";
		model.addAttribute("message",message);
		//fecth new data
		List<ShipmentType>list=service.getAllShipmentType();
		model.addAttribute("list",list);
		return "ShipmentTypeData";
		
	}
	@RequestMapping("/edit")
	public String getOneShipment( @RequestParam("sid")Integer id,Model model) {
	ShipmentType st=	service.getOneShipmentType(id);
	model.addAttribute("ShipmentType",st);
		return "ShipmentTypeEdit";
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateShipment(@ModelAttribute ShipmentType shipmentType,
			Model model) {
		service.updateShipmentType(shipmentType);
		String message="ShipmentType"+shipmentType.getShipId()+"updated Successfully";
		model.addAttribute("message", message);
		 
		List<ShipmentType>list=service.getAllShipmentType();
		model.addAttribute("list",list);
		return "ShipmentTypeData";
		
	}
	@RequestMapping("/view")
	public String viewOnShipmentType(@RequestParam("sid")Integer id,
			Model model) {
	ShipmentType st=	service.getOneShipmentType(id);
	model.addAttribute("ob", st);
		
		return "ShipmentTypeView";
		
	}
	@RequestMapping("/excel")
	public ModelAndView showExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmenttypeExcelView());
		//fetching data from DB
		List<ShipmentType>list=service.getAllShipmentType();
		m.addObject("list",list);
		return m;
		}
	
	@RequestMapping("/pdf")
	public ModelAndView showPdf() {
		ModelAndView v=new ModelAndView();
		v.setView(new ShipmentTypePdfView());
		List<ShipmentType> list=service.getAllShipmentType();
		v.addObject("list",list);
		return  v;
		
	}
	
	@RequestMapping("/charts")
	public String showCharts() {
	List<Object[]>list=	service.getShipmentModeCount();
	String path=context.getRealPath("/");
	  util.generatePie(path, list);
	  
		return "ShipmentTypeCharts" ;
		
	}
	
	
}


