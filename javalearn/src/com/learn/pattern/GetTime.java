package com.learn.pattern;

public abstract class GetTime {
	public long getTime() {
		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) {
//			System.out.println(i);
//		}
//
//		try {
//			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
//			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
//			byte[] bys = new byte[1024];
//			int len = 0;
//			while ((len = bis.read(bys)) != -1) {
//				bos.write(bys, 0, len);
//			}
//			bis.close();
//			bos.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		// }
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();
}
