/**
 * Created by Neboola on 23.11.2015.
 */
public class SubStrings {

    public static void main(String[] args) {

        String comment1Start = "//";
        String comment1End = "\n";
        String comment2Start = "/*";
        String comment2End = "*/";

        String s = "{uuuuu\n/*DELETE*/ \nqwerty123\n//DELETE   \nqwer   \n12345\nQWERTY\n/*\nDELETE\nDELETE\n*/ \nq\nw\ne\nr\nt\ny\n//////\nqwerty}\n";

        StringBuilder br = new StringBuilder();

        int startIndex1 = 0;
        int endIndex1 = 0;
        int startIndex2 = 0;
        int endIndex2 = 0;
        int startIndex = 0;
        int endIndex = 0;

        while (true) {
            System.out.println("==================");
            System.out.println("iter");

            startIndex1 = s.indexOf(comment1Start, startIndex);
            System.out.println("startIndex1 " + startIndex1);
            startIndex2 = s.indexOf(comment2Start, startIndex);
            System.out.println("startIndex2 " + startIndex2);

            if ((startIndex1 == -1) && (startIndex2 == -1)) break;

            if (startIndex1 != -1) {
                endIndex1 = s.indexOf(comment1End, startIndex1);
            }

            if (startIndex2 != -1) {
                endIndex2 = s.indexOf(comment2End, startIndex2);
            }

            if (startIndex1 < startIndex2) {
                if (startIndex1 != -1) {
                    endIndex = startIndex1 - 1;
                    br.append(s.substring(startIndex, endIndex));
                    System.out.println(br);
                    if (endIndex1 != -1) {
                        startIndex = endIndex1 + 1;
                    } else {
                        startIndex = s.length() - 1;
                    }

                }
            } else {
                if (startIndex2 != -1) {
                    endIndex = startIndex2 - 1;
                    br.append(s.substring(startIndex, endIndex));
                    System.out.println(br);
                    if (endIndex2 != -1) {
                        startIndex = endIndex2 + 1;
                    } else {
                        startIndex = s.length() - 1;
                    }

                }
            }

            //startIndex1 = 0;
            endIndex1 = 0;
            //startIndex2 = 0;
            endIndex2 = 0;

        }

        System.out.println(br);

    }

}
