/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpractice;

/**
 *
 * @author Mitul
 */
public class ThreadPractice extends Thread{
    @Override
    public void run(){
//        for( int i = 1; i <= 5; i++ ){
//            try{
//                Thread.sleep( 500 );
//            }catch( Exception ex ){
//                System.out.println( ex );
//            }
//            System.out.println(i);
//        }
        System.out.println( "Running thread name is : " + Thread.currentThread().getName() );
        System.out.println( "Running thread priority: " + Thread.currentThread().getPriority() );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1 = new Thread( new ThreadPractice() );
        Thread t2 = new Thread( new ThreadPractice() );
        Thread t3 = new Thread( new ThreadPractice() );
        
        t1.start();
        //JOIN Method To be implemented
//        try {
//            // long seconds added 
//            t1.join( 1500 );
//        } catch ( InterruptedException ex ) {
//            System.out.println( ex );
//        }
        
        t2.start();
        t3.start();
        
        
        //Getting name of the thread
//        System.out.println( t1.getName() );
//        System.out.println( t2.getName() );
//        System.out.println( t3.getName() );
        
        //Getting Id's
//        
//        System.out.println( t1.getId() );
//        System.out.println( t2.getId() );
//        System.out.println( t3.getId() );
        
        t1.setPriority(MAX_PRIORITY);
        t3.setPriority(MIN_PRIORITY);
    }
    
}
