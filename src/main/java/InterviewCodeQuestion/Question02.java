package InterviewCodeQuestion;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String number="123-456-7890";
		String[]splitted=number.split("-");
		int size=splitted.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(splitted[i]);
		}

	}

}
