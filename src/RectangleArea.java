
public class RectangleArea {

	public static int maxArea(int[] height) {

		int maxarea = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {

				maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));

			}
		}
		return maxarea;
	}

	public static void main(String[] args) {

		int[] p = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int area = maxArea(p);

		System.out.println(area);
	}

}
