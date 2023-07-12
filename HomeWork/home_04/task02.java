package HomeWork.home_04;

import java.util.LinkedList;

//  Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
public class task02 {
    LinkedList<Integer> linList;

    public task02() {
        linList = new LinkedList<>();
    }

    public void enqueue(int num) {
        linList.add(num);
    }

    public int dequeue() {
        if (linList.isEmpty()) {
            {
                throw new IllegalStateException("Стек пуст! ");
            }
        }
        return linList.removeFirst();
    }

    public int first() {
        if (linList.isEmpty()) {
            {
                throw new IllegalStateException("Стек пуст! ");
            }
        }
        return linList.getFirst();
    }

    public void print() {
        System.out.println(linList);
    }

    public static void main(String[] args) {
        task02 queue = new task02();
        queue.enqueue(458);
        queue.enqueue(456);
        queue.enqueue(23);
        queue.enqueue(5);
        queue.enqueue(7458);
        queue.enqueue(3);
        queue.print();
        System.out.println(queue.dequeue());
        queue.print();
        System.out.println(queue.first());
        queue.print();

    }
}
