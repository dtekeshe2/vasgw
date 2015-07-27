package com.ebridgevas.commons.processors;

import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.ebridgevas.commons.dto.Authorisation;

public interface Processor
{
    void process(Authorisation authorisation);
}
