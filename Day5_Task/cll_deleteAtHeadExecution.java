package my_dsa5;

public class cll_deleteAtHeadExecution {
	public static void main(String[] args)
	{
        cll_deleteAtHead list = new cll_deleteAtHead();

        list.insertData(10);
        list.insertData(20);
        list.insertData(30);
        list.display();        
        list.deleteFromHead();   
        list.display();   
    }

}
