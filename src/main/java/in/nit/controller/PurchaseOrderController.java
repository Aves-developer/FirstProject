package in.nit.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;

@Controller
@RequestMapping("/purchase")
public class PurchaseOrderController {
	

	@Autowired
	private IPurchaseOrderService service;
	
	/*
	 * @Autowired private IShipmentType serv;
	 */
	
	@RequestMapping("/show")
	public String showPurchase(Model model) {
		model.addAttribute("purchaseOrder",new PurchaseOrder());
		return "PurchaseOrderRegister";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savePurchase(@ModelAttribute PurchaseOrder purchaseOrder,
			Model model) {
		
		Integer Id=service.savePurchaseOrder(purchaseOrder);
		model.addAttribute("purchaseOrder" ,new PurchaseOrder());
		String msg="save purchase Order"+Id+"successfully";
		model.addAttribute("message",msg);
		return "PurchaseOrderRegister";
		
	}

	@RequestMapping("getAll")
	public String allDataPage(Model model) {
	List<PurchaseOrder>list=service.getAllPurchaseOrder();
	model.addAttribute("list",list);
		return "PurchaseOrderDataPage";
		
	}
	
	    @RequestMapping("/delete")
		public String deletePurchase(@RequestParam("perId")Integer id, Model model) {
	     	service.deletePurchaseOrder(id);
	     	String msg="sucessfully deleted";
	     	model.addAttribute("message",msg);
	     	List<PurchaseOrder>list=service.getAllPurchaseOrder();
	     	model.addAttribute("list",list);
			return "PurchaseOrderDataPage";
			
		}
	    @RequestMapping("/edit")
	    public String getOnePurchaseOrder(@RequestParam("perId")Integer id,Model model) {
	    PurchaseOrder po=	service.getOnePurchaseOrder(id);
	    model.addAttribute("PurchaseOrder",po);
			return "PurchaseOrderEdit";
	    	
	    }
	
	
	    @RequestMapping("/update")
	    public String updateOrder(@ModelAttribute PurchaseOrder purchaseOrder,
	    		Model model) {
	      	service.updatePurchaseOrder(purchaseOrder);
	    	String msg="update successfully"+purchaseOrder.getPerId()+"ok";
	    	model.addAttribute("message", msg);
	    	List<PurchaseOrder>list=service.getAllPurchaseOrder();
	    	model.addAttribute("list",list);
		    return "PurchaseOrderDataPage";
		
	}
	    @RequestMapping("/view")
	    public String viewOrder(@RequestParam("perId")Integer id,Model model) {
	    	PurchaseOrder po=service.getOnePurchaseOrder(id);
	    	model.addAttribute("ob",po);
	    	
			return "PurchaseOrderView";
	    	
	    	
	    }


	

	
	
	/*
	 * @SuppressWarnings("unused") private void CommonUi(Model model) {
	 * List<Object[]>shiplist= serv.getShipmentIdAndCode(); Map<Integer,String>
	 * shipMap=CommonUtil.convert(shiplist); model.addAttribute("shipMap",shipMap);
	 * }
	 */
	

}
