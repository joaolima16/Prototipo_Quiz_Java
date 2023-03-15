package User;

public class User {
	private String name;
	private int number_CorrectQuestions, number_IncorrectQuestions;
	
	public User(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber_IncorrectQuestions() {
		return number_IncorrectQuestions;
	}
	public void setNumber_IncorrectQuestions(int number_IncorrectQuestions) {
		this.number_IncorrectQuestions = number_IncorrectQuestions + this.number_IncorrectQuestions;
	}
	public int getNumber_CorrectQuestions() {
		return number_CorrectQuestions;
	}
	public void setNumber_CorrectQuestions(int number_CorrectQuestions) {
		this.number_CorrectQuestions = number_CorrectQuestions + this.number_CorrectQuestions;
	}
}
