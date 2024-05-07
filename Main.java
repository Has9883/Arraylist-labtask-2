import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        Text t=new Text();
        ArrayList<Text>  texts=new ArrayList<Text>();
        texts.add(t);





    //splitting on the bases of words ,sentence sand charcters
        System.out.println("............Seperting the words...........");
        System.out.println(Arrays.toString(t.text.split(" ")));
        System.out.println("............Seperting the Sentences...........");
        System.out.println(Arrays.toString(t.text.split("//.")));
        System.out.println("............Seperting the charcters...........");
        System.out.println(Arrays.toString(t.text.split("")));

        //TOTAL WORds
        String[] words = t.text.split(" ");

        System.out.println("Total words: " + words.length);

        //TOTAL SENTENCES
        String[] sentence = t.text.split("\\.");
        System.out.println("Total sentence: " + sentence.length);

        //TOTAL CHARACTERS
        String[] Totalchar = t.text.split("");
        System.out.println("Total Totalcharacters: " + Totalchar.length);


























    }
}