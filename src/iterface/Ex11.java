package iterface;

public class Ex11 {
	public void method(String string) {
		String[] tempArr = string.split(";");
		String tempStr = null;
		for (int i = 0; i < tempArr.length; i = i + 2) {
			tempStr = tempArr[i];
			tempArr[i] = tempArr[i + 1];
			tempArr[i + 1] = tempStr;
		}
	}
}
