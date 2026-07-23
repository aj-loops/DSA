import java.util.ArrayList;
import java.util.List;

class encodeAndDecode {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length())
                    .append('#')
                    .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find the '#' delimiter
            while (s.charAt(j) != '#') {
                j++;
            }

            // Length of the next string
            int length = Integer.parseInt(s.substring(i, j));

            // Move past '#'
            j++;

            // Extract the string
            result.add(s.substring(j, j + length));

            // Move to the start of the next encoded string
            i = j + length;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] str = new String[] { "hellp", "world" };
        encodeAndDecode e = new encodeAndDecode();
        System.out.println(e.encode(str));
    }
}