/*
 * package in.nit.service.impl;
 * 
 * import java.util.Collections; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import in.nit.dao.IOrderMethodDao; import in.nit.model.OrderMethod; import
 * in.nit.service.IOrderMethodService;
 * 
 * @Service public class OrderMethodServiceImpl implements IOrderMethodService {
 * 
 * @Autowired private IOrderMethodDao dao;
 * 
 * @Transactional public Integer saveOrderMethod(OrderMethod om) {
 * 
 * return dao.saveOrderMethod(om); }
 * 
 * @Transactional(readOnly=true) public List<OrderMethod> getAllOrderMethod() {
 * List<OrderMethod>list=dao.getAllOrderMethod();
 * Collections.sort(list,(om1,om2)->{return
 * (om1.getOrderId()-om2.getOrderId());}); return list; }
 * 
 * @Transactional public void deleteOrderType(Integer id) {
 * dao.deleteOrderType(id);
 * 
 * }
 * 
 * @Transactional(readOnly=true) public OrderMethod getOneOrderType(Integer id)
 * {
 * 
 * return dao.getOneOrderType(id); }
 * 
 * @Override public void updateOrder(OrderMethod om) { dao.updateOrder(om);
 * 
 * }
 * 
 * }
 */