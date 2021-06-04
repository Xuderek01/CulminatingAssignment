
import javax.security.auth.login.AppConfigurationEntry; //Import necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
class APITest extends Frame implements ActionListener, WindowListener{ //Class that extends frame and inplements actionListener and WindowListener
    public static void main(String[] args){ //Main method
        menu(); //Calls on menu method
    }

    public static void formulas(){ //Formula screen method
        JFrame frame1 = new JFrame("Physics Application - Options"); //Initialize all variables and objects
        JLabel formulaTitle;
        Choice c;
        JButton confirm;
        JButton calculate;
        String option1 = "Item1";
        String option2 = "Item2";
        JTextField var1, var2;

        var1 = new JTextField(); //Initialize textField and set boundaries
        var1.setBounds(0,0,0,0);

        var2 = new JTextField();
        var2.setBounds(0,0,0,0);

        calculate = new JButton("Calculate"); //Create new button

        JLabel inputValue = new JLabel("", JLabel.CENTER); //Create new label and set boundaries
        inputValue.setBounds(100, 290, 800, 100);

        JLabel equation = new JLabel("", JLabel.CENTER);
        equation.setBounds(250, 240, 500, 100);

        formulaTitle = new JLabel("Formulas", JLabel.CENTER);
        formulaTitle.setBounds(250, 50, 500, 75);
        
        c = new Choice(); //Set dropbox, set boundaries, and add options
        c.setBounds(450, 170, 100, 30);
        c.add(option1);
        c.add(option2);

        confirm = new JButton("confirm"); //Set button and determine what happens when clicked
        confirm.setBounds(450, 205, 100, 30);
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent f) {
                String data = "Option Selected: " + c.getItem(c.getSelectedIndex()); //pulls data from option selected
                equation.setText(data);//Sets label to data variable
                
                
                
                if (c.getItem(c.getSelectedIndex()).equals(option1)){ //if option is selected
                    var1.setBounds(50, 490, 100, 30); //Set bounds for textFields
                    var2.setBounds(50, 525, 100, 30);

                    String var1String = var1.getText(); //Get text from textfields
                    double varA = Integer.parseInt(var1String); //Turn text to integer

                    String var2String = var1.getText();
                    double varB = Integer.parseInt(var2String);



                    inputValue.setText("a + b");

                    
                    calculate.setBounds(450, 375, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent g){
                            int ans = varA + varB; //Calculate value

                        }
                    });
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option2)){
                    inputValue.setText("b + a");
                }
                

                
            }
        });
        frame1.add(formulaTitle);
        frame1.add(c);
        frame1.add(confirm);
        frame1.add(equation);
        frame1.add(inputValue);
        frame1.add(calculate);
        frame1.add(var1);
        frame1.add(var2);
        formulaTitle.setFont(new Font("Courier", Font.BOLD, 75));
        equation.setFont(new Font("Courier", Font.PLAIN, 35));
        inputValue.setFont(new Font("Courier", Font.PLAIN, 30));
        frame1.setSize(1000, 1000);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }

    public static void menu(){
        JFrame frame = new JFrame("Physics Application"); //Names the frame
        JLabel title; //Creates new label(s)
        JButton enter; //Creates new button(s)
        title = new JLabel("Physics Application"); //Names the label
        title.setBounds(50, 50, 100, 30); //Sets size and location of the label
        enter = new JButton("ENTER"); //Names the button
        enter.setBounds(50, 100, 100, 30); //Sets size and location of the button
        enter.addActionListener(new ActionListener(){ //Adds an action listener to the button
            public void actionPerformed(ActionEvent e){ //When the button is pressed, perform actions 
                formulas(); //Calls on formulas method
                frame.setVisible(false); //Makes menu non-interactable and invisible
            }
        });
        
        frame.add(title); //Add title to frame
        frame.add(enter); //Add button to frame
        frame.setSize(1000, 1000); //Set frame size
        frame.setLayout(null); //Set layout
        frame.setVisible(true); //Determine if frame is visible and interactable
        
    }
}

