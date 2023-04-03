package com.arcus.javatrainings.threads.Threadclass;
import java.util.List;
import java.util.ArrayList;

public class MultiExecutor {

    // Add any necessary member variables here
    List<Runnable> tasks;

    /* 
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
      this.tasks=tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        
        for(int i=0;i<tasks.size(); i++){
        	Thread t = new Thread(tasks.get(i));
        	t.start();
        
        }
        // complete your code here
    }
}