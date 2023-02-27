package pritiCURD.Springop.custService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pritiCURD.Springop.custDAO.CustomerRepository;
import pritiCURD.Springop.custdto.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer insertData(Customer customer)
	{
	return customerRepository.save(customer);
	}
	
	public List<Customer> insertAllData(List<Customer> customer)
	{
	return customerRepository.saveAll(customer);
	}
	
	public Customer getCustInfo(int custID)
	{
		return customerRepository.findById(custID).orElse(null);
	}

	
	public Customer updateBycustID(Customer customer)
	{
		
		Customer existingcust = customerRepository.findById(customer.getCustID()).orElse(null);
		existingcust.setCustName(customer.getCustName());
		existingcust.setCustMobile(customer.getCustMobile());
		
		return customerRepository.save(existingcust);
		
	}
}
