
public class Version {
	
	
	String version;
	
	public Version(String version) {
		if(version == null) {
			throw new IllegalArgumentException("Version must not be null.");
		}
		if(!version.matches("[0-9]+(\\.[0-9]+)*")) {
			throw new IllegalArgumentException("Version format invalid.");
		}
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public static int compare(Version first, Version second) throws NullVersionException{
		
		if(first == null || second == null) {
			throw new NullVersionException();
		}
		
		String[] firstVersion = first.version.split("\\.");
		String[] secondVersion = second.version.split("\\.");
		
		
		int n = Math.max(firstVersion.length, secondVersion.length);
		
		for(int i = 0; i < n; i++) {
			
			int v1 = 0, v2 = 0;
			
			if(i < firstVersion.length) {
				v1 = Integer.parseInt(firstVersion[i]);
			}
			if(i < secondVersion.length) {
				v2 = Integer.parseInt(secondVersion[i]);
			}
			
			if(v1 > v2) return 1; //Version 1 greater than version 2
			
			if(v2 > v1) return -1; //Version 2 greater than version 1
		}
		return 0; // The two Version are equal
	}
	
	
}
