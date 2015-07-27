package com.ebridge.commons.dto;

import com.ebridgevas.commons.dto.PayloadDTO;
import com.google.gson.Gson;

public class PayloadDTOTest
{
    public static void main(String[] args)
    {
        String json = "{eanCode:60296110014,parentEanCode:60296110011,serviceEndPoint:27721418290,eanDescription:10MB Data Bundle,eanShortDescription:4.8 MB Data Bundle,itemPrice:0.50,quantity:4.80,rate:0.108,debitAmount:0.50,creditAmount:0.576,validUntil:30.00,validUntilUnit:day}";
        json = "";
        String edited = json.replaceAll("\\{", "");
        edited = edited.replaceAll("\\}", "");
        edited = edited.replaceAll("[^\\[\\],]+", "\"$0\"");
        edited = edited.replaceAll(":", "\":\"");
        edited = "{" + edited + "}";
        PayloadDTO payload = new Gson().fromJson(edited, PayloadDTO.class);
        System.out.println(payload);
    }
}
