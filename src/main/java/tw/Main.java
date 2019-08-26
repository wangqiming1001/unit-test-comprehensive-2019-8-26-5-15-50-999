package tw;


import java.util.List;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
    	
    	List<Integer> list = GuessInputCommand.random();
    	System.out.println(list);
        for (int i = 0; i < RUN_TIMES; i++) {
        	GuessInputCommand.answer();
        	String answer = GuessInputCommand.sameNumber();
        	System.out.println(answer);
        }
        System.out.println("游戏结束");
    }
}
