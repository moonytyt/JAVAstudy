package stream2.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0 ; i <bs.length; i++){
			bs[i] = data++;
		}
		
		// output.txt가 만들어진다
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			// output.txt에 bs를 넣는다
			fos.write(bs);
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
		
	}

}
