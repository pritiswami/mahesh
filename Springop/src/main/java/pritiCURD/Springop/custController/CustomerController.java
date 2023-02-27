package pritiCURD.Springop.custController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pritiCURD.Springop.custService.CustomerService;
import pritiCURD.Springop.custdto.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/pritiinsert")
	public Customer insertData(@RequestBody  Customer customer)
	{
	return customerService.insertData(customer);
	}
	
	@PostMapping("/pritinswami")
	public List<Customer> insertAllData(@RequestBody List<Customer> customer)
	{
	return customerService.insertAllData(customer);
	}
	
	
	@GetMapping("/hello")
	public Customer getCustInfo(@RequestParam int custID)
	{
		return customerService.getCustInfo(custID);
	}
	

	@GetMapping("/hi/{custID}")
	public Customer getCustInformation(@PathVariable int custID)
	{
		return customerService.getCustInfo(custID);
	}

	
	@PutMapping("/updatedata")
	public Customer updateBYId(@RequestBody Customer customer)
	{
		return customerService.updateBycustID(customer);
	}
	
	
}
