public class FileDownLoad implements Downloader{
    private String UserAgent;
    @Override
    public void download(String UserAgent) {
    }

    public FileDownLoad(String userAgent) {
        UserAgent = userAgent;
    }
}
