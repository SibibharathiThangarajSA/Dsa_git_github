package my_dsa4;
public class dList_ReverseExecution
{
	  public static void main(String[] args)
	  {
	        dList_Reverse list = new dList_Reverse();
	        list.insertData(1);
	        list.insertData(2);
	        list.insertData(3);
	        list.insertData(4);
	        list.displayForward();    
	        list.displayBackward();   
	        list.reverseList();
	        list.displayForward();    
	        list.displayBackward();
	    }

}
