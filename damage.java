import java.util.*;
public class damage{
	public static void main(String[] args){
		System.out.println("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("年齢を入力してください");
		String age = new Scanner(System.in).nextLine();
		int ages = Integer.parseInt(age);
		System.out.println(age+"歳の"+name+"は旅に出た");
		System.out.println("monsterAが現れた");
		System.out.println("勇者の攻撃");
		int damage = new Random().nextInt(50);
		System.out.println("monstrAに"+damage+"のダメージをあたえた");
		System.out.println("monsterAをたおした");
		int experience = new Random().nextInt(150);
		System.out.println(name+"は"+experience+"の経験値を得た");
	}
}


