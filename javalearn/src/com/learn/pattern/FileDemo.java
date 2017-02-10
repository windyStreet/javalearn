package com.learn.pattern;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo extends GetTime {

	@Override
	public void code() {
		// TODO Auto-generated method stub
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
			bis.close();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
