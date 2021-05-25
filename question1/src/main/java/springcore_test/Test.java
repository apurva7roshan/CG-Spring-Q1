package springcore_test;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

public class Test {
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Customer beanWithSetter=(Customer)factory.getBean("obj");  
	    beanWithSetter.displayInfo(); 
	    
	    beanWithSetter.getCustomerAddress().show();
	    
	    Address beanWithConstructor=(Address)factory.getBean("constr");
	    beanWithConstructor.show();
	   
	      
	}  

}
