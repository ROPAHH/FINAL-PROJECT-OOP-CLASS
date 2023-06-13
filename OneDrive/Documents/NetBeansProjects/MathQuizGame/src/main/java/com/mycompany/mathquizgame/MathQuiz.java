/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathquizgame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ropah
 */
public class MathQuiz extends JFrame implements ActionListener{
    
        //JLabel titleLabel = new JLabel("The ULTIMATE game");
        JLabel titleLabel1 = new JLabel("ULTIMATE MATH");
        JLabel subTitle1Label1 = new JLabel("*****************************");
	JLabel subTitle2Label1 = new JLabel("*****************************");
	JLabel questionLabel1 = new JLabel();
	JLabel answerLabel1 = new JLabel("INSERT ANSWER HERE: ");
	JLabel gameOverLabel = new JLabel();
        
        JButton startButton = new JButton("START");
	JButton addButton = new JButton("+");
	JButton divButton = new JButton("/");
	JButton subButton = new JButton("-");
	JButton mulButton = new JButton("x");
        JButton restartButton = new JButton("Play AGAIN");
	JButton exitButton = new JButton("EXIT!!");
        
        JTextField answerField = new JTextField(30);
	JTextField remarksField = new JTextField(25);
	JTextField rightCounterField = new JTextField(6);
	JTextField wrongCounterField = new JTextField(6);
	
        Font titleFont = new Font("Tahoma",Font.BOLD, 58);
	Font questionFont = new Font("Tahoma",Font.BOLD, 48);
	Font answerFont = new Font("Tahoma",Font.BOLD, 38);
        
        Random random = new Random();
        int digit1;
	int digit2;
        int correctAnswer;
	String operator="";
        int rightCounter=0;
	int wrongCounter=0;
        final int LIMIT =10;
        
