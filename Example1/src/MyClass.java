import javax.swing.*;
import java.io.IOException;

public class MyClass {
    public static void main(String[] args) throws IOException {

        String message=JOptionPane.showInputDialog(null,"Broccoli is good for health","Green Food",JOptionPane.INFORMATION_MESSAGE);
        String [] options={"ABC","PQR"};
        ImageIcon icon=new ImageIcon("");
        String res=(String)JOptionPane.showInputDialog(null,"Do you want more options","message",JOptionPane.QUESTION_MESSAGE,icon,options,options[0]);

        int id=Integer.parseInt(JOptionPane.showInputDialog("Enter id here"));
        System.out.println("ID is "+id);

        String name= JOptionPane.showInputDialog("Enter name here");
        System.out.println("Name is "+name);

        double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter salary here"));
        System.out.println("Salary is "+salary);
    }
}
