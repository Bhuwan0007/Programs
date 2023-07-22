package com.test.immutable;

public class Test {
    public static void main(String[] args) {
        /*Map<String,Integer> map = new HashMap<>();
        map.put("Bhuwan",11);
        map.put("Ram",12);
        map.put("Vinod",13);

        Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) map.entrySet();

        //Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) map.entrySet();
        Iterator<String> itr = map.keySet().iterator();

        for (Iterator<String> it = itr; it.hasNext(); ) {
            System.out.println("loop 1");
            String s = it.next();
            //System.out.println(s);
            it.remove();
        }
*/
        String name = "Bhuwan";
        char[] ch = name.toCharArray();

        for(int i=name.length()-1; i>=0; i--){
            System.out.println(ch[i]);
        }

        /*for (Iterator<String> it = itr; it.hasNext(); ) {
            System.out.println("loop 2");
            String s = it.next();
            System.out.println(s);
        }*/
    }
}
