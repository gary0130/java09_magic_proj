import java.util.*;

import android.R.string;

public class Main {
	String name;
	static int live = 0;// 離開無限迴圈
	static Scanner scn = new Scanner(System.in);
	static People gary = new People();// gary為玩家
	static Enemy dragon = new Enemy();// dragon指敵人(以龍龍為基礎~)
	static User user = new User();
	static Map map = new Map();

	public static void main(String[] args) {
		// 主程序

		about();
		map.createmap();
		repeoplename(gary);
		// gary.name="gary";
		gary.firsthealth(100);
		map.bornlocate();
		aboutpeople(gary);
		// Gui_user.main(args);//暫時還不能用

		while (live != 1) {
			// 主要流程
			user.user();
			// user.Gui();
			nowhealth(gary);
			nowlocate();
			map.mapcheck();
			check();
			// dragon.main();
			if (live == 1) {
				break;
			}
			if (dragon.live != 1) {
				enemyattack(dragon, gary);
			}
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
		System.out.print("當前血量:" + i + "/" + j + " ");
	}

	public static void nowlocate() {
		String i = "當前位置" + user.locx + "," + user.locy;
		System.out.println(i);
	}

	public static void peopleattack(People a, Enemy b) {
		// 人物攻擊
		b.health = b.health - a.atk;
	}

	public static void enemyattack(Enemy b, People a) {
		// 敵人攻擊
		a.health = a.health - b.main();

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
