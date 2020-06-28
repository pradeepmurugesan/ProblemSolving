package badkeyboard;

import java.util.LinkedList;

public class BadKeyBoard {

    private LinkedList<String> list;
    public BadKeyBoard() {
        list = new LinkedList<>() ;

    }
    public String receivedText(String S) {
        LinkedList<String> list = new LinkedList<>();
        int current = 0;
        boolean numLock = true;
        String[] message = S.split("");
        for (int i = 0; i < message.length; i++) {
            if( message[i].equals("<")) {
                current = 0;
            } else if (message[i].equals(">")) {
                current = list.size();
            } else if (message[i].equals("*")) {
                if( current > 0) {
                    list.remove(current - 1);
                    current--;
                }
            } else if (message[i].equals("#")) {
                numLock = !numLock;
            } else if (message[i].matches("[0-9]")) {
                if (numLock) {
                    list.add(current, message[i]);
                    current++;
                }
            } else {
                list.add(current, message[i]);
                current++;
            }
        }

        return String.join("", list);
    }
}


