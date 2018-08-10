package step13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInputFile {
	public static void main(String[] args) {
		
		// ���Ͽ� �����Ͽ� �Է½�Ʈ���� �̿��� 
		// ������ �Է¹޴� ���� 
		
		String path="C:\\java-kosta\\test\\output.txt";
		// NodeStream : ��ġ�� ���� ( ���Ͽ� ���� )
		try {
			FileReader fr = new FileReader(path);
			// ProcessingStream : ���� ��Ʈ���� ����Ǿ� ����� �����ϴ� ��Ʈ�� 
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // �� �̻� ���� ���ڿ��� ������ null 
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}