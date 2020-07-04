public class MyStack<E> {
    private Object[] tab;
    private int counter;
    private int tabLength = 10;

    public MyStack() {
        tab = new Object[tabLength];
        counter = -1;
    }

    public void push(E element) {
        // if tab is too small
        if (counter == tabLength - 1) {
            tabLength = 2 * tabLength;
            Object[] biggerTab = new Object[tabLength];
            for (int i = 0; i < tab.length; i++) {
                biggerTab[i] = tab[i];
            }
            tab = biggerTab;
            counter++;
            tab[counter] = element;
        }

        counter++;
        tab[counter] = element;
    }

    public E peek() throws Exception {
        if (counter < 0) {
            throw new IllegalStateException("Stack is empty!");
        }
        return (E) tab[counter];
    }

    public E pop() {
        if (counter < 0) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            Object value = tab[counter];
            counter--;
            return (E)value;
        }
    }

    public int size(){
        return counter+1;
    }
}
