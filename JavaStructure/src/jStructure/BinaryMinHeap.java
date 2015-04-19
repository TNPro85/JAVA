package jStructure;

public class BinaryMinHeap {

	// PRE-ORDER: NODE LEFT RIGHT
	// IN-ORDER: LEFT NODE RIGHT
	// POST-ORDER: LEFT RIGHT NODE

	private int[] heapData;
	private int heapSize = 0;

	public BinaryMinHeap(int size) {
		heapData = new int[size];
		heapSize = 0;
	}

	public int getLeftChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 1;
	}

	public int getRightChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 2;
	}

	public int getParentIndex(int nodeIndex) {
		return (nodeIndex - 1) / 2;
	}
	
	public void insert(int value) {
		if (heapSize == heapData.length)
			throw new HeapException("Heap's underlying storage is overflow");
		else {
			heapSize++;
			heapData[heapSize - 1] = value;
			siftUp(heapSize - 1);
		}
	}    

	public int getMin() {
		if(isEmpty())
			throw new HeapException("Heap is Empty");
		else
			return heapData[0];
	}
	
	public void removeMin() {
		if (isEmpty())
			throw new HeapException("Heap is empty");
		else {
			heapData[0] = heapData[heapSize - 1];
			heapSize--;
			if (heapSize > 0)
				siftDown(0);
		}
	}

	private void siftUp(int nodeIndex) {
		int parentIndex, tmp;
		if (nodeIndex != 0) {
			parentIndex = getParentIndex(nodeIndex);
			if (heapData[parentIndex] > heapData[nodeIndex]) {
				tmp = heapData[parentIndex];
				heapData[parentIndex] = heapData[nodeIndex];
				heapData[nodeIndex] = tmp;
				siftUp(parentIndex);
			}
		}
	}

	private void siftDown(int nodeIndex) {
		int leftChildIndex, rightChildIndex, minIndex, tmp;
		leftChildIndex = getLeftChildIndex(nodeIndex);
		rightChildIndex = getRightChildIndex(nodeIndex);

		if (rightChildIndex >= heapSize) {
			if (leftChildIndex >= heapSize)
				return;
			else
				minIndex = leftChildIndex;
		} else {
			if (heapData[leftChildIndex] <= heapData[rightChildIndex])
				minIndex = leftChildIndex;
			else
				minIndex = rightChildIndex;
		}

		if (heapData[nodeIndex] > heapData[minIndex]) {
			tmp = heapData[minIndex];
			heapData[minIndex] = heapData[nodeIndex];
			heapData[nodeIndex] = tmp;
			siftDown(minIndex);
		}
	}

	public class HeapException extends RuntimeException {
		public HeapException(String message) {
			super(message);
		}
	}

	public boolean isEmpty() {
		return heapSize == 0;
	}

	public static void main(String[] args) {

	}
}
