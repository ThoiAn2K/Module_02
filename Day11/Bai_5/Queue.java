public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }
    public void enQueue(int value){
        Node newNode = new Node();
        newNode.data = value;

        if(front == null){
            front = newNode;
            rear = newNode;
        }else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }


    }
    public Integer deQueue(){
        if (front == null){
            return null;
        }
        int value = front.data;
        front = front.link;
        if (front == null){
            rear = null;
        }
        return value;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}
