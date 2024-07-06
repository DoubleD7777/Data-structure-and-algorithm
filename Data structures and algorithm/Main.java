public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(5);
        myStack.push(4);
        myStack.push(4);
        myStack.push(3);
        myStack.push(1);
        myStack.pop();
        myStack.printAll();
    }
}
