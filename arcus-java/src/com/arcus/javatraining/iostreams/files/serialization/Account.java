package com.arcus.javatraining.iostreams.files.serialization;

import java.io.*;

class Account implements Serializable {
	String userName = "Arcus";
	transient String pwd = "Arcus123";

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = pwd;
		os.writeObject(epwd);
		System.out.println("In Write Object: Saved epwd: "+epwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
	//	System.out.println("ois.defaultReadObject(): "+ ois.defaultReadObject());
		String epwd = (String) ois.readObject();
		System.out.println("In Read Object: epwd: "+epwd);
		pwd = epwd;
	}
}

