import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.junit.Test;

import java.util.List;

public class TEST {
	@Test
	public void test() {
		
		//使用代理IP地址:有点不稳定撒
		//HttpHost proxy = new HttpHost("111.177.161.89",9999);
		
		//选择目标网址和设置时间
		HttpGet httpGet = new HttpGet("http://sports.sina.com.cn/");
		httpGet.setConfig(RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build());
		
		//模拟浏览器
		//httpGet.setHeader("User-Agent",
        //        "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");

		//创建实例
		CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
		
		//初始化响应
        String responseStr = "";
        //异常处理们
        try {
        	httpClient = HttpClientBuilder.create().build();
        	//内容
        	HttpClientContext context = HttpClientContext.create();
        	//
        	response = httpClient.execute(httpGet,context);
        	//获取响应状态
        	int state = response.getStatusLine().getStatusCode();
        	if (state != 200)
        		responseStr = "";
        	
        	
        	//执行GET
        	HttpEntity entity = response.getEntity();
        	if(entity != null)
        		responseStr = EntityUtils.toString(entity, "utf-8");
        		//注意有的网站不是utf-8字符集,返回实体
        	
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	try {
        		if(response != null)
        			response.close();//结束
        		if(httpClient != null)
        			httpClient.close();
        	} catch (Exception ex) {
        		ex.printStackTrace();
        	}
        }
        
        if(responseStr != null)
        	return;
        
 
/*处理获取的数据信息============================================================================*/
        Document document = Jsoup.parse(responseStr);
        
        //处理信息第一步：找指定标签内容：需要指定
        List<Element> elements = document.getElementsByAttributeValue("class", "ty-card-tt");
		
        elements.forEach(element -> {
        	//输出所有匹配节点信息
        	for(Element e : element.getElementsByTag("a")) {
        		//在控制台输出内容
                System.out.print(e.text() + "(网址): ");
                System.out.println(e.attr("href"));
        	}
        });
	}
}
