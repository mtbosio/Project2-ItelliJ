import javax.swing.*;

public class BigNumArithmetic {

    /**
     * The entry point of the program.
     * @param args Command line arguments. Should have exactly one argument: a file name.
     */
    public static void main(String[] args) {
//        if (args.length != 1) {
//            throw new IllegalArgumentException(
//                    "Expected exactly 1 argument: a file name.");
//        }
//        String filePath = args[0];
//        FileProcessor.processFile(filePath);

        LinkedList l = new LinkedList();
        l.add(1);
        l.add(3);
        Node temp = l.getHead();
        while(temp.getNext() != null){
            System.out.println(temp.getNum());
            temp = temp.getNext();
        }
    }
}

