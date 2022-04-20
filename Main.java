import java.util.*; 
import java.util.stream.Collectors; 
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Map.*;

class Words{
   public static List<String> words = Arrays.asList( 
                        "apple","application","alternative", "ball","banana","breach","calculate","cease","complete","determine","Report","Rat","Run","Visit",
                        "damaging", "difficulties","egypt","electricity","enclosing","us","united","use","Who","Water","Winter","Try","Gain","Quilling",
                        "filter","firearms","fish","garden","giant","golf","happen","harsh","hay","indicate","insect","invent", "Toy","Tank","Quality","Gun",
                        "jealous","jelly","jungle","kettle","kneel","knock","lazy","lion","loud","mammal","marsh","mature","Money","May","Meet","Key","Kill",
                        "narrow","nasty","naughty","obtain","obvious","occur","Pale","Panda","panther","Pig","pink","pioneer","Dictionary","Dad","Dirty","King",
                        "Knowledge","Leader","Layer","License","Newspaper","Noise","nervous","Ocean","official","Occupy","Epidemic","Hir","Hench","Clock","Cap",
                        "quartz","quiz","Quota","rabbit","raccoon","rampant","Satisfaction","Seem","Apple","Farid","Ahmed","Ali","Father","Fat","Cup","Grass",
                        "shark","shy","silly", "sneaky","Snow","solar","spider","spoon","stiff","tiger","tired","toy","Bag","Big","Best","Car","Cat","Count",
                        "unusual","vacuum","vanish","wander","wary","wet","x-ray","xerox","xylophone","yarn","yawn","yummy","zebra","zoo","zambia","Golf");
}

class Dictionary
{
    Map<Character,List<String>> createMap(List<String> words)
    {
        List<String> wordsLower = new ArrayList<>();
        for(String word : words)
        {
            wordsLower.add(word.toLowerCase());
        }
        Map<Character, List<String>> dict = wordsLower.stream()
        .collect(Collectors.groupingBy(w -> w.toLowerCase().charAt(0)));
        dict.forEach((k,v) -> Collections.sort(v)); //sorted value for evey key

        dict.entrySet().stream()
        .sorted(Comparator.comparing(Map.Entry::getKey));
        return dict;   
    }
    void displayDictionary(Map<Character,List<String>> dict)
    {
        dict.forEach((k,v)->System.out.println(" " + k + " ------>> " + v));
    }

    void displayWordsByKey(char key)
    {
        Map<Character, List<String>> dict = createMap(Words.words);
        System.out.println("words of character[ "+ key +" ] : " + dict.get(key));  
    }
}

public class Main{
   

	public static void main(String args[])
	{
		Dictionary dictionary = new Dictionary();
        Map<Character, List<String>> dict =dictionary.createMap(Words.words);
        System.out.println("Sorted Dictionary : ");
        dictionary.displayDictionary(dict);
        System.out.println("\n<<------------------------------->>");
        if(args.length == 1)
        {
            char key = args[0].toLowerCase().charAt(0);
            System.out.println("Display Words by Key : ");
            dictionary.displayWordsByKey(key);
        }
        else
        {
            System.out.println("there is no key!");
        }
           
           
	}

}