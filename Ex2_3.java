import java.util.*;
public class Ex2_3{
	public static void main(String[] args){
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を教えてください");
		String agesString = new Scanner(System.in).nextLine();
		int age = Integer.parseInt(agesString);
		int fortune = new Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果がでました");
		System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
		System.out.println("1:大吉　2:中吉 3:吉 4:凶");
	}
}

