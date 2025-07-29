package com.core.optional;

import java.util.Optional;



//Definition of Optional in Java
//Optional is a container object introduced in Java 8 that may or may not contain a non-null value.
//It is used to avoid NullPointerException and to represent optional values more explicitly.

public class OptionalClass {
	public static void main(String[] args) {
		boolean checkTrue = true;
		Optional<String> username = getName(checkTrue);
		System.out.println(username.get());
		checkTrue = false;
		Optional<String> usernameF = getName(checkTrue);
		System.out.println(usernameF.isPresent());
	}

	private static Optional<String> getName(boolean checkTrue) {

		String name = checkTrue ? "sowndar" : null;
		return Optional.ofNullable(name);
	}

}
