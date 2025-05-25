package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
               boolean hasLeftG = i>0 && str.charAt(i-1) == 'g';
               boolean hasRightG = i +1 < str.length() && str.charAt(i+1) == 'g';
                if(!hasRightG && !hasLeftG)
                {
                    return false;
                }
            }
        }

        return true;

    }
}
