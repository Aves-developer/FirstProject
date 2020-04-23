package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whusertab")
public class WhUserType {
	@Id
	@GeneratedValue
	
	@Column(name="userid")
	private Integer userId;
	@Column(name="usertype")
	private String userType;
	@Column(name="usercode")
	private String userCode;
	@Column(name="userfor")
	private String userFor;
	@Column(name="useremail")
	private String userEmail;
	@Column(name="usercont")
	private String userCont;
	@Column(name="useridtype")
	private String useridType;
	@Column(name="ifother")
	private String ifOther;
	@Column(name="idnumber")
	private String idNumber;
	
	public WhUserType() {
		super();
	}
	
	public WhUserType(Integer userId) {
		super();
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserFor() {
		return userFor;
	}
	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserCont() {
		return userCont;
	}
	public void setUserCont(String userCont) {
		this.userCont = userCont;
	}
	public String getUseridType() {
		return useridType;
	}
	public void setUseridType(String useridType) {
		this.useridType = useridType;
	}
	public String getIfOther() {
		return ifOther;
	}
	public void setIfOther(String ifOther) {
		this.ifOther = ifOther;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "WhUserType [userId=" + userId + ", userType=" + userType + ", userCode=" + userCode + ", userFor="
				+ userFor + ", userEmail=" + userEmail + ", userCont=" + userCont + ", useridType=" + useridType
				+ ", ifOther=" + ifOther + ", idNumber=" + idNumber + "]";
	}
	
}
