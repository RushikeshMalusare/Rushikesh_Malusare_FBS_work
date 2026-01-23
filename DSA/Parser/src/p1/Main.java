package p1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	    public static List<Tokan> tokenize(String html) {
	        List<Tokan> t1 = new ArrayList<>();

	        StringBuilder buffer = new StringBuilder();
	        boolean insideTag = false;

	        for (char ch : html.toCharArray()) {

	            if (ch == '<') {
	                // Emit text token before starting a tag
	                if (buffer.length() > 0) {
	                    t1.add(new Tokan(Tokan.Type.TEXT, buffer.toString().trim()));
	                    buffer.setLength(0);
	                }
	                insideTag = true;
	                buffer.append(ch);
	            }
	            else if (ch == '>') {
	                buffer.append(ch);
	                insideTag = false;

	                String tag = buffer.toString();
	                buffer.setLength(0);

	                // Classify tag type
	                if (tag.matches("</.+>")) {
	                    t1.add(new Tokan(Tokan.Type.END_TAG, tag));
	                } 
	                else if (tag.matches("<.+/>")) {
	                    t1.add(new Tokan(Tokan.Type.SELF_CLOSING_TAG, tag));
	                } 
	                else {
	                    t1.add(new Tokan(Tokan.Type.START_TAG, tag));
	                }
	            }
	            else {
	                buffer.append(ch);
	            }
	        }
	        return t1;
	    }

	    public static void main(String[] args) {
	        String html = "<html><body><h1>Hello World</h1><br/><p>Demo</p></body></html>";

	        List<Tokan> tokens = tokenize(html);
	        tokens.forEach(System.out::println);
	    }
	}


