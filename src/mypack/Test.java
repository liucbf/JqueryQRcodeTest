package mypack;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {

/*		FileInputStream fi = new FileInputStream("D:/xinji.txt");
		byte[] b = new byte[512];
		int num = 0;

		FileOutputStream fo = new FileOutputStream("D:/test.txt");

		while ((num = fi.read(b)) != -1) {

			for (int i = 0; i < b.length; i++) {
				System.out.print((char) b[i]);

				fo.write(b[i]);

			}
		}
*/
		InputStream in=new FileInputStream("D:/xinji.txt");
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		
		OutputStream out=new FileOutputStream("D:/buffer.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);

		int value=0;
		while((value=br.read())!=-1){
			System.out.print((char)value);
               bw.write(value);
			
			
		}
		
   bw.flush();
   bw.close();
		
	}
}
