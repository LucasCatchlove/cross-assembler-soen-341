public class TestFileReader {

    public static void main(String[] args) {

        FileReader fr = new FileReader("helloworld.txt");

        System.out.println("Test FileReader getFileName");
        System.out.println("helloworld.txt");
        System.out.println(fr.getFileName());

    }

}
