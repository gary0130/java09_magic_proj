
class User {

	static int g;// gui測試用
	public static int check = 0;// 檢測輸入
	public static int locx, locy;

	public void user() {
		// 使用者操作
		System.out.println("行動");
		System.out.print(">");
		int i;
		try {
			i = Main.scn.nextInt();

			switch (i) {
			case 1:
				// 攻擊
				Main.peopleattack(Main.gary, Main.dragon);
				break;
			case 2:
				// 上
				locy = locy + 1;
				break;
			case 3:
				// 道具
				break;
			case 4:
				// 左
				locx = locx - 1;
				break;
			case 5:
				// 確定
				break;
			case 6:
				// 右
				locx = locx + 1;
				break;
			case 7:
				// 狀態
				break;
			case 8:
				// 下
				locy = locy - 1;
				break;
			case 9:
				// 設定
				break;

			case 99:
				// 自殺
				Main.gary.health = 0;
				break;
			default:
				System.out.println("無法辨識");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("無法辨識");

			Main.live = 2;

		}

	}

	public void Gui() {

		// 使用者操作
		//System.out.println("行動");
		//System.out.print(">");
		int i;

		i = g;
		if (check == 1) {
			switch (g) {
			case 1:
				// 攻擊
				Main.peopleattack(Main.gary, Main.dragon);
				break;
			case 2:
				// 上
				locx = locx + 1;
				break;
			case 3:
				// 道具
				break;
			case 4:
				// 左
				locy = locy - 1;
				break;
			case 5:
				// 確定
				break;
			case 6:
				// 右
				locy = locy + 1;
				break;
			case 7:
				// 狀態
				break;
			case 8:
				// 下
				locx = locx - 1;
				break;
			case 9:
				// 設定
				System.out.println("9");
				break;

			case 99:
				// 自殺
				Main.gary.health = 0;
				break;
			default:
				System.out.println("無法辨識");
			}
		}
	}

}
