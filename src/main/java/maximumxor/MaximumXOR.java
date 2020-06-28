package maximumxor;

public class MaximumXOR {

    public String maxXorValue(String x, int k) {
        StringBuilder builder = new StringBuilder();
        String[] input = x.split("");
        for (String s : input) {
            if (s.equals("0") && k > 0) {
                builder.append("1");
                k--;
            } else {
                builder.append("0");
            }
        }
        return builder.toString();
    }
}
