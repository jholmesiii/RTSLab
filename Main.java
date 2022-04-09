
import java.util.ArrayList;
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
public class Main {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList();
        RTS testRTS = new RTS();
        int[] testNumbers = {3,6,1,88,62,9,158,23,99,50,8,54,6,79,92,248,333,741,1337};
        
        for(int i : testNumbers){
            testList.add(i);
        }
        
        Map<String, Integer> finalTest = testRTS.aboveBelow(testList, 50);
        String rotation = testRTS.stringRotation("MyString", 49);
        
        System.out.println("Above/Below: "+finalTest);
        System.out.println("Rotated String: "+rotation);
    }
}
