package cn.itcast.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class fastDFS_demo {

	public static void main(String[] args) throws Exception, IOException, Exception {
		//1.���������ļ�
		ClientGlobal.init("E:\\pinyougou\\fastDFSDemo\\src\\main\\resources\\fdfs_client.conf");
		//2.����һ��TrackerClient����
		TrackerClient trackerClient = new TrackerClient();
		//3.ʹ��TrackerClient���󴴽�����
		TrackerServer trackerServer = trackerClient.getConnection();
		//4.����һ��StorageServer�����ã�ֵΪnull
		StorageServer storageServer =null;
		//5.����һ��StorageClient����
		StorageClient storageClient = new StorageClient(trackerServer,storageServer);
		//6.ʹ��storageClient�����ϴ�ͼƬ
		String[] strings = storageClient.upload_file("E:\\Camera\\B612Kaji_20180812_144715_557.jpg", "jpg", null);
		//7.�������顣���������ͼƬ·��
		for (String string : strings) {
			System.out.println(string);
		}
	
	
	}

}
