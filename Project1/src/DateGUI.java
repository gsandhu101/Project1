
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.*;

//Read dates from file
//Display them in GUI

//Make Grid Layout - check
//1 Row, 2 Columns -check

//Left column: Display
//dates in format read
//from file. Right column:
//Display dates in sorted.

//Separate GUI and Logic.


public class DateGUI {
	
	static JFrame myFrame;
	static Container cPane;
	static TextArea unsortedElements, sortedElements;

	public DateGUI() {
		myFrame = new JFrame();
		
		myFrame.setSize(500, 250);//Setting size of window.
		myFrame.setLocation(250, 350);//Where it will show up.
		
		myFrame.setTitle("Date GUI");//Named the window.
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1, 2));//Because we need two columns.
		cPane = myFrame.getContentPane();
		
		unsortedElements = new TextArea();//We have the unsorted..
		sortedElements = new TextArea();//And the sorted in different places.
		
		cPane.add(unsortedElements);//The order matters, because
		cPane.add(sortedElements);//if not the order is going to be
		//the other way.
		
		myFrame.setVisible(true);
	}
	
	
	
	
}
