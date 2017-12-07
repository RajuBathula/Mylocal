package com.dotridge.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class CustomPasswordEncoder {

	public static String encodePassword(String password) {
		byte[] tokenSign = encryptPassword(password);

		String token = Base64.getEncoder().encodeToString(tokenSign);

		return token;
	}

	private static byte[] encryptPassword(String passowrd) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(passowrd.getBytes());
			byte[] hash = md.digest();
			MessageDigest md1 = MessageDigest.getInstance("SHA-1");
			md1.update(passowrd.getBytes());
			byte[] hashsha1 = md1.digest();
			return hashsha1;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;

	}

	public static void main(String[] args) {
		System.out.println(CustomPasswordEncoder.encodePassword("raju"));
		System.out.println(CustomPasswordEncoder.encodePassword("raju"));
	}
}
