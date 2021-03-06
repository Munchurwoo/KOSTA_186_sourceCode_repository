package step13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInputFile {
	public static void main(String[] args) {
		
		// 파일에 연결하여 입력스트림을 이용해 
		// 정보를 입력받는 예제 
		
		String path="C:\\java-kosta\\test\\output.txt";
		// NodeStream : 장치에 연결 ( 파일에 연결 )
		try {
			FileReader fr = new FileReader(path);
			// ProcessingStream : 기존 스트림에 연결되어 기능을 제공하는 스트림 
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // 더 이상 읽을 문자열이 없으면 null 
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
