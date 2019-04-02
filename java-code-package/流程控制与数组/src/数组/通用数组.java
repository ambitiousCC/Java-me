package 数组;

//通用：
				//Glorp
public class 通用数组<Item> {//不只是保留整数
	private Item[] items;
	private int size;
	
	public 通用数组() {
		items = (Item[]) new Object[100];
		size = 0;
	}
	
	/** 重新设置数组的方法 */
	private void resize(int capacity) {
		Item[] a = (Item[]) new Object[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}
	
	/**向数组中插入指定的元素*/
	public void addLast(Item x)
	{
		if(size == items.length) {
			//resize(size + RFACTOR)
			//resize(size * RFACTOR)显然这个乘法公式可以大大提高运行速度
			resize(size + 1);//调整因子最好不要用加法
		}
		items[size] = x;
		size += 1;
	}
	
	/** 返回最后的元素与		 */
	public Item getLast() {
		return items[size - 1];
	}
	
	/**得到索引值对应的数组元素 */
	public Item get(int i) {
		return items[i];
	}
	
	/**得到数组的长度*/
	public int size() {
		return size;
	}
	
	/** 删除数组最后的元素
	 * 并且返回被删除的元素 */
	public Item removeLast() {
		Item x = getLast();
		size = size - 1;
		return x;
	}
	
	
}
