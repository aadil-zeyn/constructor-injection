package Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =    new ClassPathXmlApplicationContext("application.xml");  
		Roles r =context.getBean("Role1",Roles.class);
		r.display();
//		Roles r2 =context.getBean("Role2",Roles.class);
//		r2.display();
//
//		Roles r3 =context.getBean("Role3",Roles.class);
//		r3.display();

    }
}
