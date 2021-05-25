package springcore_test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration ({"classpath:/applicationContext.xml"})
public class TestTests {
	
    private ApplicationContext context;
    
    @Before
    public void initApplicationContext() {
      context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    @After
    public void closeApplicationContext() {
      if (context != null) {
        ((ConfigurableApplicationContext) context).close();
        context = null;
      }
    }
	
	@Test
	public void beantest()
	{
		
		Customer customer = (Customer) context.getBean("obj");
		assertNotNull("Object Not null",customer);
	}
	
	@Test
	public void setterinjection()
	{
		Customer cus = (Customer) context.getBean("obj");
		assertNotNull("address object not null",cus.getCustomerAddress());
	}
	
	@Test
	public void constructorinjection()
	{
		Address add = (Address) context.getBean("constr");
		assertNotNull("address object not null",add);
	}
	
//	@Test
//	public void addresstest()
//	{
//		Address add = (Address) ctx.getBean("")
//	}
	 
}
