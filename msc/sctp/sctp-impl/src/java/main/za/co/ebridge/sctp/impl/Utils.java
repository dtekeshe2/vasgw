package za.co.ebridge.sctp.impl;

import java.util.ArrayList;
import java.util.List;

public class Utils
{

    public static <T> List<T> cloneList(List<T> input)
    {

        List<T> clone = new ArrayList<T>();
        for (T item : input)
        {
            clone.add(item);
        }
        return clone;
    }
}
