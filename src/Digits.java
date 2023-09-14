import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        if (num < 0)
            throw new IllegalArgumentException("The number passed to the constructor ("+num+") cannot be negative!");
        digitList = new ArrayList<>();
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++){
          digitList.add(Character.getNumericValue(str.charAt(i)));
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitList.size() - 1; i++){
            if (!(digitList.get(i) < digitList.get(i+1)))
                return false;
        }
        return true;

    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }
}
