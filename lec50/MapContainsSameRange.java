package lec50;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class MapContainsSameRange {
    public static boolean hasDuplicateMappings(Map<String, String> map)
    {
        if (map.size() <= 1) {
            return false;
        }

        Set<String> valuesSet = new HashSet<>();
//map.values() returns a list of values of the key-value pair, where V is the type of values stored in the map.
        for (String value : map.values()) {
            if (!valuesSet.add(value)) {
                return true;
            }
        }

        return false;
    }

}

