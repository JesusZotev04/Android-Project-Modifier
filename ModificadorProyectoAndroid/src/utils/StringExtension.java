package utils;

public class StringExtension {
    private String str;

    public StringExtension(String str) {
        this.str = str;
    }

    public boolean containsWithArray(String[] array) {
        boolean found = false;
        
        for(int i = 0 ; i < array.length && !found ; i++) if(str.contains(array[i])) found = true;
        
        return found;
    }

    public String getString() {
        return str;
    }
}
