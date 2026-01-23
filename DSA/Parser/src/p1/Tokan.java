package p1;

public class Tokan {
	    enum Type { START_TAG, END_TAG, SELF_CLOSING_TAG, TEXT }
	    Type type;
	    String value;

	    Tokan(Type type, String value) {
	        this.type = type;
	        this.value = value;
	    }

	    public String toString() {
	        return type + " : " + value;
	    }
	}
