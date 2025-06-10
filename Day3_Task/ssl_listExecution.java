package my_dsa3;

public class ssl_listExecution {
	public static void main(String[] args) {
		
	ssl_insert s2=new ssl_insert();
	s2.insertData(5);
	s2.insertData(7);
	s2.insertData(8);
	s2.insertAtPosition(9,2);
	s2.display();
 }
}