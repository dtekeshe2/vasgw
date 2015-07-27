package za.co.ebridge.commons;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDriver;
import org.apache.commons.pool.KeyedObjectPoolFactory;
import org.apache.commons.pool.impl.GenericKeyedObjectPoolFactory;
import org.apache.commons.pool.impl.GenericObjectPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

@Deprecated
// TODO Replace with JPA
public class DataBaseConnectionPool
{

    private static GenericObjectPool gPool;
    public final static Integer DB_CONNECTION_POOL_SIZE = 50;

    public static void init() throws Exception
    {

        gPool = new GenericObjectPool();
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "postgres");
        Class.forName("org.postgresql.Driver").newInstance();
        ConnectionFactory cf
                = new DriverConnectionFactory(new org.postgresql.Driver(), "jdbc:postgresql://192.1.1.57/vas", props);

        KeyedObjectPoolFactory kopf = new GenericKeyedObjectPoolFactory(null, DB_CONNECTION_POOL_SIZE);

        PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, gPool, kopf, null, false, true);
        gPool.setMaxActive(50);
        for (int i = 0; i < DB_CONNECTION_POOL_SIZE; i++)
        {
            gPool.addObject();
        }
        PoolingDriver pd = new PoolingDriver();
        pd.registerPool("vasDBCP", gPool);

    }

    public static Connection getConnection() throws Exception
    {
        if ( gPool == null )
        {
            init();
        }

        return DriverManager.getConnection("jdbc:apache:commons:dbcp:vasDBCP");
    }
}
