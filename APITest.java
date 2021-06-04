
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

    public static void graphs(){
        JFrame frame2 = new JFrame("Physics Application - Options");
        

    }
    

    public static void formulas(){ //Formula screen method
        JFrame frame1 = new JFrame("Physics Application - Options"); //Initialize all variables and objects
        JLabel formulaTitle, inputValue, equation, chosenEq, answer;
        Choice c;
        JButton confirm, back;
        JTextField acceleration, iVelo, fVelo, displace, force, mass, time, velocity, height;
        String option1 = "Acceleration Formula";
        String option2 = "Displacement Formula";
        String option3 = "Force Formula";
        String option4 = "Free Fall Formula";
        String option5 = "Velocity Formula";
        String option6 = "Work Formula";
        String option7 = "Power Formula";
        String option8 = "Potential Gravitational Energy Formula";
        String option9 = "Potential Kinetic Energy Formula";

        answer = new JLabel("ANSWER: ", JLabel.CENTER);
        answer.setBounds(100, 600, 800, 100);

        chosenEq = new JLabel("", JLabel.CENTER);
        chosenEq.setBounds(250, 290, 500, 75);
        
        inputValue = new JLabel("", JLabel.CENTER); //Create new label and set boundaries
        inputValue.setBounds(100, 290, 800, 100);

        equation = new JLabel("", JLabel.CENTER);
        equation.setBounds(250, 240, 500, 100);

        formulaTitle = new JLabel("Formulas", JLabel.CENTER);
        formulaTitle.setBounds(250, 50, 500, 75);
        
        c = new Choice(); //Set dropbox, set boundaries, and add options
        c.setBounds(400, 170, 200, 30);
        c.add(option1);
        c.add(option2);
        c.add(option3);
        c.add(option4);
        c.add(option5);
        c.add(option6);
        c.add(option7);
        c.add(option8);
        c.add(option9);

        confirm = new JButton("confirm"); //Set button and determine what happens when clicked
        confirm.setBounds(450, 205, 100, 30);
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent f) {
                String data = c.getItem(c.getSelectedIndex()); //pulls data from option selected
                equation.setText(data);//Sets label to data variable

                if (c.getItem(c.getSelectedIndex()).equals(option1)){
                    chosenEq.setText("(Vf - Vi)/t");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option2)){
                    chosenEq.setText("Vf - Vi");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option3)){
                    chosenEq.setText("m x a");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option4)){
                    chosenEq.setText("(1/2 x 9.8) x t^2");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option5)){
                    chosenEq.setText("d/t");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option6)){
                    chosenEq.setText("f x d");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option7)){
                    chosenEq.setText("m x g x h");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option8)){
                    chosenEq.setText("1/2m x v^2");
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option9)){
                    chosenEq.setText("1/2k x d^2");
                }

            }
        });

        back = new JButton("Back");
        back.setBounds(450, 800, 100, 30);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent h){
                menu();
                frame1.setVisible(false);
            }

        });

        frame1.add(formulaTitle);
        frame1.add(c);
        frame1.add(confirm);
        frame1.add(equation);
        frame1.add(inputValue);
        frame1.add(chosenEq);
        frame1.add(answer);
        frame1.add(back);
        formulaTitle.setFont(new Font("Courier", Font.BOLD, 75));
        equation.setFont(new Font("Courier", Font.PLAIN, 35));
        inputValue.setFont(new Font("Courier", Font.PLAIN, 30));
        chosenEq.setFont(new Font("Courier", Font.PLAIN, 30));
        answer.setFont(new Font("Courier", Font.BOLD, 30));
        frame1.setSize(1000, 1000);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }

    public static void menu(){
        JFrame frame = new JFrame("Physics Application"); //Names the frame
        JLabel title; //Creates new label(s)
        JButton formula, graph; //Creates new button(s)
        title = new JLabel("Physics Application", JLabel.CENTER); //Names the label
        title.setBounds(250, 295, 500, 75); //Sets size and location of the label
        formula = new JButton("formula"); //Names the button
        formula.setBounds(375, 375, 250, 75); //Sets size and location of the button
        formula.addActionListener(new ActionListener(){ //Adds an action listener to the button
            public void actionPerformed(ActionEvent e){ //When the button is pressed, perform actions 
                formulas(); //Calls on formulas method
                frame.setVisible(false);
            }
        });

        graph = new JButton("Graph");
        graph.setBounds(375, 460, 250, 75);
        
        frame.add(title); //Add title to frame
        frame.add(formula); //Add button to frame
        frame.add(graph);
        title.setFont(new Font("Courier", Font.BOLD, 50));
        frame.setSize(1000, 1000); //Set frame size
        frame.setLayout(null); //Set layout
        frame.setVisible(true); //Determine if frame is visible and interactable
        
    }
}

