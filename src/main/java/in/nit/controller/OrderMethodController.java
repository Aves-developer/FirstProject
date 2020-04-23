package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;
*/
@Controller
@RequestMapping("order")
public class OrderMethodController {
	/*
	 * @Autowired private IOrderMethodService service;
	 */
	
	@RequestMapping("/show")
	public String showOrder(Model model) {
		return "OrderMethodRegister";
		
	}
}
/*
 * @RequestMapping(value="/save", method=RequestMethod.POST) public String
 * saveOrder(@ModelAttribute OrderMethod orderMethod,Model model) { Integer Id=
 * service.saveOrderMethod(orderMethod); String
 * msg="save order"+Id+"successfully"; model.addAttribute("message",msg); return
 * "OrderMethodRegister";
 * 
 * }
 * 
 * @RequestMapping("/getAll") public String showAll(Model model) {
 * List<OrderMethod> list=service.getAllOrderMethod();
 * model.addAttribute("list", list); return "OrderMethodData";
 * 
 * }
 * 
 * @RequestMapping("/delete") public String deleteOrder(@RequestParam
 * ("ordid")Integer id,Model model) { service.deleteOrderType(id); String
 * message="delete successfully"; model.addAttribute("message",message); return
 * "OrderMethodData";
 * 
 * }
 * 
 * @RequestMapping("/edit") public String
 * getOneOrder(@RequestParam("ordid")Integer id,Model model) { OrderMethod ut=
 * service.getOneOrderType(id); model.addAttribute("OrderMethod", ut);
 * 
 * return "OrederMethodEdit";
 * 
 * }
 * 
 * @RequestMapping(value="/update", method=RequestMethod.POST) public String
 * updatOrderMethod(@ModelAttribute OrderMethod orderMethod,Model model) {
 * service.updateOrder(orderMethod); String
 * msg="OrderType"+orderMethod.getOrderId()+"updated successfully";
 * model.addAttribute("message",msg);
 * 
 * List<OrderMethod> list=service.getAllOrderMethod();
 * model.addAttribute("list",list); return "OrderMethodData";
 * 
 * }
 * 
 * public String viewOrderMethod(@RequestParam("ordid")Integer id,Model model) {
 * OrderMethod om=service.getOneOrderType(id); model.addAttribute("message",om);
 * return "OrderMethodView"; } }
 */