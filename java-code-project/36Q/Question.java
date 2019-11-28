package henu.cs.cq.test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Question extends JFrame implements ActionListener,Runnable {

	JLabel label;
	JButton btn1,btn2;
	Thread th;
	boolean flag = false;
	
	String[] qs = {
			"假如可以选择世界上任何人，你希望邀请谁共进晚餐？",
			"你希望成名吗？在哪一方面？", 
			"拨打电话前，你会先练习要说的话吗？为什么？",
			"对你来说，怎样才算是“完美”的一天？",
			"上一次唱歌给自己听是什么时候？唱歌给别人听又是什么时候呢？",
			"假如你能够活到90岁，并且你可以选择让你的心智或身体在后60年一直停留在30岁，你会选择哪一个？",
			"关于未来你可能怎么死，你有自己的秘密预感吗？", 
			"列举3个你和对方共同拥有的特质。",
			"你的人生中最感恩的事情是什么？", 
			"假如可以改变你成长过程中的任何事，你希望有哪些改变？", 
			"用4分钟的时间，尽可能详细地向对方讲述你的人生故事。", 
			"假如明天早上起床后能获得任何一种能力或特质，你希望是什么？", 
			"假如有颗水晶球能告诉你关于自己、人生或未来的一切真相，你想知道什么？",
			"有什么事想做很久了？还没去做的原因是？",
			"你人生最大的成就是什么？",
			"友情中你最重视哪一个部份？", 
			"你最珍贵的回忆是什么？",
			"你最糟糕的回忆是什么？", 
			"如果你知道自己将在一年内突然死去，你会改变自己目前的生活方式吗？为什么？", 
			"友情对你而言意味着什么？",
			"爱和感情在你生命里扮演什么样的角色？", 
			"轮流分享你认为对方拥有的比较好的性格特点。各自提5点。", 
			"你的家庭关系亲密温暖吗？你是否觉得自己的童年比大部分人快乐？", 
			"你与母亲的关系如何？",
			"说出3个含有“我们”并且符合实际情况的句子，比如“我们现在都在这个房间里”。", 
			"完成这个句子：“我希望可以跟某个人分享——”。",
			"如果你要成为对方的密友，有什么事是他或她需要知道的？", 
			"告诉对方你喜欢他或她的什么地方（回答此题必须非常诚实，要说出你可能不会对刚认识的人说的事）。", 
			"和对方分享你人生中尴尬的时刻。",
			"上次在别人面前哭是什么时候？自己哭又是什么时候？", 
			"告诉对方，你现在喜欢他或她什么地方。",
			"有什么事是绝对不能开玩笑的？",
			"如果你今天晚上就会死掉，而且无法与任何人联系，你最遗憾还没有告诉别人什么事？为什么还没说呢？",
			"你的房子起火了，你所有的东西都在里面。在救出所爱的人和宠物后，你还有时间可以安全地抢救出最后一件东西。你会拿什么？为什么？", 
			"在你所有家人当中，谁的死对你的打击会最大？为什么？",
			"分享你人生中的一个问题，问对方遇到这样的问题会怎么做。同时也请对方告诉你，在他或她看来，你对这个问题的感受是什么。"};
	
	public Question(){
		super("随机数");
		this.setSize(450, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		th = new Thread(this);

		label = new JLabel("随机数", SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 30));
		btn1 = new JButton("开始");
		btn2 = new JButton("停止");
		this.add(btn1, BorderLayout.NORTH);
		this.add(btn2, BorderLayout.SOUTH);
		this.add(label, BorderLayout.CENTER);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		this.setVisible(true);
		btn2.setVisible(false);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Question();
	}

	@Override
	public void run() {
		while(flag) {
			Random r = new Random();
			int ran = r.nextInt(qs.length);

			StringBuffer stringBuffer = new StringBuffer(qs[ran]);
			int times = 0;
			for(int i=0;i<qs[ran].length();i++) {
				String s = qs[ran].charAt(i)+"";
				if(s.equals("，")||s.equals("？")||s.equals("：")||s.equals("。")) {
					stringBuffer.insert((i+1+"<br>".length()*times),"<br>");
					times++;
				} else if (s.equals("（")) {
					stringBuffer.insert((i+"<br>".length()*times),"<br>");
					times++;
				}
			}
			times = 0;
			String txt = "<html><body>"+stringBuffer+"</body></html>";
			label.setText(txt);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			th = new Thread(this);
			flag = true;
			th.start();
			btn1.setVisible(false);
			btn2.setVisible(true);
		} else if (e.getSource()==btn2) {
			flag = false;
			btn1.setVisible(true);
			btn2.setVisible(false);
		}
	}	
}
