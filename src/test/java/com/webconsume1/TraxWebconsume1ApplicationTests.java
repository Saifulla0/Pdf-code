package com.webconsume1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.webconsume1.controller.A;

@SpringBootTest
class TraxWebconsume1ApplicationTests {

	@Test
	void contextLoads() {
		String filePath = "C:\\sts_code8\\trax_webconsume-1\\tickets\\.pdf";
		A a = new A();
		a.writeUsingIText(filePath);
		
	}

}
