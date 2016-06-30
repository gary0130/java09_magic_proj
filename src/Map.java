
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
		User.locx=rand();
		User.locy=rand();
	}
	int rand(){
		//產生亂數
		int i;
		i=(int)(Math.random())*area+1;
		return i;
	}

}
