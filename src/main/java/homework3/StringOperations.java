package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperations {

    private String string = "asfa[ofsa[ofba[ofbaosfab[f";
    private int startIndex = 2;
    private int endIndex = 9;
    private String target = "[";
    private String replacement = "";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String cutOpeningBracket(){
        string = string.replace(target, replacement);
        return string;
    }

    private void setIndexes(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Add start and end indexes of reversing part.");
            startIndex = Integer.parseInt(reader.readLine().trim());
            endIndex = Integer.parseInt(reader.readLine().trim());

            if (startIndex < 0 || endIndex < 0 || endIndex < startIndex){
                System.out.println("Numbers should be positive or zero. Start index should be less than end index. Please, try again!");
                setIndexes();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.getMessage();
            System.err.println("Error. It's totally not an integer. Please, try again!");
            setIndexes();
        }
    }

    public String getAndReverseSymbols(){
        char[] charString = string.toCharArray();
        for(int i = 0; i <= (endIndex - startIndex) >> 1; i++){
            char c = charString[i + startIndex];
            charString[i + startIndex] = charString[endIndex - i];
            charString[endIndex - i] = c;
        }
        return String.valueOf(charString);
    }
}
