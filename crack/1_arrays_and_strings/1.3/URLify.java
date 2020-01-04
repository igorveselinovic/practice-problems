public class URLify {
    public static void urlify(char[] url, int length) {
        final char DECODED = ' ';
        final String ENCODED = "%20";

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (url[i] == ' ') spaceCount++;
        }
        int writeLocation = length + 2 * spaceCount - 1;

        if (writeLocation < url.length - 1) url[writeLocation + 1] = '\0';
        for (int i = length - 1; i >= 0; i--) {
            if (url[i] == DECODED) {
                for (int j = 1, lenEnc = ENCODED.length(); j <= lenEnc; j++) {
                    url[writeLocation--] = ENCODED.charAt(lenEnc - j);
                }
            } else {
                url[writeLocation--] = url[i];
            }
        }
    }
}