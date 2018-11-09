import javax.swing.JOptionPane;

public class iknowwhatyoudidlastsummer {
public static void main(String[] args) {
	String first=JOptionPane.showInputDialog("what is your name");
String second=JOptionPane.showInputDialog("What did you do in the summer?");
JOptionPane.showMessageDialog(null, "I know what you did last summer " + first + " you did " + second);
}
}
