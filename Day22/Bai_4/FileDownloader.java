import java.io.*;
import java.net.URL;
import java.net.URLConnection;

class FileDownloader implements Downloader{

    private String userAgent;

    public FileDownloader(String userAgent){
        this.userAgent = userAgent;
    }
    @Override
    public void download(String url, String destination) {
        try{
            URL fileUrl = new URL(url);
            URLConnection connection = fileUrl.openConnection();

            connection.setRequestProperty("User-Agent",userAgent);

            InputStream inputStream = connection.getInputStream();

            FileOutputStream outputStream = new FileOutputStream(destination);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1 ){
                outputStream.write(buffer, 0, bytesRead );
            }
          outputStream.close();
            inputStream.close();
            System.out.println("File downloaded successfully");

        } catch (IOException e){
            System.out.println("Error downloading " + e.getMessage());
        }
}
}
