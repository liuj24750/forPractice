package 接口练习;

public interface Swim {

	public abstract void swim();
	
 }	
	//IOC 基础容器:spring两大核心之一,其他组件功能的基础,主要涉及bean产生和关系
	//AOP面向切面编程:spring两大核心之一,主要涉及切面配置,声明式事务控制
	
	/*
	 * Ajax:概念Asynchronous JavaScript And Xml,异步的JavaScript和XML 作用:
	 * 1.数据交换:通过Ajax可以给服务器发送请求,并获取服务器响应的数据
	 * 2.异步交互:可以在不重新加载整个页面的情况下,与服务器交换数据并更新部分网页的技术
	 * 如:搜索联想(例如在搜索java时会出现很多相应的提示,如:java面试题,java基础知识点等等,此时网页并没有进行任何刷新),
	 * 用户名是否可用的校验等等
	 */
	

	/*
	 * 同步和异步的区别:服务器端在进行逻辑处理的过程中,浏览器客户端是可以继续进行其他操作的,客户端不需要等待服务器端响应
	 * 原生Ajax的请求方式比较繁琐,在现在的实际开发中已经基本不用,现在项目里使用的基本是基于原生的Ajax封装起来的技术 例如Axios
	 */
	

//	Axios:对原生的Ajax进行了封装,简化书写,快速开发
//	1.引入Axios的js文件2.使用Axios发生请求,并获取响应结果
	

//	引入Axios的js文件
//	<script src="js/axios-0.18.0.js"></script>


//	使用Axios发生请求,并获取响应结果
//  function get(){
//通过axios发送异步请求-get
//	axios({
//		method:"get",
//		url:"http://yapi.smart-xwork.cn/mock/169327/emp/list"
//	}).then((result)=>{
//		console.log(result.data);//成功回调函数
//	})
// }

//funtion post(){
//通过axios发送异步请求-post
//	axios{(
//			method:"post",
//			url:"http://yapi.smart-xwork.cn/mock/169327/emp/deleteBylp",
//			data:"id=1"
//	}).then((result)=>{
//		console.log(result.data);//成功回调函数
//	});
//  }

	/*
	 * Axios:请求方式别名 
	 * axios.get(url[,config])
	 * axios.delete(url[,config])
	 * axios.post(url[,data[,config]])
	 * axios.put(url[,data[,config]])
	 */

//发送GET请求
	/*
	 * axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list").then((result)=>{
	 * console.log(result.data); });
	*/
//发送POST请求
	/*
	 * axios.post("http://yapi.smart-xwork.cn/mock/169327/emp/deleteByld","id=1").
	 * then((result)=>{ console.log(result.data); });
	 */


	/*
	 * JSON-介绍 概念:javascript object notation,javascript对象标记法
	 * json是通过javascript对象标记法书写的文本
	 */
//      json里面是所有的key必须用" "引起来
//      本质上就是一个字符串
//      由于其语法简单,层次结构鲜明,现多用于作为数据载体,在网络中进行数据传输

//      曾经xml作为数据载体传递数据,但是太过于臃肿,标签一大堆
//       json-基础语法
//       定义:var 变量名='{"key1":value1,"key2":value2}';