package zipcode;

import org.junit.rules.ExpectedException;

public class Hamming {
    private String s;
    private String s1;

    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (s.length() != s1.length()) {  // If strings are not equal
            // Throw exception
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance(){
        // Declare variables and place into char array
        int hammingDistance = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c != s1.toCharArray()[count]) {
                hammingDistance++;
            }
            count++;
        }
        return hammingDistance;
    }

}
