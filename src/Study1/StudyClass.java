package Study1;

public class StudyClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello Java!!");
		System.out.println(-5*2);
		System.out.println(6*6*3.14);
		System.out.println("答えは"+64);
		System.out.println("数学でx,yという文字を数式に用いるように、Javaも似たようなことができる!");
		int x;  //	変数を入れる準備
		x = 6;
		System.out.println(x * x * 3.14);
		System.out.println("javaの３ステップ。①ソースコードの作成。②コンパイル。③実行。");
		System.out.println("javaのソースコードを記述したファイル（ソースファイル）を保存するときは「クラス名.java」にする");
		System.out.println("javaプログラムの始め方");
		System.out.println("①どのようなプログラムを作りたいか考える");
		System.out.println("②プログラムの名前を決める（クラス名が決まる）");
		System.out.println("「クラス名.java」という名前でファイルを作る");
		System.out.println("ソースコードの外側部分（クラスブロック）を記述");
		System.out.println("ソースコードの内側部分（メソッドブロック）に命令を書いていく");
		System.out.println("データ型（整数）");
		byte glasses; glasses = 2; //byte age = 22;ともできる
		short age; age = 18;
		int salary; salary = 152000;  //	主にintを使う
		long worldPeople; worldPeople = 6900000000L;
		System.out.println("データ型（小数）");
		float weight; weight = 67.5F;
		double height; height = 171.2;  //doubleの方がメモリを消費するがより厳密に計算できる。小数点を使う場合、基本はdouble型にする。
		System.out.println("データ型（真偽値）");
		boolean isError; isError = true;//	意味　エラーである
		boolean rusult; rusult = false;//	意味　結果は失敗
		System.out.println("データ型（文字）");
		char zodiac = '辰';
		String name; name = "ニャンコ先生";
		System.out.println("変数の初期化  型　変数名　＝　代入するデータ;");
		System.out.println("上書きされたくない場合はfinalを使う。　final 型　定数名 = 初期値;");
//		定数名は全て大文字!
		final double PI = 3.14;
		
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println(c);
		
		boolean error = true;
		char oneWord = '駆';
		double pi = 3.14;
		long peple = 314159265853979L;
		String word = "港の攻撃！　敵に15ポイントのダメージを与えた！";
		System.out.println("私の好きな記号は(\")です");
		System.out.println("算術演算子+ - * / % は基本評価が左から右");
		System.out.println("インクリメント/デクリメント演算子　＋＋　ーー");
		int d = 100;
		d++; //	aの内容が１増える
		System.out.println(d);
//		++や--は他の演算子と一緒に使わない！++aでもa++と表記してもaの中身が1増えることは変わらない。
//		しかし他の演算子と一緒に利用すると++a・a++で微妙に違いが生じる。
		
	}

}
