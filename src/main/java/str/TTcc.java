package str;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TTcc {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println("\u8BF7\u6C42\u6CA1\u6709\u6743\u9650");
		System.out.println(readFileByLines("C:\\Users\\IT_dp\\Desktop\\xx.json"));

	}
	public static String readFileByLines(String fileName) {  
        File file = new File(fileName);  
        BufferedReader reader = null;  
        String re = null;
        try {  
            System.out.println("以行为单位读取文件内容，一次读一整行：");  
            reader = new BufferedReader(new FileReader(file));  
            String tempString = null;  
            // 一次读入一行，直到读入null为文件结束  
            while ((tempString = reader.readLine()) != null) {  
                // 显示行号  
            	re = tempString;  
            }  
            reader.close();  
            return re;
            
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (reader != null) {  
                try {  
                    reader.close();  
                } catch (IOException e1) {  
                }  
            }  
        }
		return re;  
    }  

	public static int reverse(int x) {
		int sum = 0;
		int temp;
		int top =Integer.MAX_VALUE/10;
		int bottom =Integer.MIN_VALUE/10;
		while (Math.abs(x) > 0) {
			if(sum>top||sum<bottom){
				return 0;
			}
			sum = sum * 10;
			temp = x % 10;
			sum = sum + temp;
			x = x / 10;
		}
		return sum;
	}

}
