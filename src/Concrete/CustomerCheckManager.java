package Concrete;

import Abstract.IPersonCheckService;
import Entities.Customer;


public class CustomerCheckManager  implements IPersonCheckService{

	@Override
	public boolean  checkIfRealPerson(Customer customer) {
		
		
		
		return true;
		
	}

}
