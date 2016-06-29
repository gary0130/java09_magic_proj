
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
