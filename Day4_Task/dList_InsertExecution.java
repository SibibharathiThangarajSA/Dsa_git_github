package my_dsa4;

public class dList_InsertExecution {
	public static void main(String[]args)
	{
		dList_Insert list = new dList_Insert();
		list.insertData(10);
		list.insertData(20);
		list.insertData(30);
		list.insertAtPosition(25,2);
		list.displayForward();  
		list.displayBackward();

	}

}
