package br.ufmg.dcc.cuda.agent;

public class Sleeping {
    
    public void randomSleep() throws InterruptedException {
         
        // randomly sleeps between 500ms and 1200s
        long randomSleepDuration = (long) (500 + Math.random() * 3000);
        System.out.printf("Sleeping for %d ms ..\n", randomSleepDuration);
        Thread.sleep(randomSleepDuration);
    }
    
    public static void main(String[] args)  {
    	Sleeping sleep = new Sleeping();
    	try {
			sleep.randomSleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
}