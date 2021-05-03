import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager =
				new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"ATAKAN","REYHANÝOÐLU",
			1995,"495*****"));
		
			
		
	}

}
