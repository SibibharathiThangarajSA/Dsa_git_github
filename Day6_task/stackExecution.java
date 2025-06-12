package my_dsa6;

public class stackExecution {
	public static void main(String[]args)
	{
		stackOperation s=new stackOperation();
		s.push(5);
		s.push(6);
		s.push(4);
		s.push(10);
		s.push(45);
		s.display(); 
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display(); 
		
	}

}
