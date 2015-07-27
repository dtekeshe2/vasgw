package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.Category;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class CategoryImpl
        extends OctetStringLength1Base
        implements Category
{

    /**
     * Category CCITTT Rec Q.767
     */
    public static final int catOrdinary = 0; // ordinary-calling-subscriber

    public CategoryImpl()
    {
        super("Category");
    }

    public CategoryImpl(int data)
    {
        super("Category", data);
    }

    public int getData()
    {
        return data;
    }
}
