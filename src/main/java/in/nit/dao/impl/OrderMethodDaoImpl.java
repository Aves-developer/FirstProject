/*
 * package in.nit.dao.impl;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.orm.hibernate5.HibernateTemplate; import
 * org.springframework.stereotype.Repository;
 * 
 * import in.nit.dao.IOrderMethodDao; import in.nit.model.OrderMethod;
 * 
 * @Repository public class OrderMethodDaoImpl implements IOrderMethodDao {
 * 
 * @Autowired private HibernateTemplate ht;
 * 
 * public Integer saveOrderMethod(OrderMethod om) {
 * 
 * return (Integer) ht.save(om); }
 * 
 * @Override public List<OrderMethod> getAllOrderMethod() {
 * List<OrderMethod>list= ht.loadAll(OrderMethod.class); return list; }
 * 
 * @Override public void deleteOrderType(Integer id) {
 * 
 * 
 * ht.delete(new OrderMethod(id));
 * 
 * }
 * 
 * @Override public OrderMethod getOneOrderType(Integer id) {
 * 
 * return ht.get(OrderMethod.class, id); }
 * 
 * @Override public void updateOrder(OrderMethod om) { ht.update(om);
 * 
 * } }
 */