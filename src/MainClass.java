public class MainClass {

    private String class_string = "Hello, world";

    public String getClassString() {
        if (class_string.contains("Hello") || class_string.contains("hello")) {
            return "Подстрока есть";
        } else
            return class_string;
    }
}