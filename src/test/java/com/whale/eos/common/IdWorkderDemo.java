package com.whale.eos.common;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whale.eos.basic.util.IdWorker;

/**
 * @author adyliu (imxylz@gmail.com)
 * @since 2015-01-19
 */
public class IdWorkderDemo {
	
	protected static final Logger LOG = LoggerFactory.getLogger(IdWorkderDemo.class);
    /*public static void main(String[] args) {

        final long idepo = System.currentTimeMillis() - 3600 * 1000L;
        IdWorker iw = new IdWorker(1, 1, 0, idepo);
        IdWorker iw2 = new IdWorker(idepo);
        for (int i = 0; i < 10; i++) {
            System.out.println(iw.getId() + " -> " + iw2.getId());
        }
        System.out.println(iw);
        System.out.println(iw2);
    	
    	
    }*/
    
    static class IdWorkThread implements Runnable {
        private Set<Long> set;
        private IdWorker idWorker;
 
        public IdWorkThread(Set<Long> set, IdWorker idWorker) {
            this.set = set;
            this.idWorker = idWorker;
        }
 
        @Override
        public void run() {
            while (true) {
                long id = idWorker.nextId();
                System.out.println(id+"");
                if (!set.add(id)) {
                    System.out.println("duplicate:" + id);
                }
            }
        }
    }
 
    public static void main(String[] args) {
        Set<Long> set = new HashSet<Long>();
        final IdWorker idWorker1 = new IdWorker(0, 0);
        final IdWorker idWorker2 = new IdWorker(1, 0);
        Thread t1 = new Thread(new IdWorkThread(set, idWorker1));
        Thread t2 = new Thread(new IdWorkThread(set, idWorker2));
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
