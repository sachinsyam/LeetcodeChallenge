package May;

public class May31 {
    public static void main(String[] args) {
        String [] words = new String[]{"aba","aabb","abcd","bac","aabc"};
        int array [] = new int[words.length];
        int j = 0;

        for(String word : words){
            for (int i = 0; i < word.length() ; i++) {
                int ascii =  word.charAt(i);
                array[j] += ascii;
            }
            j++;
        }

        int high = 0, res = 0;
        for (int i = 0; i < array.length ; i++) {
            int count = 0;
            for (int k = i; k < array.length ; k++) {
                if(array[i] == array[j]){
                    count++;
                    if(count > high){
                        high = count;
                        res = i;
                    }
                }
            }
        }
        System.out.println("index"+res);
    }
}
