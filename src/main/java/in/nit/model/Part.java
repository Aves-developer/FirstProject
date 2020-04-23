package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Part {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String partCode;
	private Double ptwidth;
	private Double plength;
	private Double phieght;
	private Double pbCost;
	private String pbCurrency;
	private String pDesc;
	public Part() {
		super();
	}
	public Part(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public Double getPtwidth() {
		return ptwidth;
	}
	public void setPtwidth(Double ptwidth) {
		this.ptwidth = ptwidth;
	}
	public Double getPlength() {
		return plength;
	}
	public void setPlength(Double plength) {
		this.plength = plength;
	}
	public Double getPhieght() {
		return phieght;
	}
	public void setPhieght(Double phieght) {
		this.phieght = phieght;
	}
	public Double getPbCost() {
		return pbCost;
	}
	public void setPbCost(Double pbCost) {
		this.pbCost = pbCost;
	}
	public String getPbCurrency() {
		return pbCurrency;
	}
	public void setPbCurrency(String pbCurrency) {
		this.pbCurrency = pbCurrency;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	@Override
	public String toString() {
		return "Part [id=" + id + ", partCode=" + partCode + ", ptwidth=" + ptwidth + ", plength=" + plength
				+ ", phieght=" + phieght + ", pbCost=" + pbCost + ", pbCurrency=" + pbCurrency + ", pDesc=" + pDesc
				+ "]";
	}
	
	
}
