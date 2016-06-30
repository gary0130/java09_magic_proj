
public class Map {
	int[] mapx, mapy;// x,y的邊界
	int area = 100;// 大小

	public void createmap() {
		// 創建一個區域
		mapx = new int[area];
		mapy = new int[area];
	}

	public void bornlocate() {
		// 設置出生點
		User.locx = rand();
		User.locy = rand();
	}

	int rand() {
		// 產生亂數,用於出生點
		int i;
		i = (int) ((Math.random()) * area) + 1;
		return i;
	}

	void mapcheck() {
		if (User.locx == 0 || User.locx == area) {
			System.out.println("地圖邊界!!");
			
		}
		if (User.locy == 0 || User.locy == area) {
			System.out.println("地圖邊界!!");
			
		}
		if (User.locx < 0 || User.locx > area) {
			System.out.println("超出地圖邊界!!");
			Main.live=1;
		}
		if (User.locy < 0 || User.locy > area) {
			System.out.println("超出地圖邊界!!");
			Main.live=1;
		}

	}

}
