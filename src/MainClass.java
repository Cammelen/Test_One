public class MainClass {

    private String class_string = "Hello, world";

    public String getClassString() {
        if (class_string.equalsIgnoreCase("Hello, world")) {
            return "Подстрока есть";
        } else
            return class_string;
    }
}