package DymasticProxy;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoCGLib {
	 public static void main(String[] args) {  
//		  CglibProxy proxy = new CglibProxy();
//		  //通过生成子类的方式创建代理类
//		  SayHello proxyImp = (SayHello)proxy.getProxy(SayHello.class);
//		  proxyImp.say();

		 Pattern pattern =Pattern.compile("v");
		 Stream<String> s = pattern.splitAsStream("sssssvsssssssssssssvsssbbbbbbbvbbbbbvbbbb");
		 List<String> collect = s.collect(Collectors.toList());
		 for(String ss :collect){
		 	System.err.println(ss);
		 }
	 }
}
