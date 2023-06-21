package May;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class June19 {
    public static void main(String[] args) {

        String s = "abbaca";
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==c) stack.pop();
            else stack.push(c);
        }


        StringBuilder t= new StringBuilder();
        while(!stack.isEmpty()){
            t.append(stack.pop());

        }

        String str=  t.reverse().toString();

        System.out.println(str);
    }


    }

