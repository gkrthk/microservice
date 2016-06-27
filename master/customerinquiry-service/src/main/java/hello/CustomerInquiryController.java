package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerInquiryController {
		protected CustomerInfo customerInfo;
		public CustomerInquiryController(){
			this.customerInfo = new CustomerInfo();
		}

	    @RequestMapping("/customer")
	    public CustomerInfo getCustomerInfo() {
	    	customerInfo.setAddress("Warren");
	    	customerInfo.setCustomerNumber("1234567");
	    	customerInfo.setFirstName("Mark");
	    	customerInfo.setLastName("Jacob");
	    	customerInfo.setMdn("123456778");
	    	customerInfo.setPrimaryEmail("abc@verizon.com");
	    	customerInfo.setSsn("123456789");	    	
			return customerInfo;	        
	    }
	    
	    @RequestMapping("/greeting")
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(1,name);
	    }
	    	    

}
