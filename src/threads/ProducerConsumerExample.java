package threads;

class SharedResource {
    private int product = 0;
    
    // Method to produce a product
    public synchronized void produce() throws InterruptedException {
        while (product > 0) {
            wait(); // Wait until the product is consumed
        }
        product++;
        System.out.println("Produced: " + product);
        notify(); // Notify the consumer thread
    }
    
    // Method to consume a product
    public synchronized void consume() throws InterruptedException {
        while (product == 0) {
            wait(); // Wait until there is a product to consume
        }
        System.out.println("Consumed: " + product);
        product--;
        notify(); // Notify the producer thread
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        
        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    sharedResource.produce();
                    Thread.sleep(1000); // Simulate time to produce a product
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    sharedResource.consume();
                    Thread.sleep(1500); // Simulate time to consume a product
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        producer.start();
        consumer.start();
    }
}
