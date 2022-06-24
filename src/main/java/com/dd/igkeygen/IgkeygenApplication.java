package com.dd.igkeygen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Base64;

@SpringBootApplication
public class IgkeygenApplication {

	public static void main(String[] args) throws IOException {
		//String encoded = generate("yamig87938@tagbert.com", "1656073522");

		SpringApplication.run(IgkeygenApplication.class, args);
	}

	public static String generate(String email, String timestamp) throws IOException {
		byte[] r2 = new byte[24];
		StringBuilder r3 = new StringBuilder();
		SecureRandom secureRandom = new SecureRandom();

		r3.append(email);
		r3.append("|");
		r3.append(timestamp);
		r3.append("|");

		secureRandom.nextBytes(r2);

		ByteArrayOutputStream r1 = new ByteArrayOutputStream();
		r1.write(r3.toString().getBytes());
		r1.write(r2);

		byte[] out = r1.toByteArray();

		return Base64.getEncoder().encodeToString(out);
	}

}
