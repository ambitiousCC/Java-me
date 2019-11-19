package henu.cs.cq.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class demo2 extends JFrame implements ActionListener{
	JTextArea text;  // 组合
	JButton btn_ok;
	JTextField text_name;
	JRadioButton rb[];
	JCheckBox cb[];
	String str="";

	public demo2() {
		super("按钮组件示例");
		String[] sex={"male","female"};//用于生成一组单选按钮上的文字
		String[] hobbies={"sport","music"};	//用于生成多个复选框上的文字
		this.setBounds(100,100,300,180);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		text=new JTextArea(5,10);
		text.setEditable(false);
		this. add(text,"North");
		JPanel panel=new JPanel(new FlowLayout());//效果图中右半部分的布局
		this. add(panel);
		panel.add(new JLabel("name:"));
		text_name=new JTextField(12);
		panel.add(text_name);
		panel.add(new JLabel("sex:"));
		
		//用循环语句产生多个单选按钮，将其加入同一个按钮组，并添加到面板中
		ButtonGroup bg=new ButtonGroup();
		rb=new JRadioButton[sex.length];//一个数组的长度作为另一个数组的长度
		for (int i=0;i<sex.length;i++){//用字符串数组生成单选按钮数组
			rb[i]=new JRadioButton(sex[i]);	
			bg.add(rb[i]);//数组元素作为方法的参数
			panel.add(rb[i]);
		}
		
		//用循环语句产生多个复选框，并添加到面板中
		panel.add(new JLabel("hobbies:"));
		cb=new JCheckBox[hobbies.length];
		for (int i=0;i<hobbies.length;i++){
			cb[i]=new JCheckBox(hobbies[i]);
			panel.add(cb[i]);
		}
		btn_ok=new JButton("ok");
		btn_ok.addActionListener(this);
		panel.add(btn_ok);		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_ok){
			str+=" name:\n"+text_name.getText()+"\n sex: \n";
			for (int i=0;i<rb.length;i++)
			    if (rb[i].isSelected())    str+=rb[i].getText(); //查看各单选按钮的选中状态
			str+="\n hobbies: ";
			for(int i=0;i<cb.length;i++)
			    if (cb[i].isSelected()) str+="\n"+cb[i].getText();
			text.append(str);
			}			
		}		
	
	public static void main(String[] args) {
		new demo2();
	}
}