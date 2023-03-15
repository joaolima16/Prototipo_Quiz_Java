package Questions;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	private String correctQuestion;
	private List<String> otherQuestions;
	private String response;
	 
	 public Questions(String correctQuestion, List<String> otherQuestions) {
	    setCorrectQuestion(correctQuestion);
	    setOtherQuestions(otherQuestions);
	  }
	  public String setCorrectQuestion(String question){
	    return this.correctQuestion = question;
	  }
	  
	  public String getCorrectQuestion() {
	    return correctQuestion;
	  }
	  
	  public void setOtherQuestions(List<String> otherQuestions){
		  this.otherQuestions = new ArrayList<String>();
		  for(String i: otherQuestions) {
			    this.otherQuestions.add(i);
			  }  
	  }
	  
	  public void getOtherQuestions() {
		  for(String i: this.otherQuestions) {
			    System.out.println(i);
			  }  
	  }
	  public String verifyResponse() {
		  for(String i: this.otherQuestions) {
			  if(correctQuestion.equalsIgnoreCase(i)) {
				 return response = "correto";
			  }
			  else {
				  response = "incorreto";
			  }
		
		  }
		  return response;
	  }
	  
	  
}
