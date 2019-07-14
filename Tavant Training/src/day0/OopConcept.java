package day0;

class Television{
	private String Name;
	private int ScreenResolution;
	private String AndroidVersion;
	private boolean VoiceControlRemote;
	
	public Television() {
	}
	
	public Television(String name, int screenResolution, String androidVersion, boolean voiceControlRemote) {
		super();
		Name = name;
		ScreenResolution = screenResolution;
		AndroidVersion = androidVersion;
		VoiceControlRemote = voiceControlRemote;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getScreenResolution() {
		return ScreenResolution;
	}
	public void setScreenResolution(int screenResolution) {
		ScreenResolution = screenResolution;
	}
	public String getAndroidVersion() {
		return AndroidVersion;
	}
	public void setAndroidVersion(String androidVersion) {
		AndroidVersion = androidVersion;
	}
	public boolean isVoiceControlRemote() {
		return VoiceControlRemote;
	}
	public void setVoiceControlRemote(boolean voiceControlRemote) {
		VoiceControlRemote = voiceControlRemote;
	}
}

class Computer{
	private String Name;
	private String WindowsVersion;
	private int RAM;
	private Double Price;
	
	public Computer() {
		
	}
	public Computer(String name, String windowsVersion, int rAM, Double price) {
		Name = name;
		WindowsVersion = windowsVersion;
		RAM = rAM;
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getWindowsVersion() {
		return WindowsVersion;
	}
	public void setWindowsVersion(String windowsVersion) {
		WindowsVersion = windowsVersion;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
}

class Book{
	private String Name;
	private String Author;
	private int ReleasedYear;
	private Double Price;
	
	public Book(){
		
	}
	
	public Book(String name, String author, int releasedYear, Double price) {
		Name = name;
		Author = author;
		ReleasedYear = releasedYear;
		Price = price;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getReleasedYear() {
		return ReleasedYear;
	}
	public void setReleasedYear(int releasedYear) {
		ReleasedYear = releasedYear;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
}
public class OopConcept {
}
