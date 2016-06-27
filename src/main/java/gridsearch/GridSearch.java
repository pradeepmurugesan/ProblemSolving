package gridsearch;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GridSearch {
    private String[] input;
    private String[] pattern;

    public GridSearch(String[] input, String[] pattern) {
        this.input = input;
        this.pattern = pattern;
    }
    public String searchGrid() {
        String result = "NO";
        for(int i = 0; i < input.length; i++) {
            if(input[i].contains(pattern[0])) {
                Pattern r = Pattern.compile(pattern[0]);
                Matcher m = r.matcher(input[i]);
                int row = i;
                for(int x = 0; x < input[i].length(); x++) {
                    int y = x + pattern[0].length();
                    if( y <= input[i].length()) {
                        m.region(x, y);
                        while (m.find()) {
                            int column = m.start();
                            if (matches(row, column)) {
                                result = "YES";
                                break;
                            }
                        }

                    }
                    if(result.equals("YES")) {
                        break;
                    }
                }
                if(result.equals("YES")) {
                    break;
                }

            }
        }
        return result;
    }

    private boolean matches(int row, int column) {
        boolean valid = true;
        for(int i = row, k=0; i< input.length && k < pattern.length; i++, k++) {
            String input_row = input[i].substring(column, column+ pattern[0].length());
            if(!input_row.equals(pattern[k])) {
                valid = false;
            }
        }
        return valid;
    }


}
