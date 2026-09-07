public class Main {

    public static void main(String[] args) {

        // 1. Unformatted text
        TextComponent plainText = new PlainText("Hello World");
        System.out.println("Plain: " + plainText.getText());

        // 2. Single decorator
        TextComponent boldText =
                new BoldDecorator(new PlainText("Hello World"));

        System.out.println("Bold: " + boldText.getText());

        // 3. Multiple decorators
        TextComponent boldItalicText =
                new ItalicDecorator(
                    new BoldDecorator(
                        new PlainText("Hello World")
                    )
                );

        System.out.println("Bold + Italic: " + boldItalicText.getText());

        // 4. All decorators
        TextComponent allDecorators =
                new UpperCaseDecorator(
                    new ItalicDecorator(
                        new BoldDecorator(
                            new PlainText("Hello World")
                        )
                    )
                );

        System.out.println("All: " + allDecorators.getText());
    }
}