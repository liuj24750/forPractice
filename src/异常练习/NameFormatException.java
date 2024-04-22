package 异常练习;

public class NameFormatException extends RuntimeException{
	
	//运行时:RuntimeException  核心 就表示由于参数错误而导致的问题
	//编译时:Exception  核心 提醒程序员检查本地信息
	
	public NameFormatException() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public NameFormatException(String message) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(message);
	}
	

}
