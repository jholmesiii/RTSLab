
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jholm
 */
public class RTS {
    
    public Map<String, Integer> aboveBelow(List<Integer> listOfNumbers, int comparison){
        Map <String, Integer> aboveBelow = new HashMap<>();
        int above = 0;
        int below = 0;
        
        for(int i : listOfNumbers){
            if(i > comparison){
                above++;
            }else if(i < comparison){
                below++;
            }
            
            //The instructions do not say what to do if the numbers are equal
            //Therefore, I will just ignore them
            
        }
        
        aboveBelow.put("Above", above);
        aboveBelow.put("Below", below);
        
        return aboveBelow;
    }
    
    public String stringRotation(String origString, int rotation){
        
        char[] rotatedString = origString.toCharArray();
        int length = rotatedString.length;
        String frontString = new String();
        String middleString = new String();
        String backString = new String();
        
        if(rotation > length){
            rotation = rotation % length;
        }
        
        int backInt = length - rotation;
        
        //There are 3 sections to move. 
        //The 1st N characters to shift
        //The last N characters to move to the front
        //And the middle characters if the string is long enough
        
        for (int i = 0; i < length; i++) {
            //Grabbing the first N characters, assigning to a string
            if(i < rotation){
                frontString += rotatedString[i];
            }
            
            //Grabbing those middle characters
            if(i >= rotation && i < backInt){
                middleString += rotatedString[i];
            }
            
            //Finally, grabbing the last N characters
            if(i >= (length-backInt) && i >= backInt){
                backString += rotatedString[i];
            }
        }
        
        //And now, rotate the order
        return backString+frontString+middleString;
        
    }
}
