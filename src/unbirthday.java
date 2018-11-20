import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("when is your birthday");
		if (first.equals("11/19/18")) {
			System.out.println("Happy beirtthay ");
		} else {
			System.out.println("Happy unbeirfzay ");
		}
	}
}
