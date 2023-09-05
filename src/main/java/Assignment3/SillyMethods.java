package Assignment3;
public class SillyMethods {
    public boolean didGuess42(int guess){
        return guess == 42;
    }
    public String countTo(int index) {
        StringBuilder Array = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            Array.append(i);
            if (i != index){
                Array.append(" ");
            }
        }
        return Array.toString();
    }
}
