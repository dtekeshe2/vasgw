package za.co.ebridge.m3ua.impl.scheduler;

import javolution.util.FastSet;

import org.apache.log4j.Logger;

public class M3UAScheduler
        implements Runnable
{

    private static final Logger logger = Logger.getLogger(M3UAScheduler.class);

    // TODO : Synchronize tasks? Use Iterator?
    protected FastSet<M3UATask> tasks = new FastSet<M3UATask>();

    private FastSet<M3UATask> removed = new FastSet<M3UATask>();

    public void execute( M3UATask task )
    {
        if (task == null)
        {
            return;
        }

        this.tasks.add(task);
    }

    public void run()
    {

        long now = System.currentTimeMillis();

        for (M3UATask task : tasks)
        {

            if ( task.isCanceled() )
            {
                removed.add(task);
            } else
            {
                try
                {
                    task.run( now );
                }
                catch(Exception e)
                {
                    if (logger.isDebugEnabled())
                    {
                        logger.debug("Failed to run a task : " + e);
                    }
                }

                // Check if its canceled after run
                if (task.isCanceled())
                {
                   removed.add( task );
                }
            }
        }

        if ( this.removed.size() > 0 )
        {
            this.tasks.removeAll(this.removed);
            this.removed.clear();
        }
    }
}
