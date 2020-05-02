
public class MaxDistanceArray {

	public static int maxDistance(int[][] list) {

		int res = 0;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {

				res = Math.max(res, Math.abs(list[i][0] - list[j][list[j].length-1]));
				res = Math.max(res, Math.abs(list[i][list[i].length-1]-list[j][0]));

			}
		}
		return res;

	}

	public static void main(String[] args) {

		int[][] b = { { 1, 2, 3 }, { 4, 5 }, { 1, 2, 3 } };

		int c = maxDistance(b);
		System.out.println(c);

	}

}
