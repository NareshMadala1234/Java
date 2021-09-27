interface Movie {
	void Actor();
	void Director();
	void Producer();
    void Audience();
}


abstract class Newlearner implements Movie {

	 public void Actor()
	{
		System.out.println(
			"welcome!! to the team");
	}
     public void Director()
	{
		System.out.println(
			"I am going to Direct");
	}
    public void Producer(){
        System.out.println("we are going to release");
    }
}

class Student extends Newlearner {
	 public void Audience()
	{
		System.out.println(
			"we are going to enjoy movie");
	}
}


public class question1 {
	public static void main(String[] args)
	{

		Student Student1 = new Student();

		Student1.Actor();
		Student1.Director();
		Student1.Audience();
        Student1.Producer();
	}
}