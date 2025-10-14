import java.awt.*;
import java.awt.event.*;

public class MenuDisplayExample extends Frame implements ActionListener{
Label messageLabel;
MenuDisplayExample(){
MenuBar menuBar=new MenuBar();
Menu file =new Menu("File");
Menu edit =new Menu("Edit");
Menu help =new Menu("Help");

MenuItem newFile = new MenuItem("New");
MenuItem openFile = new MenuItem("Open");
MenuItem saveFile = new MenuItem("Save");
MenuItem exit = new MenuItem("Exit");

file.add(newFile);
file.add(openFile);
file.add(saveFile);
file.addSeparator();
file.add(exit);

MenuItem cut=new MenuItem("Cut");
MenuItem copy = new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");

edit.add(cut);
edit.add(copy);
edit.add(paste);

menuBar.add(file);
menuBar.add(edit);
menuBar.add(help);

setMenuBar(menuBar);

messageLabel=new Label("Choose a menu item",Label.CENTER);

messageLabel.setFont(new Font("Arial",Font.BOLD,16));

setLayout(new BorderLayout());
add(messageLabel,BorderLayout.CENTER);

MenuItem[] allItems={newFile, openFile, saveFile, exit,cut,copy,paste};
for(MenuItem item:allItems){
item.addActionListener(this);
}

setTitle("AWT Menu Example");
setSize(500,500);
setVisible(true);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
});
}
public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
messageLabel.setText("You selected: " + command);
if(command.equals("Exit")){
System.exit(0);
}}

public static void main(String []args){
new MenuDisplayExample();
}
}
