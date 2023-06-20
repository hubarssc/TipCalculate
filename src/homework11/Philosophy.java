package homework11;

/**
 *  Сделать задачу с философами, при условии, что за столом может сидеть только 1 философ,
 *  синхронизировать доступ к критической секции через synchronized
 *  (см описание задачи: https://metanit.com/java/tutorial/8.6.php)
 */

public class Philosophy {
    public static void main(String[] args) {
        Object table = new Object(); //Стол
        int numPhilosophers = 6;

        Philosopher[] philosophers = new Philosopher[numPhilosophers];

        for (int i = 1; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(table, i);
            philosophers[i].start();
        }

        // Ждем, пока все философы пообедают один раз
        try {
            for (int i = 1; i < numPhilosophers; i++) {
                philosophers[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все философы закончили есть. Программа завершена.");
    }
}

class Philosopher extends Thread {
    private Object table;
    private int id;
    private boolean hasFinishedEating;
    private static int numFinishedEating = 0;

    public Philosopher(Object table, int id) {
        this.table = table;
        this.id = id;
        this.hasFinishedEating = false;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println("Философ " + id + " " + action);
        Thread.sleep(500);
    }

    @Override
    public void run() {
        try {
            while (numFinishedEating < 5) {
                synchronized (table) {
                    while (hasFinishedEating) {
                        table.wait();
                    }
                    doAction("сел за стол");
                    doAction("поел");
                    doAction("поднялся");
                    hasFinishedEating = true;
                    numFinishedEating++;
                    table.notifyAll();
                    return;
                }
            }
        } catch (InterruptedException e) {
            System.out.println("У философа " + id + " проблемы со здоровьем");
        }
    }
}
