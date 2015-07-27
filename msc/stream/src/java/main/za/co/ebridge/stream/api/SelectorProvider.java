package za.co.ebridge.stream.api;

/**
 * Service-provider class for selectors and selectable streams.
 */
public class SelectorProvider
{

    public static StreamSelector getSelector(String clazz)
            throws
            ClassNotFoundException
    {
        try
        {
            Class instance = SelectorProvider.class.getClassLoader().loadClass(clazz);
            return (StreamSelector) instance.newInstance();
        }
        catch (Exception e)
        {
            throw new ClassNotFoundException();
        }
    }
}
