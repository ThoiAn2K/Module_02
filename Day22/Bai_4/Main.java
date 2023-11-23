public class Main {
    public static void main(String[] args) {
        Downloader downloader = new FileDownLoaderProxy();
        Client client = new Client(downloader);

        String url = "https://example.com/examplefile.txt";
        String destination = "C:/Downloads/examplefile.txt";

        client.downloadFile(url, destination);
    }
}