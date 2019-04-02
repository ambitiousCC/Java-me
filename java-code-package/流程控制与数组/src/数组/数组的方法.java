package 数组;

import java.util.Arrays;

public class 数组的方法 {
	private int[] items;
	private int size;
	
	public 数组的方法() {
		items = new int[100];
		size = 0;
	}
	
	/** 重新设置数组的方法 */
	private void resize(int capacity) {
		int[] a = new int[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}
	
	/**向数组中插入指定的元素*/
	public void addLast(int x)
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
	public int getLast() {
		return items[size - 1];
	}
	
	/**得到索引值对应的数组元素 */
	public int get(int i) {
		return items[i];
	}
	
	/**得到数组的长度*/
	public int size() {
		return size;
	}
	
	/** 删除数组最后的元素
	 * 并且返回被删除的元素 */
	public int removeLast() {
		int x = getLast();
		size = size - 1;
		return x;
	}
	public static void main(String[] args)
	{
		数组的方法 p = new 数组的方法();
		p.addLast(12);
		for(int i = 0; i < p.items.length; i++)
			System.out.println(p.items[i]);
	}
}
