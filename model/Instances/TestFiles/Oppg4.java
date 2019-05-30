/*
 * How many times is variable i printed out when the variable 
 * increases up to 10? //{editText, sourceRegion: "10", replacement: $random1}
 */

public class Oppg4 {

    public static void main(String[] args) {
        // {$random1 = random(10, 20)}
        // {$random2 = random(3, 5)}
        for(int i=0; i<10; i+=2){ // {editText, sourceRegion: "i<10", replacement: "i<"+$random1}
            if(i%3 == 0){ // {editText, sourceRegion: "3", replacement: $random2}
                System.out.println(i);
            }
        }

    }

}