package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Karthi");
		queue.add("Balaji");
		queue.add("Hari");
		queue.add("Logesh");
		queue.add("Karthi");
		queue.add("Mathi");
		//queue.add(null);
		System.out.println(queue);
		
		/*queue.element method which will retrieve head of the queue
		 * When the queue is empty it will throw no such element exception
		 * 
		 * queue.peak method which will retrieve head of the queue
		 * When the queue is empty it will return null value
		 * 
		 * Poll: Remove the head value & throw null if queue is empty
		 * Remove: Remove the head value & throw no such element exception if queue is empty
		 */

		System.out.println("Head of element : " +queue.element());
		System.out.println("Head of element : " +queue.peek());
		System.out.println("Remove head using Poll : " + queue.poll());
		
		System.out.println(queue);
		
		System.out.println("Remove head using remove method : " + queue.remove());
		
		System.out.println(queue);
	}

}
