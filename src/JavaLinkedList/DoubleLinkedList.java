package JavaLinkedList;
/**
 * Class to define a linked list with head and tail linked of double elements
 * @author Iho
 * @version 1.0
 * @since 16-09-2019 11:00 am
 * @param size
 * @param head
 * @param tail 
 */
public class DoubleLinkedList<E> implements List<E> { 
    private int size;
    private DoubleLinkedNode<E> head, tail; 
    /**
     * Private class to define the links to nodes.
     * @param elem
     * @param next
     * @param prev
     */
    private class DoubleLinkedNode<E> implements Position<E> {
        private E elem;
        private DoubleLinkedNode<E> next, prev;
        private DoubleLinkedList<E> id;
        /**
         * 
         * @param elem
         * @param next
         * @param prev 
         */
        public DoubleLinkedNode(E elem, DoubleLinkedNode<E> next, DoubleLinkedNode<E> prev, DoubleLinkedList<E> id){
            this.elem = elem;
     
  
            this.id=id;

            this.next=next;
            this.prev=prev;
        }
        @Override
        public E getElem(){
            return this.elem;
        }
        public DoubleLinkedList<E> getID(){
            return this.id;
        }
        public DoubleLinkedNode<E> getNext(){
            return this.next;
        }
        public void setNext(DoubleLinkedNode<E> next){
            this.next = next;
        }
        public DoubleLinkedNode<E> getPrev(){
            return this.prev;

        }
        public void setPrev(DoubleLinkedNode<E> prev) {
            this.prev = prev;
        }
    }
    /**
     * Return <tt>true</tt> if is empty or false in other case.
     * @return <tt>true</tt> if is empty or false in other case
     */
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    /**
     * Add a new <tt>node</tt> at tail.
     * @param e 
     * @return node
     */
    @Override
    public Position<E> addLast(E e){//¿?
        DoubleLinkedNode<E> newNode;
        if (this.isEmpty()) {
            newNode = new DoubleLinkedNode<>(e,null,null, this);
            this.head=newNode;
            this.tail=newNode;
        }
        else {
            newNode = new DoubleLinkedNode<>(e,null,tail, this);
            this.tail=newNode;
        }
        this.size++;
        return newNode;
    }
    private DoubleLinkedNode<E> checkPosition (Position<E> p){
        if (p == null || !(p instanceof DoubleLinkedNode)) {
            throw new RuntimeException("The position is invalid");
        }
        DoubleLinkedNode<E> node = (DoubleLinkedNode <E>) p;
        if (node.getID()!=this) {
            throw new RuntimeException("The position does not belog this list");
        }
        return node;
    }

    /**
     *
     * @param p
     * @return
     * @throws RuntimeException
     */
    @Override
    public E remove (Position<E> p) throws RuntimeException{
            DoubleLinkedNode<E> node = (DoubleLinkedNode<E>) p;
            E elem = node.getElem();
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
            } else if (this.head== node) {
                this.head =this.head.getNext();
                this.head.setPrev(null);
            } else if (this.tail == node){
                this.tail = this.tail.getPrev();
                this.tail.setNext(null);
            } else {
                DoubleLinkedNode<E>  prev = node.getPrev();
                DoubleLinkedNode<E>  next = node.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            this.size--;
            return elem;
    }

    @Override
    public void show(){
        
    }
    @Override
    public int size(){
        return this.size;
    }
    @Override
    public E get(){
        return null;
    }
}

