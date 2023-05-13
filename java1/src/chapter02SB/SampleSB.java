package chapter02SB;

public class SampleSB {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		StringBuilder sb = new StringBuilder();
		
		//インデックスと文字数の確認用として出力
		System.out.println("０１２３４５６７８９０１２３４５６７８９←インデックス番号");
		System.out.println("１２３４５６７８９０１２３４５６７８９０←文字数");
		
		// 文字列結合
		sb.append("こんにちは。");
		sb.append("今日はいい天気ですね。");
		System.out.println(sb.toString());
		
		// 文字列挿入　9文字目直前に挿入
		sb.insert(9, "とても");
		System.out.println(sb.toString());
		
		// 文字列部分置換
		sb.replace(5, 6, "！");
		System.out.println(sb.toString());
		
		// 1文字目から5文字目を"おはようございます"に置換する
		sb.replace(0, 5, "おはようございます");
		System.out.println(sb.toString());
		
		//文字列の部分削除
		//11文字目から13文字目を削除
		sb.delete(10, 13);
		System.out.println(sb.toString());
		
		//文字列の検索
		//"天気"が最初に出現するインデックス番号を取得する
		System.out.println("「天気」の開始位置　→　" + sb.indexOf("天気"));
	}

}
