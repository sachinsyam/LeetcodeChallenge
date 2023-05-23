package May;

import java.util.HashMap;
import java.util.Map;

public class May16 {
    public static void main(String[] args) {
        String words [] = new String[]{"bella","label","roller"};
        System.out.println(findLen(words).toString());

    }
    public static String[] findLen(String [] words){
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                Character ch = words[i].charAt(j);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }
        }
        String [] res = new String[words[0].length()];
        int n=0;
        for(Character c : map.keySet()){
            if(map.get(c) > 1){
                res[n] = Character.toString(c);
                n++;
            }
        }

        return res;

    }

}
