public class FileDownloaderProxy implements Downloader {
    private Object FileDownLoad;

    @Override
    public void download(String URL) {
         FileDownLoad = new FileDownLoad(URL);
    }
}
