package Chapter9.project.MultiThreadedFileDownloader;

public class Main {

	public static void main(String[] args) {
		final String downloadDir= "C:\\Users\\user\\Desktop\\SampleDownload";
		final String url ="https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_480_1_5MG.mp4";
		
		DownloadManager downloadManager = new DownloadManager();
		downloadManager.download(url, downloadDir);

	}

}
