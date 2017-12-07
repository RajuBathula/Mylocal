package com.dotridge;

import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ForTesting {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		String encode = encoder.encode("raju");
		
		System.out.println(encode);
		/*MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update("raju".getBytes());

		byte[] digest = md.digest();
		String s=new String(digest);
		//System.out.println(s);
		String toString = Base64.getEncoder().encodeToString(digest);
		
		System.out.println(toString);*/
	}

}
