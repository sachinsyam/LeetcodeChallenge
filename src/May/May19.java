package May;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class May19 {
    public static void main(String[] args) {
        System.out.println(findDeck(new int[]{1,2,3,4,1,2,3,4}));

    }

    private static boolean findDeck(int[] deck) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < deck.length ; i++) {
            if(map.containsKey(deck[i])){
                map.put(deck[i],map.get(deck[i]) + 1);
            }else{
                map.put(deck[i], 1);
            }
        }
        boolean flag = true;
        int count = map.get(deck[0]);

        for(int key : map.keySet()){
            if(count != map.get(key)){
                flag = false;
                break;
            }
        }

        if(map.size()==1 && map.get(deck[0]) == 1){
            return false;
        }else{
            return flag;
        }

    }

}
