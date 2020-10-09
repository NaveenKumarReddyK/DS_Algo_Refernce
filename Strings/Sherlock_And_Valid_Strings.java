import java.util.*;
class Sherlock_And_Valid_Strings {
    public static String isValid(String s) {
        HashMap < Character, Integer > map = new HashMap < > ();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        HashMap < Integer, Integer > freq = new HashMap < > ();
        for (Map.Entry < Character, Integer > e: map.entrySet()) {
            if (freq.size() > 2) {
                return "NO";
            }
            freq.put((int) e.getValue(), freq.getOrDefault((int) e.getValue(), 0) + 1);
            // System.out.println(e.getKey() + " "+ e.getValue());
        }
        if (freq.size() == 1) {
            return "YES";
        } else if (freq.size() == 2) {
            List < Integer > fl = new ArrayList < > ();
            List < Integer > fv = new ArrayList < > ();
            for (Map.Entry < Integer, Integer > fm: freq.entrySet()) {
                fl.add((int) fm.getValue());
                fv.add((int) fm.getKey());
                System.out.println(fm.getKey() + " " + fm.getValue());
            }
            int fVal = fv.get(0);
            int fFreq = fl.get(0);
            int sVal = fv.get(1);
            int sFreq = fl.get(1);
            int diff = fVal - sVal;
            if ((fFreq == 1 && fVal == 1) || (sFreq == 1 && sVal == 1)) {
                return "YES";
            } else if (diff == 1) {
                if (fVal == 1 && fFreq == 1) {
                    return "YES";
                } else if (fFreq == 1 && fVal != 1) {
                    return "YES";
                } else {
                    return "NO";
                }
            } else if (diff == -1) {
                if (fVal == 1 && fFreq == 1) {
                    return "YES";
                } else if (sVal != 1 && sFreq == 1) {
                    return "YES";
                } else {
                    return "NO";
                }


            } else {
                return "NO";
            }

        }

        return "NO";

    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(isValid(s));
    }
}