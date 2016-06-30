class Enemy {
	String name = "龍龍";
	int atk = 50;
	int health = 50;
	int live = 0;

	int main() {
		// 主要行為
		about();
		int i = 0;
		if (health > 0) {
			attack();
			i = atk;
		} else if (health <= 0) {
			live = 1;
			System.out.println(name + "死了");
			i = 0;
		}
		return i;
	}

	void about() {
		System.out.println("敵人" + name + " 攻" + atk + " 血" + health);
	}

	int attack() {
		return atk;
	}

}
