import DesignPattern.Singleton;
import RegularExpression.Expression;
import Threads.Robot;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        // Ex 1
        //Expression expression = new Expression();
        //System.out.println(expression.checkExpression("The car got no damage"));
        //System.out.println(expression.checkExpression("The car is damaged"));
        //System.out.println(expression.checkExpression("The car got minor damage"));
        //System.out.println(expression.checkExpression("The car is heavy damaged"));
        //System.out.println(expression.checkExpression("This is a really good car"));

        // Ex 3
       //threadTest();

        // Ex 5
        Robot robot = new Robot();
    }

    private static void threadTest() throws InterruptedException {
        for (int run = 0; run < 10; run++){
            ArrayList<Thread> threads = new ArrayList<Thread>();

            for(int instances = 0; instances < 10000; instances++){
                Thread thread = new Thread(Singleton::getInstance);
                threads.add(thread);
                thread.start();
            }
            for(Thread thread : threads) {
                thread.join();
            }
            System.out.print(run + ": ");
            Singleton.threads();
            Singleton.reset();
        }
    }
}
