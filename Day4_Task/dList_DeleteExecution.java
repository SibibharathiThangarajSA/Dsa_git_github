package my_dsa4;

public class dList_DeleteExecution {
	public static void main(String[]args)
	{
		dList_Delete list = new dList_Delete();
		list.insertData(10);
		list.insertData(20);
		list.insertData(30);
		list.insertData(40);
		list.displayForward();  
		list.displayBackward();
		list.deleteAtPosition(2);
		list.displayForward();  
		list.displayBackward();
	}

}
