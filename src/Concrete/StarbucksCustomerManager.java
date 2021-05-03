package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager 
{

	IPersonCheckService personalCheckService;
	
	public StarbucksCustomerManager(IPersonCheckService personalCheckService) {
		this.personalCheckService = personalCheckService;
	}

	@Override
public void  save(Customer customer) {
		if(personalCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("check if real true geldi");
			
		}
		else {
			System.out.println("check if real false geldi");
			
		}
		
	
}

	
	

}
