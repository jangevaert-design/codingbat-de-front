public class deFront {
  public String deFront(String str) {
    int len = str.length();
    if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
      return str.substring(0, 1) + str.substring(2, len);
    } else if (str.charAt(1) == 'b' && str.charAt(0) != 'a') {
      return str.charAt(1) + str.substring(2, len);
    } else if (str.startsWith("ab")) {
      return str;
    } else {
      return str.substring(2, len);
    }
  }
}
