package za.co.ebridge.m3ua.api.parameter;

/**
 * The optional Traffic Mode Type parameter identifies the traffic mode of operation of the ASP(s)
 * within an Application Server.
 */
public interface TrafficModeType
        extends Parameter
{

    int Override = 1;
    int Loadshare = 2;
    int Broadcast = 3;

    int getMode();
}
