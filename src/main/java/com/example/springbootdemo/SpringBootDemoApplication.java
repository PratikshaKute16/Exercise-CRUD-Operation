package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Iterator;
import java.util.Optional;


@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {

		System.out.println("Welcome to springboot");
	ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
	UserRepo userRepo=context.getBean(UserRepo.class);


    /*creating object*/

		User user=new User();
		user.setName("Pratiksha");
	    user.setCity("pune");
		user.setCourse("IT");
	    user.setAge(22);

	   User user1=new User();
	   user1.setName("Aishwarya");
	   user1.setCity("A.nagar");
	   user1.setCourse("Mech");
	   user1.setAge(23);

	/*saving single User*/
	    User u1=userRepo.save(user1);
		System.out.println(u1);
	//Output-User{id=3, name='Aishwarya', city='A.nagar', course='Mech', age=23}

	/*Get User*/
		Iterable<User> itr=userRepo.findAll();
		Iterator<User> iterator=itr.iterator();
		itr.forEach(user2 ->{
			System.out.println(user);
		} );
	//Output-[User{id=1, name='Pratiksha', city='pune', course='IT', age=22}
		      //User{id=2, name='Aishwarya', city='A.nagar', course='Mech', age=23}


	/*updating user*/
		Optional<User> optional=userRepo.findById(2);
                 User u=optional.get();
				 u.setAge(21);
				 User r1=userRepo.save(u);
		System.out.println(r1);
    //Output-User{id=2, name='Pratiksha', city='pune', course='IT', age=21}

	/*Deleting User*/
		 userRepo.deleteById(1);
		 System.out.println("Deleted");
    //output-Deleted
	}

}
