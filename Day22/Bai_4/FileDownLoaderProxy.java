public class FileDownLoaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    public FileDownLoaderProxy(){
        this.fileDownloader = new FileDownloader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:58.0) Gecko/20100101 Firefox/58.0");

    }

    @Override
    public void download(String url, String destination) {
        fileDownloader.download(url, destination);
    }
}
