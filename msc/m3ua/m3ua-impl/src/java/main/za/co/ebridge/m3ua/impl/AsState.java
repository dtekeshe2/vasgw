package za.co.ebridge.m3ua.impl;

import za.co.ebridge.m3ua.api.State;

public enum AsState implements State
{
    DOWN("DOWN"),
    INACTIVE("INACTIVE"),
    ACTIVE("ACTIVE"),
    PENDING("PENDING");

    private String name;

    private AsState(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public static AsState getState(String name)
    {
        if (name.equals(DOWN.getName()))
        {
            return DOWN;
        }
        else if (name.equals(INACTIVE.getName()))
        {
            return INACTIVE;
        }
        else if (name.equals(ACTIVE.getName()))
        {
            return ACTIVE;
        }
        else if (name.equals(PENDING.getName()))
        {
            return PENDING;
        }

        return null;
    }
}
