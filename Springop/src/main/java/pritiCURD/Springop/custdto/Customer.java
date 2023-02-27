package pritiCURD.Springop.custdto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custID;
	
	private String custName;
	
	private int custMobile;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custID, String custName, int custMobile) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custMobile = custMobile;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(int custMobile) {
		this.custMobile = custMobile;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custMobile=" + custMobile + "]";
	}

    
	
	

	
}
