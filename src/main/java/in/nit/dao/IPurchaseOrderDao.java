package in.nit.dao;

import java.util.List;

import in.nit.model.PurchaseOrder;

public interface IPurchaseOrderDao {
	
	Integer savePurchaseOrder(PurchaseOrder po);
	List<PurchaseOrder> getAllPurchaseOrder();
	public void deletePurchaseOrder(Integer id);
	PurchaseOrder getOnePurchaseOrder(Integer id);
	public void updatePurchaseOrder(PurchaseOrder po);
	
}
