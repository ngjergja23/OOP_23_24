package pckg_vj_7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class TestQueue {

    //private static int flag = 1;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);    //varijable iz try bloka nisu vidljive u ostalim


        try {
            populateQueue(queue);
            System.out.println(queue);
            boolean processed = processQueueElement(queue, 1);
            insertQueueElement(queue,100,processed);
            insertQueueElement(queue,102,processed);

        }catch (IllegalStateException e){
            System.out.println("ise, Queue full!");
        }
        finally {
            System.out.println(queue);
        }

    }

    private static ArrayBlockingQueue<Integer> populateQueue(int num){

        return null;
    }
    private static void populateQueue(ArrayBlockingQueue<Integer> queue){
        int populated = queue.size();
        int remainder = queue.remainingCapacity();
        int capacity = populated + remainder;
        for (int i = 0; i < capacity; i++) {
            queue.add(ThreadLocalRandom.current().nextInt(100));
        }
    }

    //pass by value se odnosi na primitivne tipove podataka
    //podrazumijeva da se radi kopija ulaznih parametara (primitivni tipovi podataka su jednostavni pa je takvo kopiranje podataka)
    //pass by reference se odnosi na ne primitivne tipove, odnosno objekte nekih klasa;
    //ne radi se kopija objekata (skupo), nego kopija reference, međutim ona pokazuje na isti objektkvi

    private static boolean processQueueElement(ArrayBlockingQueue<Integer> queue, int flag){
        boolean processed = false;
        if (!queue.isEmpty() && flag == 1){
            System.out.println("Queue in process...");
            Integer head = queue.poll();
            System.out.println("Remaining to process: " + queue.size());
            processed = true;

        }else {
            System.out.println("Queue is empty or can not process now");
        }
        return processed;
    }
    private static void insertQueueElement(ArrayBlockingQueue<Integer> queue, Integer element, boolean processed){
        if (processed){
            System.out.println("One queue element processed, adding new...");
            queue.add(element);
            System.out.println("New element added to the queue! " + queue);

        }else{
            System.out.println("Not available. Unable to add! ");
            System.out.println(queue);
        }


    }


    // na 1.ispitnom roku varijacija ne temu ovoga zadatka.. s remaining capacity
    // realiziraje sekvencu upravljanja salterom (niz jedinica i nula)
    // u ovisnosti o remaining capacity zamislimo drugi red cekanja(vani na skalama), on odma ispuni
    // ako je remaining 2 on stavi dva


}
