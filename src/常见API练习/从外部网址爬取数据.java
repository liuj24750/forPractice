package 常见API练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//扩展需求:
//把链接https://zhidao.baidu.com
//中所有的"百度XX"都爬出来
public class 从外部网址爬取数据 {
	public static void main(String []args) throws IOException {
		//创建一个URL对象
		URL url = new URL("https://zhidao.baidu.com/");
		//连接上这个网址
		//细节:保证网络是畅通的
		URLConnection conn = url.openConnection();
		//创建一个对象去读取网络中的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		//获取正则表达式的对象 pattern
		String regex = "百度\\W{0,100}";
		Pattern pattern = Pattern.compile(regex);
		//在读取的时候每次读一整行
		while((line = br.readLine())!=null) {
			
			//System.out.println(line);
			
			//拿着文本匹配器的对象matcher按照pattern的规则去读取当前的这一行信息
			Matcher matcher = pattern.matcher(line);
			while(matcher.find()) {
				System.out.println(matcher.group());
			}
		}
		br.close();
	}
}
