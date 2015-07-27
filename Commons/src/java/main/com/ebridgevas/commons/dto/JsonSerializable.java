package com.ebridgevas.commons.dto;

import com.google.gson.Gson;

import java.util.UUID;

public abstract class JsonSerializable
{
    public String toString()
    {
        return new Gson().toJson(this);
    }

    public String uuid()
    {
        return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
    }
}
