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
        for (int i = 0; i < RUN_TIMES; i++) {
        	List<String> answer = GuessInputCommand.answer();
        	GuessInputCommand.sameNumber(answer,list);
        }
        System.out.println("游戏结束");
    }
}
