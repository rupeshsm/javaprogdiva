import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class LoginFrame extends JFrame implements ActionListener{

  Container container = getContentPane();
  JLabel lbluser = new JLabel("USERNAME");
  JLabel lblpass = new JLabel("PASSWORD");

  JTextField txtuser = new JTextField();
  JPasswordField txtpass = new JPasswordField();

  JButton btnlogin = new JButton("Login");
  JButton btnreset = new JButton("Reset");

  JCheckBox cbshowpass = new JCheckBox("Show Password");

  LoginFrame(){

    setLayoutManager();
    setLocationAndSize();
    addComponentsToContainer();
    addActionEvent();
  }

  void setLayoutManager(){

    container.setLayout(null);
  }
  void setLocationAndSize(){
     lbluser.setBounds(50, 150, 100, 30);
     lblpass.setBounds(50, 220, 100, 30);
     txtuser.setBounds(150, 150, 150, 30);
     txtpass.setBounds(150, 220, 150, 30);
     cbshowpass.setBounds(150, 250, 150, 30);
     btnlogin.setBounds(50, 300, 100, 30);
     btnreset.setBounds(200, 300, 100, 30);
   }

  void addComponentsToContainer(){
    container.add(lbluser);
    container.add(lblpass);
    container.add(txtuser);
    container.add(txtpass);
    container.add(cbshowpass);
    container.add(btnlogin);
    container.add(btnreset);
  }

  void addActionEvent(){

    btnlogin.addActionListener(this);
    btnreset.addActionListener(this);
    cbshowpass.addActionListener(this);
  }


  public void actionPerformed(ActionEvent e){

    if(e.getSource()==btnlogin){

      String username = txtuser.getText();
      String pass = txtpass.getText();

      if(username.equalsIgnoreCase("Rupesh") && pass.equals("pass123")){

        JOptionPane.showMessageDialog(this, "Sucessfull Loging");
      }

      else{
        JOptionPane.showMessageDialog(this, "Loging Failed");
      }
    }

    if(e.getSource() == btnreset){

      txtuser.setText("");
      txtpass.setText("");
    }

    if(e.getSource()==cbshowpass){

      if(cbshowpass.isSelected()){
        txtpass.setEchoChar((char)0);
      }
      else{
        txtpass.setEchoChar('*');
      }
    }
  }



}



public class Login{
  public static void main(String[] args) {

    LoginFrame frame = new LoginFrame();
    frame.setTitle("Login Form");
    frame.setVisible(true);
    frame.setBounds(10,10,400,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
