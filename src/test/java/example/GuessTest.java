package example;

import org.junit.jupiter.api.Test;

import tw.commands.GuessInputCommand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class GuessTest {

	
	 @Test
	    public void should_produce_random_number() {
	    	//given
		 	List<Integer> list = new ArrayList<Integer>() ;
			 	list.add(1);
			 	list.add(2);
			 	list.add(3);
			 	list.add(4);		
		 	List<String> answer = new ArrayList<>();
	 			answer.add("1");
	 			answer.add("2");
	 			answer.add("3");
	 			answer.add("4");
	        //when
		 	String result = GuessInputCommand.sameNumber(answer,list);
	       
		 	//then
	        assertEquals("4A4B",result);
	     }
	
	
}
