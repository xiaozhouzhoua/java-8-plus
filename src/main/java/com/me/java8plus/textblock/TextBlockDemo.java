package com.me.java8plus.textblock;

public class TextBlockDemo {
    public static void main(String[] args) {
        String stringBlock =
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "    <body>\n" +
                        "        <h1>\"Hello World!\"</h1>\n" +
                        "    </body>\n" +
                        "</html>\n";

        String textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>"Hello World!"</h1>
                    </body>
                </html>
                """;

        System.out.println(
                "Does the text block equal to the regular string? " +
                        stringBlock.equals(textBlock));
        System.out.println(
                "Does the text block refer to the regular string? " +
                        (stringBlock == textBlock));


        String greetingHtml = """
        <!DOCTYPE html>
        <html>
            <body>
                <h1>%s</h1>
            </body>
        </html>
        """.formatted("Hello World!");
        System.out.println(greetingHtml);

        String poetryTextArea = """
                <html>
                <head></head>
                <body>
                <div align="center">
                    No man is an island,<br />
                    Entire of itself,<br />
                    Every man is a piece of the continent,<br />
                    A part of the main.
                </div>
                </body>
                </html>""";
        System.out.println(poetryTextArea);
    }
}
