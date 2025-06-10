package my_dsa3;

public class ssl_deleteExecution
{
	public static void main(String[] args)
	{
		
		ssl_delete s3=new ssl_delete();
		s3.insertData(5);
		s3.insertData(7);
		s3.insertData(8);
		s3.deleteAtPosition(2);
		s3.display();
	 }

}
