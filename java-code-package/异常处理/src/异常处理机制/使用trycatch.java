package 异常处理机制;

/*
 * 	格式：
 * 	try
 *  {
 *  	//业务实现代码
 *  }
 *  catch (Exception e)
 *  {
 *  	alert 输入不合法
 *  	goto retry
 *  }
 *  
 *	注：如果执行try块里面的业务逻辑代码时出现异常，系统自动生成一个异常对象，异常对象被提交给java运行时环境，过程
 *		被称为抛出异常，
 *		如果java运行时环境找不到捕获异常的catch块，则运行是环境终止，程序退出
 */
public class 使用trycatch {
	
}
