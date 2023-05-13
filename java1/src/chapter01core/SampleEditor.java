package chapter01core;

public class SampleEditor {

	public SampleEntity editor() {
		
		SampleEntity entity = new SampleEntity();
		
		entity.setZip("123-0015");
		entity.setAddress("東京都中央区");
		entity.setName("日本 太郎");
		
		return entity;
	}
}
