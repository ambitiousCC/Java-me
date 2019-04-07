package 操作集合的工具类Collections;

import java.util.*;

//介绍这个游戏：

public class 梭哈游戏 {
	
	//定义全局变量
	//支持最多支持多少个玩家
	private final int PLAY_NUM = 5;
	//定义扑克牌的所有花色和数值
	private String[] types = {"方块", "草花", "红心", "黑桃"};
	private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10"
			, "J", "Q", "K", "A"};
	//一局游戏以后的剩余
	private List<String> cards = new LinkedList<String>();					//list集合
	//定义所有玩家
	private String[] players = new String[PLAY_NUM];
	//所有玩家手上的扑克牌
	private List<String>[] playersCards = new List[PLAY_NUM];				//list集合
	
	/**
	 *  	初始化扑克牌，放入52张扑克牌
	 *  	使用shuffle方法按照随机顺序排序
	 */
	public void initCards()
	{
		for(int i = 0; i < types.length; i++)
		{
			for(int j = 0; j < values.length; j++)
			{
				cards.add(types[i] + values[j]);							//list集合
			}
		}
		//随机排列
		Collections.shuffle(cards);											//collections方法
	}
	
	//初始玩家，为每个玩家分配用户名
	public void initPlayer(String... names)
	{
		if(names.length > PLAY_NUM || names.length < 2)
		{
			//检验玩家数量，此处使用异常机制
			System.out.println("玩家数量不对");
			return ;
		}
		else
		{
			//初始化玩家用户名
			for(int i = 0; i < names.length ; i++)
			{
				players[i] = names[i];
			}
		}
	}
	/**
	 * 	初始化玩家手上的扑克牌，开始游戏时每个玩家手上的扑克牌为空
	 * 	程序使用一个长度为0的LinkedList来表示
	 */
	public void initPlayerCards()
	{
		for(int i = 0; i < players.length; i++)
		{
			if(players[i] != null && !players[i].equals(""))
			{
				playersCards[i] = new LinkedList<String>();
			}
		}
	}
	/**
	 * 	输出全部扑克牌，该方法没有实际作用，仅仅用作测试
	 */
	public void showAllCards()
	{
		for(String card : cards)
		{
			System.out.println(card);
		}
	}
	/**
	 * 	派扑克牌
	 * 	@param first 最先派给谁
	 */
	//获取指定字符串在数组中的索引值
	public static int getIndex(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;//如果未找到返回-1
    }
	public void deliverCard(String first)
	{
		//调用ArrayUtils 工具类的search方法
		//查询出指定元素在数组中的索引
		int firstPos = getIndex(players, first);
		//先给玩家之后的人发牌(实际上是模拟了一轮洗牌的过程)
		for(int i = firstPos; i < PLAY_NUM; i++)
		{
			if(players[i] != null)
			{
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			//清奇的思路：增加第一张牌，然后去掉，下一张变成第一张牌
			}
		}
		//依次给位于该指定玩家之前的每个玩家发扑克牌
		for(int i = 0; i < firstPos; i++)
		{
			if(players[i] != null)
			{
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
	}
	/**
	 * 	输出玩家手上的扑克牌
	 * 	实现该方法时，应该控制每个玩家看不到别人的第一张牌，但是此时没有增加该功能
	 */
	public void showPlayerCards()
	{
		for(int i = 0; i < PLAY_NUM; i++)
		{
			//玩家不是空
			if(players[i] != null)
			{
				//输出玩家
				System.out.print(players[i] + " : ");
				//遍历输出玩家手上的扑克牌
				for(String card : playersCards[i])
				{
					System.out.print(card + "\t");
				}
			}
			System.out.println();
		}
	}
	
	//入口
	public static void main(String[] args)
	{
		梭哈游戏 sh = new 梭哈游戏();
		sh.initPlayer("崔秦大boy", "电脑玩家");
		sh.initCards();
		sh.initPlayerCards();
		//测试扑克牌
		sh.showAllCards();
		System.out.println("======link start=======");
		//从爸爸开始派牌
		sh.deliverCard("崔秦大boy");
		sh.showPlayerCards();
		/*
		 * 	牌面最大的玩家下注
		 * 	其他玩家是否跟注
		 * 	游戏是否只剩一个玩家？如果是，他win
		 * 	如果已经是最后一张牌，需要比较剩下的牌面大小
		 * 
		 * 	搞不懂这个游戏规则，所以我想我不想浪费时间在上面
		 */
		//从电脑玩家开始派牌
		sh.deliverCard("电脑玩家");
		sh.showPlayerCards();
	}
}

