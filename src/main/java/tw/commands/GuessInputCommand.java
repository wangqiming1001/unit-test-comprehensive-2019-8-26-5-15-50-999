package tw.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by jxzhong on 2017/5/19.
 */
public class GuessInputCommand {

    private BufferedReader bufferedReader;
    private static List<Integer> list = new ArrayList<Integer>();
    private static List<String> answer = new ArrayList<String>();
    

    public GuessInputCommand() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() throws IOException {
        System.out.println("------Please input your answer as 1234 , x <10 ------");
        return bufferedReader.readLine();
    }
    
    //生成4个随机数放入list
    public static List<Integer> random() {
    	//生成答案 如：1234
        for(int i=0;i<4;i++){
            int random = new Random().nextInt(10);
            list.add(random);
        }
        return list;
	}
    
    //输入的字符串变为数组
    public static List<String> answer() throws IOException {
    	 String input = new GuessInputCommand().input();
    	 List<String> answer = Arrays.asList(input.split(""));
    	 return answer;
	}
    
    //02 统计相同数字(包括位置)
    public static String sameNumber() {
    	int countA = 0;
    	int countB = 0;
    	for (int i = 0; i < answer.size(); i++) {
    		for (int j = 0; j < list.size(); j++) {
    			System.out.println(Integer.parseInt(answer.get(i)));
    			if (Integer.parseInt(answer.get(i)) == list.get(j)) {
    				countB++;
    				if (i == j) {
    					countA++;
					}
    			}
    		}
		
    	}
    	String buffer = countA+"A"+countB+"B";
    	return buffer;
	}
    
    
    
}
