package com.ttan.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LambdaTest {
	
	public LambdaTest() {}
	
	public String processFile(BufferedReaderProcessor p) throws IOException {
			try (BufferedReader br =
					new BufferedReader(new FileReader("resource/data.txt"))){
				return p.process(br);
			}
	}	

	public static void main(String[] args) throws Exception {
		
		LambdaTest myTest = new LambdaTest();
		
		String oneLine = myTest.processFile((BufferedReader br)->br.readLine() + "\n");
		
		System.out.println(oneLine);
		
		String twoLines = myTest.processFile((BufferedReader br)->br.readLine() + "\n" +  br.readLine());
		
		System.out.println(twoLines);


	}

}
