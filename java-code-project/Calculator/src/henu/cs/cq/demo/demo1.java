package henu.cs.cq.demo;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class demo1 extends JFrame {
	public demo1(){
		super("name");
		this.setBounds(100,100,230,320);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		//添加菜单		
		JMenu menu_function=new JMenu("查看");
		JMenu menu_edit=new JMenu("编辑");
		JMenu menu_help=new JMenu("帮助");
		menubar.add(menu_function);	
		menubar.add(menu_edit);
		menubar.add(menu_help);
		// 查看的菜单项
		JMenuItem fuc1=new JMenuItem("标准型");
		
		//编辑的菜单项
		JMenuItem edit1 = new JMenuItem("复制");
		JMenuItem edit2 = new JMenuItem("粘粘");
		JMenuItem edit3 = new JMenuItem("历史记录");
		
		//帮助的菜单项
		JMenuItem help1 = new JMenuItem("查看帮助");
		JMenuItem help2 = new JMenuItem("关于历史记录");
		
		
		menu_function.add(fuc1);
		menu_edit.add(edit1);
		menu_edit.add(edit2);
		menu_edit.addSeparator();
		menu_edit.add(edit3);
		menu_help.add(help1);
		menu_help.addSeparator();
		menu_help.add(help2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new demo1();
	}
}
