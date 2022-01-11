package ProjectA10;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {/*현재위치에 정지*/}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x = " + x + ",y = " + y + "]");
	}
	void stimPack() {/*스팀팩을 사용한다*/}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x = " + x + ",y = " + y + "]");
	}
	void changeMode() {/*공격모드를 변환한다*/}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x = " + x + ",y = " + y + "]");
	}
	void load() {/*선택된 대상을 태운다*/}
	void nuload() {/*선택된 대상을 내린다*/}
}











