//CÓDIGO MERAMENTE ACADÉMICO (OBSOLETO)
package ArrayStack;

/**
 *
 * @author Iho
 */
public class ArrayStackFloatNoExcept {
    private int top;
    private final int MAXSIZE;
    private float[] s;
    
    public ArrayStackFloatNoExcept (int cap) {
        this.s = new float[cap];
        this.MAXSIZE = cap;
        this.top = 0;
    }

    public boolean isEmpty () {
        return this.top == 0;
    }
    
    public float pop () {
        if (!this.isEmpty()) {
            this.top--;
            return this.s[top];
        }
        System.err.println("The stack is empty.");
        return 0;      
    }
    
    public float top () {
        return this.s[top];
    }
    
    public int size () {
        return this.top;
    }
    
    
}


