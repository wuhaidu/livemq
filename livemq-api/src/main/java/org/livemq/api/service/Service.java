package org.livemq.api.service;

/**
 * 
 * @Title Service
 * @Package org.livemq.api.service
 * @Description TODO
 * @author xinxisimple@163.com
 * @date 2018-07-30 11:30
 * @version 1.0.0
 */
public interface Service {

	void start(Listener listener);
	
	void stop(Listener listener);
	
	void init();
	
	boolean isRunning();
	
}
