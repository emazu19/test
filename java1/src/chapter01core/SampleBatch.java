package chapter01core;

public class SampleBatch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		SampleEditor editor = new SampleEditor();
		SampleEntity entity = editor.editor();
		
		System.out.println(entity.getZip());
		System.out.println(entity.getAddress());
		System.out.println(entity.getName());
		
		System.out.println(entity.getZip() + "、" + entity.getAddress() + "、" + entity.getName());
		
	}

}
