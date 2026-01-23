package pac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Greet.class);  //class file memory me load
						
			Greet ref=(Greet) ctx.getBean("greet");
						
			 ref.greet1();
		}

}


