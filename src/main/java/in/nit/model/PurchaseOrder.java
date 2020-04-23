package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class PurchaseOrder {
	@Id
	@GeneratedValue
	private Integer perId;
	private String perCode;
	private String perRefNum;
	private String perQuality;
	private String perStatus;
	private String perDesc;
	
	
	public PurchaseOrder() {
		super();
	}
	public PurchaseOrder(Integer perId) {
		super();
		this.perId = perId;
	}
	public Integer getPerId() {
		return perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public String getPerCode() {
		return perCode;
	}
	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}
	public String getPerRefNum() {
		return perRefNum;
	}
	public void setPerRefNum(String perRefNum) {
		this.perRefNum = perRefNum;
	}
	public String getPerQuality() {
		return perQuality;
	}
	public void setPerQuality(String perQuality) {
		this.perQuality = perQuality;
	}
	public String getPerStatus() {
		return perStatus;
	}
	public void setPerStatus(String perStatus) {
		this.perStatus = perStatus;
	}
	public String getPerDesc() {
		return perDesc;
	}
	public void setPerDesc(String perDesc) {
		this.perDesc = perDesc;
	}
	
	@Override
	public String toString() {
		return "PurchaseOrder [perId=" + perId + ", perCode=" + perCode + ", perRefNum=" + perRefNum + ", perQuality="
				+ perQuality + ", perStatus=" + perStatus + ", perDesc=" + perDesc + "]";
	}
	
}
