package Quiz;

import java.util.ArrayList;
import java.util.List;

import Questions.Questions;
import User.User;

public class Quiz {
	public static void main(String[] args) {
		 List<String>Teste = new ArrayList<String>();
		 Teste.add("teste1");
		    User user = new User("João");
		    Questions quiz = new Questions("teste1", Teste);
		 
		    if(quiz.verifyResponse().equalsIgnoreCase("correto")) {
		    	user.setNumber_CorrectQuestions(1);
		    	System.out.println("Respostas certas:" + user.getNumber_CorrectQuestions());
		    }
		    else {
		    	user.setNumber_IncorrectQuestions(1);	
		    	System.out.println("Respostas incorretas: " + user.getNumber_IncorrectQuestions());
		    }
		   
		    
	
	}
}
