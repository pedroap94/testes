public class StringBuilderTestes {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        int number = 10;
        s.append("teste" + " e " + number%10);
        System.out.println(s);

    }

}
