package in.nit.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Uom;
import in.nit.service.IUomService;

@RestController
@RequestMapping("/rest/uom")
public class UomRestController {
	@Autowired
	private IUomService service;
	@GetMapping("/getAll")
	public ResponseEntity<List<Uom>> fetchAllUoms(){
	List<Uom>uoms=	service.getAllUom();
	ResponseEntity<List<Uom>> resp=new ResponseEntity<List<Uom>>(uoms,HttpStatus.OK);
		return resp;
		
	}
	@GetMapping("/one")
	public ResponseEntity<Uom> getOneUom(@RequestParam("id")Integer uomId){
		Uom uom=service.getOneUom(uomId);
		ResponseEntity<Uom> resp= new ResponseEntity<Uom>(uom,HttpStatus.OK);
		return resp;
	}
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeOneUom(@RequestParam("id")Integer uomId){
		        service.deleteOneUOm(uomId);
		        ResponseEntity<String> resp= new ResponseEntity<String>("One'"+uomId+"'is deleted",HttpStatus.OK);
		return resp;
		
	}
}