    public MathQuiz() {
        
               setLayout(new FlowLayout());
		add(titleLabel1);
                add(subTitle1Label1);
		add(questionLabel1);
		add(subTitle2Label1);
		add(answerLabel1);
		add(answerField);
		add(rightCounterField);
		add(addButton);
		add(divButton);
		add(subButton);
		add(mulButton);
		add(wrongCounterField);
		add(remarksField);
                add(startButton);
                //add(startButton);
		add(gameOverLabel);
		add(restartButton);
		add(exitButton);
		
                
                
                restartButton.setVisible(false);
		exitButton.setVisible(false);
		gameOverLabel.setVisible(false);
		rightCounterField.setVisible(false);
		wrongCounterField.setVisible(false);
		questionLabel1.setVisible(false);
		subTitle2Label1.setVisible(false);
		answerLabel1.setVisible(false);
		answerField.setVisible(false);
		addButton.setVisible(false);
		divButton.setVisible(false);
		subButton.setVisible(false);
		mulButton.setVisible(false);
		remarksField.setVisible(false);
		
    
                getContentPane().setBackground(Color.PINK);
                rightCounterField.setForeground(Color.orange);
		wrongCounterField.setForeground(Color.red);
		questionLabel1.setForeground(Color.black);
		answerField.setForeground(Color.red);
		addButton.setForeground(Color.blue);
		divButton.setForeground(Color.MAGENTA);
		subButton.setForeground(Color.gray);
		mulButton.setForeground(Color.green);
                
                mulButton.setBackground(Color.black);
		subButton.setBackground(Color.black);
		divButton.setBackground(Color.black);
		addButton.setBackground(Color.black);
                startButton.setBackground(Color.pink);
                
                
                titleLabel1.setFont(titleFont);
		subTitle1Label1.setFont(questionFont);
		subTitle2Label1.setFont(questionFont);
		questionLabel1.setFont(questionFont);
		answerLabel1.setFont(answerFont);
		answerField.setFont(answerFont);
		remarksField.setFont(answerFont);
		rightCounterField.setFont(answerFont);
		wrongCounterField.setFont(answerFont);
		addButton.setFont(titleFont);
		divButton.setFont(titleFont);
		subButton.setFont(titleFont);
		mulButton.setFont(titleFont);
                startButton.setFont(new Font("Tahoma",Font.BOLD,100));
		restartButton.setFont(new Font("Tahoma",Font.BOLD,50));
		exitButton.setFont(new Font("Tahoma",Font.BOLD,50));
		gameOverLabel.setFont(new Font("Tahoma",Font.BOLD,90));
                
                startButton.addActionListener(this);
                answerField.addActionListener(this);
		mulButton.addActionListener(this);
		subButton.addActionListener(this);
		divButton.addActionListener(this);
		addButton.addActionListener(this);
                restartButton.addActionListener(this);
                exitButton.addActionListener(this);
                
                setTitle("Fun Math Quiz game");
		setIconImage(new ImageIcon("mybee_1.jpg").getImage());
		setSize(1500,800);
		//setLocation(600,100);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== startButton) {
	     getContentPane().setBackground(Color.pink);
             startButton.setVisible(false);
	     rightCounterField.setVisible(true);
             wrongCounterField.setVisible(true);
	     questionLabel1.setVisible(true);
	     subTitle2Label1.setVisible(true);
	     answerLabel1.setVisible(true);
	     answerField.setVisible(true);
	     answerField.setVisible(true);
             addButton.setVisible(true);
	     divButton.setVisible(true);
	     subButton.setVisible(true);
	     mulButton.setVisible(true);
             remarksField.setVisible(true);
	     answerField.setVisible(true);
             
        }
         if(e.getSource()==mulButton) {
	    operator="x";
	      questionLabel1.setText(setQuestion(operator));
	      answerField.setEditable(true);
			
	}
        if(e.getSource()==addButton) {
            operator="+";
	    questionLabel1.setText(setQuestion(operator));
            answerField.setEditable(true);
			
	}  
        if(e.getSource()==subButton) {
            operator="-";
            questionLabel1.setText(setQuestion(operator));
	    answerField.setEditable(true);
			
	}
        if(e.getSource()==divButton) {
            operator="/";
	    questionLabel1.setText(setQuestion(operator));
	    answerField.setEditable(true);
            
        }
        if(e.getSource()== restartButton) {
        	new MathQuiz();
        	this.setVisible(false);
        	
        }
        if(e.getSource()== exitButton) {
        	//System.exit(0);
                setVisible(false);
        new HomepageQuiz().setVisible(true);
    }       
        
                        
        if(e.getSource()==answerField) {
            int userAnswer = Integer.parseInt(answerField.getText());
            if (userAnswer == correctAnswer) {
	        remarksField.setForeground(Color.CYAN);
		remarksField.setText(getCorrectResponse());
		answerField.setText("");
		rightCounterField.setText(rightCounter + "");
		questionLabel1.setText(setQuestion(operator));
                            
            }
            else {
	            remarksField.setForeground(Color.blue);
		    remarksField.setText(getWrongResponse());
		    answerField.setText("");
		    wrongCounterField.setText(wrongCounter + "");
                   
                    if(wrongCounter == LIMIT) {
			getContentPane().setBackground(Color.darkGray);
	                gameOverLabel.setText("GAME OVER!");
			gameOverLabel.setVisible(true);
			restartButton.setVisible(true);
			exitButton.setVisible(true);
			rightCounterField.setVisible(false);
			wrongCounterField.setVisible(false);
			questionLabel1.setVisible(false);
			subTitle2Label1.setVisible(false);
			answerLabel1.setVisible(false);
			answerField.setVisible(false);
			answerField.setEditable(false);
			addButton.setVisible(false);
			divButton.setVisible(false);
			subButton.setVisible(false);
			mulButton.setVisible(false);
			remarksField.setVisible(false);
			answerField.setVisible(false);
			answerField.setEditable(false);
			
                    }
                    
            }
            
            
            
        }
      
    } 
    public String getCorrectResponse() {
        String response ="";
        rightCounter++;
		
	switch(random.nextInt(6)) {
	case 0: response = "Bravo kiddo!";break;
	case 1: response = "Excellente!";break;
	case 2: response = "Keep it up!";break;
	case 3: response = "Great!";break;
	case 4: response = "Well done!";break;
	case 5: response = "Pushing P!";break;
	}
		return response;
	}
	
    public String getWrongResponse() {
	String response ="";
	wrongCounter++;
	switch(random.nextInt(6)) {
            case 0: response = "Try again";break;
	    case 1: response = "Incorrect";break;
            case 2: response = "Give it another go!";break;
	    case 3: response = "Wrong!";break;
            case 4: response = "Keep trying!";break;
            case 5: response = "Try once more!";break;
      }
       return response;
	}	  
    public int getRandomNumber() {
		return random.nextInt(100);
	}
    public String setQuestion(String operator) {
	    digit1=getRandomNumber();
            digit2=getRandomNumber();
            
            switch(operator) {
	    case "x" :correctAnswer = digit1 * digit2; break;
	    case "+" :correctAnswer = digit1 + digit2; break;
	    case "-" :correctAnswer = digit1 - digit2; break;
            case "/" :
			
	        if(digit1==0) {
		    digit1++;
		    if(digit2==0) {
			digit2++;
			}
			else if(digit2==0)
			     digit2++;
				    		
		    correctAnswer = digit1 / digit2; 
		    break;
			}	
		
            }
            return "What is " + digit1 + operator + digit2 + " ? ";
           }
    
    
    
public static void main(String[] args) {
            // TODO Auto-generated method stub
            // MathQuiz mathQuiz = new MathQuiz();
           new MathQuiz();

	
}
}