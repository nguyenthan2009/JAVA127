public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy TEST = new FileDownloaderProxy();
        TEST.download("https://www.mozilla.org/vi/firefox/new/");
    }
}
