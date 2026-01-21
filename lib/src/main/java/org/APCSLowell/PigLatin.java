package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        for(int i = 0; i<sWord.length(); i++){
            char charac = sWord.charAt(i);
            if(charac=='a' || charac=='e' || charac=='i' || charac=='o' || charac=='u')
                return i;
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        if(findFirstVowel(sWord)==-1){return sWord + "ay";}
        if(findFirstVowel(sWord)==0){return sWord + "way";}
        if(sWord.substring(0,2).equals("qu")){return sWord.substring(2)+"quay";}
        if(findFirstVowel(sWord)>=1){return sWord.substring(findFirstVowel(sWord))+sWord.substring(0,findFirstVowel(sWord))+"ay";}
        
        return null;
    }
}
