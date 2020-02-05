package hclvijayawada.beansproject;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.exercise.User;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        User u1=(User)ctx.getBean("userbean");
        Scanner sc=new Scanner(System.in);
        
        
        System.out.print("welcome ");
    }
}
