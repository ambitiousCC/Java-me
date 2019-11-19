package henu.cs.cq.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Utils {
	/**
	 * 判断字符串是否相等的方法
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean judgeStr(String str1, String str2) {
		return str1.equals(str2);
	}
	
	/**
	 * 判断是否是字符的方法
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str) {
		return Character.isDigit(str.charAt(0));
	}
	
	
	/**
	 * 调用计算方法
	 * @param str
	 * @return
	 * @throws ScriptException
	 */
	public static Object calMethod(String str) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = engine.eval(str);
		return result;
	}
}
