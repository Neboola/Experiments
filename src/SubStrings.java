/**
 * Created by Neboola on 23.11.2015.
 */
public class SubStrings {

    public static void main(String[] args) {

        String str = "public class Experiments {\n" +
                "    \n" +
                "\n" +
                "    public static void main(String[] args) throws IOException {\n" +
                "\n" +
                "        Polimorf.test(); //!!!!!!!!!!!!DELETE!!!!!!!!!!!!!!!\n"  +
                "\n" +
                "        Rand.generateRand(6); //!!!!!!!!!!!!DELETE!!!!!!!!!!!!!!!\n" +
                "\n" +
                "        SubStringSearch.subStringSearch(\"sdfasdfa\");\n" +
                "\n" +
                "/*\n" +
                "!!!!!!!!!!!!DELETE!!!!!!!!!!!!!!! \n" +
                " */\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    public static void sec(int n){\n" +
                "        try {\n" +
                "            Thread.sleep(n*1000);\n" +
                "        } catch (InterruptedException e) {\n" +
                "            e.printStackTrace(); //!!!!!!!!!!!!DELETE!!!!!!!!!!!!!!!\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "} //";


        String s = str;

        //s = str.replaceAll(" +", " ");

        System.out.println(str);

        System.out.println();
        System.out.println("===================");
        System.out.println();



        char[] arr = s.toCharArray();
        StringBuffer buf = new StringBuffer();

        mark: for (int i = 0; i < arr.length; i++) {

            if ((arr[i] == '/') && ((i + 1) < arr.length)) {
                i++;
                if ((arr[i] == '/') && ((i + 1) < arr.length)) {
                    i++;
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] == '\n') {
                            i = j;
                            continue mark;
                        }
                    }
                }
                if (arr[i] == '*') {
                    i++;
                    for (int j = i; j < arr.length; j++) {
                        if ((arr[j] == '*') && (j + 1) < arr.length) {
                            j++;
                            if (arr[j] == '/') {
                                i = j + 1;
                                continue mark;
                            }
                        }
                    }
                }
            }

            buf.append(arr[i]);

        }

        System.out.println(buf);

    }




}
