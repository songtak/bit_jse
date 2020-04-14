package com.jse.grade;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javafx.event.ActionEvent;
                                    //상속                      //
public class GradeView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,koreanLabel,englishLabel,
                    mathLabel,javaLabel; 
    private JTextField nameText, koreanText, englishText, mathText,
    					javaText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton; 
    public GradeService gradeService;
    public void open(){ 
        gradeService = new GradeServiceImpl();
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        koreanLabel = new JLabel("Userid"); 
        koreanLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        koreanLabel.setSize(100, 20); 
        koreanLabel.setLocation(100, 150); 
        container.add(koreanLabel); 
  
        koreanText = new JTextField(); 
        koreanText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        koreanText.setSize(150, 20); 
        koreanText.setLocation(200, 150); 
        container.add(koreanText); 
  
        englishLabel = new JLabel("english"); 
        englishLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        englishLabel.setSize(100, 20); 
        englishLabel.setLocation(100, 200); 
        container.add(englishLabel); 
        
        englishText = new JTextField(); 
        englishText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        englishText.setSize(150, 20); 
        englishText.setLocation(200, 200); 
        container.add(englishText);
  
        mathLabel = new JLabel("SSN"); 
        mathLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mathLabel.setSize(100, 20); 
        mathLabel.setLocation(100, 250); 
        container.add(mathLabel); 
        
        mathText = new JTextField(); 
        mathText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        mathText.setSize(150, 20); 
        mathText.setLocation(200, 250); 
        container.add(mathText);
  
        javaLabel = new JLabel("Address"); 
        javaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        javaLabel.setSize(100, 20); 
        javaLabel.setLocation(100, 300); 
        container.add(javaLabel); 
        
        javaText = new JTextField(); 
        javaText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        javaText.setSize(150, 20); 
        javaText.setLocation(200, 300); 
        container.add(javaText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 450); 
        submitButton.addActionListener(this);
        container.add(submitButton); 
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(270, 450); 
        container.add(listButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    } 

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		if(e.getSource() == submitButton) {   	
			JOptionPane.showMessageDialog(this, "전송 클릭");
			nameText.setText("홍길동,유관순,이순신,신사임당,이도");
			koreanText.setText("80,90,70,60,50");
			englishText.setText("80,90,70,60,50");
			mathText.setText("80,90,70,60,50");
			javaText.setText("80,90,70,60,50");
			String[] names = nameText.getText().split(",");
			String[] koreans = koreanText.getText().split(",");
			String[] englishs = englishText.getText().split(",");
			String[] maths = mathText.getText().split(",");
			String[] javas = javaText.getText().split(",");
			
			Grade[] grades = new Grade[5];
			for(int i=0; i<grades.length; i++) {
				grades[i] = new Grade();
				grades[i].setName(names[i]);
				grades[i].setKorean(Integer.parseInt(koreans[i]));  //*casting(형변환)
				grades[i].setEnglish(Integer.parseInt(englishs[i]));
				grades[i].setMath(Integer.parseInt(maths[i]));
				grades[i].setJava(Integer.parseInt(javas[i]));
				gradeService.add(grades[i]); //서버에 보내는 것
			}
		}else if(e.getSource() ==  listButton) {
			JOptionPane.showMessageDialog(this, "목록 클릭");
			Grade[] grades = gradeService.getGrades();
            String result = "";
            for(int i=0; i<grades.length; i++) {
            	result += grades[i]+"\n";
            }
			nameText.setText(""); //nameText.setText("null");을 주는건 주소를 널값주는 것
			koreanText.setText("");
			englishText.setText("");
			mathText.setText("");
			javaText.setText("");
            resultText.setText(result);
		
			
		}

	}
    
}