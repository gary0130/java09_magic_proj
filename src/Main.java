import java.util.*;

import android.R.string;

public class Main {
	String name;
	static int live = 0;// 離開無限迴圈
	static Scanner scn = new Scanner(System.in);
	static People gary = new People();// gary為玩家
	static Enemy dragon = new Enemy();// dragon指敵人(以龍龍為基礎~)

	public static void main(String[] args) {
		// 主程序
		about();
		repeoplename(gary);
		gary.firsthealth(100);
		aboutpeople(gary);

		while (live != 1) {
			// 主要流程
			user();
			nowhealth(gary);
			check();
			//dragon.main();
			enemyattack(dragon, gary);
		}
	}

	public static void about() {
		// 關於文字
		System.out.println("歡迎來到文字冒險遊戲");
		System.out.println("此為核心測試版本");
	}

	public static void repeoplename(People n) {
		// 更改名字
		System.out.println("輸入新的名字");
		n.name = scn.nextLine();

	}

	public static void aboutpeople(People aboutname) {
		// 顯示關於
		String i = aboutname.name();
		System.out.println("你有一個叫" + i + "的主角");
		int j = aboutname.health;
		System.out.println("他有" + j + "點的血量");
	}

	public static void nowhealth(People h) {
		int i = h.health;
		int j = h.maxhealth;
		System.out.println("當前血量:" + i + "/" + j);
	}

	public static void peopleattack(People a, Enemy b) {
		// 人物攻擊
		b.health = b.health - a.atk;
	}

	public static void enemyattack(Enemy b, People a) {
		// 敵人攻擊
		a.health = a.health - b.main();
		
	}

	public static void user() {
		// 使用者操作
		System.out.println("行動");
		System.out.print(">");
		int i;
		try {
			i = scn.nextInt();

			switch (i) {
			case 1:
				// 攻擊
				peopleattack(gary, dragon);
				break;
			case 2:
				// 上
				break;
			case 3:
				// 道具
				break;
			case 4:
				// 左
				break;
			case 5:
				// 確定
				break;
			case 6:
				// 右
				break;
			case 7:
				// 狀態
				break;
			case 8:
				// 下
				break;
			case 9:
				// 設定
				break;

			case 99:
				// 自殺
				gary.health = 0;
				break;
			default:
				System.out.println("無法辨識");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("無法辨識");

			live = 2;

		}

	}

	public static void check() {
		// 檢查人物
		if (gary.health <= 0) {
			live = 1;// live=1時將會離開迴圈
			System.out.println(gary.name + "死了");
		} else if (live == 2) {
			System.out.println("異常終止 檢測代碼=" + live);
			live = 1;
		}

	}

}

class People {
	// 人的屬性
	String name;
	int health, maxhealth;
	int level;
	int atk = 30;
	String type = "一般人";

	// 先不要用newpeople!!
	void newpeople(String name1, int health1) {
		name = name1;
		health = health1;
		maxhealth = health1;

	}

	String name() {
		// 回傳名子
		return name;
	}

	int health() {
		return health;
	}

	// 設定最大hp
	void firsthealth(int health1) {
		health = health1;
		maxhealth = health1;
	}

	int attack() {
		return atk;
	}

}

class Teammate extends People {
	static String type = "隊友";
}

class Enemy {
	String name = "彥龍";
	int atk = 50;
	int health = 50;
	int live = 0;

	int main() {
		// 主要行為
		about();
		int i=0;
		if (health > 0) {
			attack();
			i= atk;
		} else if (health <= 0) {
			live = 1;
			System.out.println(name + "死了");
			i= 0;
		}
		return i;
	}

	

	void about() {
		System.out.println(name + " 攻" + atk + " 血" + health);
	}

	int attack() {
		return atk;
	}

}
