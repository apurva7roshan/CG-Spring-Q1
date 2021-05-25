package springcore_test;

public class Customer {
	private int customerId; 
	private String customerName;
	private Integer customerContact;
	private Address customerAddress;
	 
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Integer getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(Integer customerContact) {
		this.customerContact = customerContact;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}


	void displayInfo(){  
	    System.out.println("Customer bean:- "+" "+customerId+" "+customerName+" "+customerContact);  
	    System.out.println("Injected the Address bean into Customer bean using setter injection:");
//	    System.out.println("Address bean:-"+" "+customerAddress);  
	}  

}
