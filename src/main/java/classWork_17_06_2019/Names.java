package classWork_17_06_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

//secondeName.substring(secondeName.length() - 6, secondeName.length())

class Names {

    static List<String> getNames() {
String line="qwertyuiopasdfghjklzxcvbnm";
        char[] k=line.toCharArray();
        String c = "";
        int b=0;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j <6 ; j++) {
              c=c+k[(int) (Math.random() * line.length())];
            }

            names.add("Number person  " + (i + 1) + " Last Name-" + c);
        c="";
        }
        return names;
    }
}
//    StringBuilder randString = new StringBuilder();
//    int count = (int)(Math.random()*30);
//        for(int i=0;i<count;i++)
//        randString.append(symbols.charAt((int)(Math.random()*symbols.length())));
//