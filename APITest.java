
import javax.security.auth.login.AppConfigurationEntry; //Import necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
class APITest extends Frame implements ActionListener, WindowListener{ //Class that extends frame and inplements actionListener and WindowListener

    public static double v1 = 0; // initial velocity
	public static double v2 = 0; // final velocity
	public static double t = 0; // time
	public static double a; // acceleration
	public static double g = 0; // gravity
	public static double dis = 0; // displacement
	public static double f = 0; // force
	public static double work = 0; // work
	public static double k = 0; // spring constant
	public static double mass = 0; // mass
	public static double tv = 0; // total velocity
	public static double h = 0; // height
	public static double result; //solution of the equation
	public static int exponent; // exponent
    public static void main(String[] args){ //Main method
        menu(); //Calls on menu method
    }

    public static void graphs(){

        JFrame frame2 = new JFrame("Physics Application - Options");

        JButton back, bGraph, vCGraph;

        JLabel graphTitle = new JLabel("Graphs", JLabel.CENTER);
        graphTitle.setBounds(250, 265, 500, 100);

        back = new JButton("Back");
        back.setBounds(450, 800, 100, 30);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent k){
                menu();
                frame2.setVisible(false);
            } 
        });

        bGraph = new JButton("Bar Graoh");
        bGraph.setBounds(300, 375, 400, 120);

        vCGraph = new JButton("Voltage-Current Graph");
        vCGraph.setBounds(300, 505, 400, 120);
        
        frame2.add(back);
        frame2.add(bGraph);
        frame2.add(vCGraph);
        frame2.add(graphTitle);
        graphTitle.setFont(new Font("Courier", Font.BOLD, 75));
        frame2.setSize(1000, 1000);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
    

    public static void formulas(){ //Formula screen method
        JFrame frame1 = new JFrame("Physics Application - Options"); //Initialize all variables and objects
        JLabel formulaTitle, inputValue, equation, chosenEq, answer;
        JLabel formulaTag1, formulaTag2, formulaTag3;
        Choice c;
        JButton confirm, back, calculate;
        JTextField acceleration, iVelo, fVelo, displace, force, massText, time, velocity, height, sConstant, workText;
        String option1 = "Acceleration Formula";
        String option2 = "Displacement Formula";
        String option3 = "Force Formula";
        String option4 = "Free Fall Formula";
        String option5 = "Velocity Formula";
        String option6 = "Work Formula";
        String option7 = "Power Formula";
        String option8 = "Potential Gravitational Energy Formula";
        String option9 = "Potential Kinetic Energy Formula";
        String option10 = "Potential Elastic Energy Formula";

        acceleration = new JTextField();
        acceleration.setBounds(0, 0, 0, 0);
        acceleration.setVisible(false);
        iVelo = new JTextField();
        iVelo.setBounds(0, 0, 0, 0);
        iVelo.setVisible(false);
        fVelo = new JTextField();
        fVelo.setBounds(0, 0, 0, 0);
        fVelo.setVisible(false);
        displace = new JTextField();
        displace.setBounds(0, 0, 0, 0);
        displace.setVisible(false);
        force = new JTextField();
        force.setBounds(0, 0, 0, 0);
        force.setVisible(false);
        massText = new JTextField();
        massText.setBounds(0, 0, 0, 0);
        massText.setVisible(false);
        time = new JTextField();
        time.setBounds(0, 0, 0, 0);
        time.setVisible(false);
        velocity = new JTextField();
        velocity.setBounds(0, 0, 0, 0);
        velocity.setVisible(false);
        height = new JTextField();
        height.setBounds(0, 0, 0, 0);
        height.setVisible(false);
        sConstant = new JTextField();
        sConstant.setBounds(0, 0, 0, 0);
        sConstant.setVisible(false);
        workText = new JTextField();
        workText.setBounds(0, 0, 0, 0);


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
        formulaTag1 = new JLabel("");
        formulaTag1.setBounds(320, 370, 150, 30);
        formulaTag2 = new JLabel("");
        formulaTag2.setBounds(320, 410, 150, 30);
        formulaTag3 = new JLabel("");
        formulaTag3.setBounds(320, 450, 150, 30);
        
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
        c.add(option10);


        calculate = new JButton("Calculate");
        confirm = new JButton("confirm"); //Set button and determine what happens when clicked
        confirm.setBounds(450, 205, 100, 30);
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent f) {
                String data = c.getItem(c.getSelectedIndex()); //pulls data from option selected
                equation.setText(data);//Sets label to data variable

                if (c.getItem(c.getSelectedIndex()).equals(option1)){
                    chosenEq.setText("a = (Vf - Vi)/t");
                    acceleration.setVisible(false);
                    displace.setVisible(false);
                    force.setVisible(false);
                    massText.setVisible(false);
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    workText.setVisible(false);
                    
                    fVelo.setBounds(450, 370, 100, 30);
                    fVelo.setVisible(true);
                    iVelo.setBounds(450, 410, 100, 30);
                    iVelo.setVisible(true);
                    time.setBounds(450, 450, 100, 30);
                    time.setVisible(true);

                    formulaTag1.setText("Final Velocity");
                    formulaTag2.setText("Initial Velocity");
                    formulaTag3.setText("Time");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){

                        }
                    });

                }
                else if (c.getItem(c.getSelectedIndex()).equals(option2)){
                    chosenEq.setText("d = Vi x t + 1/2a x t^2");
                    displace.setVisible(false);
                    force.setVisible(false);
                    massText.setVisible(false);
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    workText.setVisible(false);

                    iVelo.setBounds(450, 370, 100, 30);
                    iVelo.setVisible(true);
                    time.setBounds(450, 410, 100, 30);
                    time.setVisible(true);
                    acceleration.setBounds(450, 450, 100, 30);
                    acceleration.setVisible(true);

                    formulaTag1.setText("Initial Velocity");
                    formulaTag2.setText("Time");
                    formulaTag3.setText("Acceleration");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });

                }
                else if (c.getItem(c.getSelectedIndex()).equals(option3)){
                    chosenEq.setText("f = m x a");
                    displace.setVisible(false);
                    force.setVisible(false);
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    time.setVisible(false);
                    workText.setVisible(false);

                    massText.setBounds(450, 370, 100, 30);
                    massText.setVisible(true);
                    acceleration.setBounds(450, 410, 100, 30);
                    acceleration.setVisible(true);

                    formulaTag1.setText("Mass");
                    formulaTag2.setText("Acceleration");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option4)){
                    chosenEq.setText("free fall = (1/2 x 9.8) x t^2");
                    displace.setVisible(false);
                    force.setVisible(false);
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    massText.setVisible(false);
                    acceleration.setVisible(false);
                    workText.setVisible(false);

                    time.setBounds(450, 370, 100, 30);
                    time.setVisible(true);

                    formulaTag1.setText("Time");
                    formulaTag2.setText("");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option5)){
                    chosenEq.setText("v = d/t");
                    force.setVisible(false);
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    massText.setVisible(false);
                    acceleration.setVisible(false);
                    workText.setVisible(false);

                    displace.setBounds(450, 370, 100, 30);
                    displace.setVisible(true);
                    time.setBounds(450, 410, 100, 30);
                    time.setVisible(true);

                    formulaTag1.setText("Displacement");
                    formulaTag2.setText("Time");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option6)){
                    chosenEq.setText("w = f x d");
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    massText.setVisible(false);
                    acceleration.setVisible(false);
                    time.setVisible(false);
                    workText.setVisible(false);

                    force.setBounds(450, 370, 100, 30);
                    force.setVisible(true);
                    displace.setBounds(450, 410, 100, 30);
                    displace.setVisible(true);

                    formulaTag1.setText("Force");
                    formulaTag2.setText("Displacement");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
                    
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option7)){
                    chosenEq.setText("p = w/t");
                    force.setVisible(false);
                    velocity.setVisible(false);
                    height.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    massText.setVisible(false);
                    acceleration.setVisible(false);
                    workText.setVisible(false);
                    displace.setVisible(false);

                    workText.setBounds(450, 370, 100, 30);
                    workText.setVisible(true);
                    time.setBounds(450, 410, 100, 30);
                    time.setVisible(true);

                    formulaTag1.setText("Work");
                    formulaTag2.setText("Time");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });

                }
                else if (c.getItem(c.getSelectedIndex()).equals(option8)){
                    chosenEq.setText("m x 9.8 x h");
                    displace.setVisible(false);
                    force.setVisible(false);
                    velocity.setVisible(false);
                    acceleration.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    time.setVisible(false);
                    workText.setVisible(false);

                    massText.setBounds(450, 370, 100, 30);
                    massText.setVisible(true);
                    height.setBounds(450, 410, 100, 30);
                    height.setVisible(true);

                    formulaTag1.setText("Mass");
                    formulaTag2.setText("Height");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option9)){
                    chosenEq.setText("1/2m x v^2");
                    displace.setVisible(false);
                    force.setVisible(false);
                    height.setVisible(false);
                    acceleration.setVisible(false);
                    sConstant.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    time.setVisible(false);
                    workText.setVisible(false);

                    massText.setBounds(450, 370, 100, 30);
                    massText.setVisible(true);
                    velocity.setBounds(450, 410, 100, 30);
                    velocity.setVisible(true);

                    formulaTag1.setText("Mass");
                    formulaTag2.setText("Velocity");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
                }
                else if (c.getItem(c.getSelectedIndex()).equals(option10)){
                    chosenEq.setText("1/2k x d^2");
                    force.setVisible(false);
                    height.setVisible(false);
                    acceleration.setVisible(false);
                    massText.setVisible(false);
                    velocity.setVisible(false);
                    fVelo.setVisible(false);
                    iVelo.setVisible(false);
                    time.setVisible(false);
                    workText.setVisible(false);

                    displace.setBounds(450, 410, 100, 30);
                    displace.setVisible(true);
                    sConstant.setBounds(450, 370, 100, 30);
                    sConstant.setVisible(true);

                    formulaTag1.setText("Displacement");
                    formulaTag2.setText("Spring Constant");
                    formulaTag3.setText("");

                    calculate.setBounds(450, 490, 100, 30);
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l){
                            
                        }
                    });
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
        frame1.add(acceleration);
        frame1.add(fVelo);
        frame1.add(iVelo);
        frame1.add(time);
        frame1.add(displace);
        frame1.add(force);
        frame1.add(massText);
        frame1.add(velocity);
        frame1.add(height);
        frame1.add(sConstant);
        frame1.add(workText);
        frame1.add(calculate);
        frame1.add(formulaTag1);
        frame1.add(formulaTag2);
        frame1.add(formulaTag3);
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
        graph.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent j){
                graphs();
                frame.setVisible(false);
            }
        });
        
        frame.add(title); //Add title to frame
        frame.add(formula); //Add button to frame
        frame.add(graph);
        title.setFont(new Font("Courier", Font.BOLD, 50));
        frame.setSize(1000, 1000); //Set frame size
        frame.setLayout(null); //Set layout
        frame.setVisible(true); //Determine if frame is visible and interactable
        
    }
}

