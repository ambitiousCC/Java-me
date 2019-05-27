import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class 从文件中随机读取字符串 {
	//创建list集合
    List<String> list = new ArrayList<String>();
    

    public void run() {
    	从文件中随机读取字符串 content = new 从文件中随机读取字符串();
        content.initList("HangmanLexicon.txt");
        String a = content.getString();
        String txt = a.replaceAll("[^a-zA-Z]", "");//去掉所有tab键和空格和回车符
        System.out.println(txt);
        System.out.print(txt.length());
    }
    
    //随机行数的随机数
    public int getRandomNumber(int total) {
        return (int) (Math.random() * total);
    }
    
    //按行读取文件内容
    public void initList(String fileName) {
    	//异常处理
        try 
        {														//只读
            RandomAccessFile accessFile = new RandomAccessFile(fileName, "r");
            String str = "";
            while (null != (str = accessFile.readLine()))
            {
            	
                list.add(str);
            }
            accessFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //随机行数字符串
    public String getString() {
        if (null != list)
        {
            int line = getRandomNumber(list.size());
            return list.get(line);
        }
        
        return null;
    }
}