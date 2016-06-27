/**
 * 
 */
package hello;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author karthik
 *
 */
public class CustomerInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String mdn;
	private String ssn;
	private String primaryEmail;
	private String address;
	private ArrayList<String> mdnList;
	private String customerNumber;
	private ArrayList<String> acountNumberList;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mdn
	 */
	public String getMdn() {
		return mdn;
	}
	/**
	 * @param mdn2 the mdn to set
	 */
	public void setMdn(String mdn2) {
		this.mdn = mdn2;
	}
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the primaryEmail
	 */
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	/**
	 * @param primaryEmail the primaryEmail to set
	 */
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}	
	/**
	 * @return the customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	/**
	 * @return the mdnList
	 */
	public ArrayList<String> getMdnList() {
		return mdnList;
	}
	/**
	 * @param mdnList the mdnList to set
	 */
	public void setMdnList(ArrayList<String> mdnList) {
		this.mdnList = mdnList;
	}
	/**
	 * @return the acountNumberList
	 */
	public ArrayList<String> getAcountNumberList() {
		return acountNumberList;
	}
	/**
	 * @param acountNumberList the acountNumberList to set
	 */
	public void setAcountNumberList(ArrayList<String> acountNumberList) {
		this.acountNumberList = acountNumberList;
	}	

}
