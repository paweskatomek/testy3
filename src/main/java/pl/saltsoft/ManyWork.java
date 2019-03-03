package pl.saltsoft;

import pl.saltsoft.WorkerDay;

public class ManyWork {
    public void startManyWorkers(int howMany) {
        for (int i = 0; i < howMany; i++) {
            Thread object = new Thread(new WorkerDay());
            object.start();
        }
    }
}