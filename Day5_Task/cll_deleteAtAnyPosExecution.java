package my_dsa5;

public class cll_deleteAtAnyPosExecution {
	public static void main(String[] args)
	{
        cll_deleteAtAnyPos list = new cll_deleteAtAnyPos();
        list.insertData(10);
        list.insertData(20);
        list.insertData(30);
        list.insertData(40);
        System.out.println("Original List:");
        list.display();
        list.deleteAtPosition(2);
        System.out.println("After deleting at position 2:");
        list.display(); 
    }

}
