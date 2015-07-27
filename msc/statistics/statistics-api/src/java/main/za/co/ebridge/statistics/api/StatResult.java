package za.co.ebridge.statistics.api;

import javolution.util.FastMap;

public interface StatResult
{

    long getLongValue();

    FastMap<String, LongValue> getStringLongValue();

}
