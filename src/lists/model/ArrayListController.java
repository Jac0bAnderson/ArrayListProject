package lists.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	
	public  ArrayListController() //default constructor 
	{
		firstWords = new ArrayList<String>();
	}
	
 public void start()
 {
	firstWords.add("asdfjkl;sadjkfjl"); 
	firstWords.add("babababbabnadadaabbab");
	firstWords.add("( ͡° ͜ʖ ͡°)");
	showList();
 }
 
 private void showList()
 {
	 for(int spot =0; spot < firstWords.size();spot++)
		 JOptionPane.showMessageDialog(null, firstWords.get(spot)+ "is at spot#" + spot);
	 JOptionPane.showMessageDialog(null, "( ͡° ͜ʖ ͡°) hey lenny!");
 }
 
 
}
