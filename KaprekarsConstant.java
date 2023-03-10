import java.util.*;

public class KaprekarsConstant {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	System.out.print("Enter first 4-digit number: ");
    	int min = console.nextInt();
    	System.out.print("Enter second 4-digit number (>= first): ");
    	int max = console.nextInt();
        int one = 0;
    	int two = 0;
    	int three = 0;
    	int four = 0;
    	int five = 0;
    	int six = 0;
    	int seven = 0;
    	int[] array = {1036, 1063, 1137, 1173, 1247, 1274, 1306, 1317, 1357, 1360, 1371, 1375, 1427, 1467, 1472, 1476, 1537, 1573, 1577, 1603, 1630, 1647, 1674, 1713, 1724, 1731, 1735, 1742, 1746, 1753, 1757, 1764, 1775, 2006, 2046, 2060, 2064, 2147, 2174, 2248, 2284, 2358, 2385, 2406, 2417, 2428, 2460, 2468, 2471, 2482, 2486, 2538, 2578, 2583, 2587, 2600, 2604, 2640, 2648, 2684, 2688, 2714, 2741, 2758, 2785, 2824, 2835, 2842, 2846, 2853, 2857, 2864, 2868, 2875, 2886, 3016, 3056, 3061, 3065, 3106, 3117, 3157, 3160, 3171, 3175, 3258, 3285, 3359, 3395, 3469, 3496, 3506, 3517, 3528, 3539, 3560, 3571, 3579, 3582, 3593, 3597, 3601, 3605, 3610, 3649, 3650, 3689, 3694, 3698, 3711, 3715, 3751, 3759, 3795, 3799, 3825, 3852, 3869, 3896, 3935, 3946, 3953, 3957, 3964, 3968, 3975, 3979, 3986, 3997, 4026, 4062, 4066, 4127, 4167, 4172, 4176, 4206, 4217, 4228, 4260, 4268, 4271, 4282, 4286, 4369, 4396, 4602, 4606, 4617, 4620, 4628, 4639, 4660, 4671, 4682, 4693, 4712, 4716, 4721, 4761, 4822, 4826, 4862, 4936, 4963, 5036, 5063, 5137, 5173, 5177, 5238, 5278, 5283, 5287, 5306, 5317, 5328, 5339, 5360, 5371, 5379, 5382, 5393, 5397, 5603, 5630, 5713, 5717, 5728, 5731, 5739, 5771, 5782, 5793, 5823, 5827, 5832, 5872, 5933, 5937, 5973, 6002, 6013, 6020, 6024, 6031, 6035, 6042, 6046, 6053, 6064, 6103, 6130, 6147, 6174, 6200, 6204, 6240, 6248, 6284, 6288, 6301, 6305, 6310, 6349, 6350, 6389, 6394, 6398, 6402, 6406, 6417, 6420, 6428, 6439, 6460, 6471, 6482, 6493, 6503, 6530, 6604, 6640, 6714, 6741, 6824, 6828, 6839, 6842, 6882, 6893, 6934, 6938, 6943, 6983, 7113, 7124, 7131, 7135, 7142, 7146, 7153, 7157, 7164, 7175, 7214, 7241, 7258, 7285, 7311, 7315, 7351, 7359, 7395, 7399, 7412, 7416, 7421, 7461, 7513, 7517, 7528, 7531, 7539, 7571, 7582, 7593, 7614, 7641, 7715, 7751, 7825, 7852, 7935, 7939, 7953, 7993, 8224, 8235, 8242, 8246, 8253, 8257, 8264, 8268, 8275, 8286, 8325, 8352, 8369, 8396, 8422, 8426, 8462, 8523, 8527, 8532, 8572, 8624, 8628, 8639, 8642, 8682, 8693, 8725, 8752, 8826, 8862, 8936, 8963, 9335, 9346, 9353, 9357, 9364, 9368, 9375, 9379, 9386, 9397, 9436, 9463, 9533, 9537, 9573, 9634, 9638, 9643, 9683, 9735, 9739, 9753, 9793, 9836, 9863, 9937, 9973};
    	for (int i = min; i <= max; i++) {
        	if ((i != 1111) && (i != 2222) && (i != 3333) && (i != 4444) && (i != 5555) && (i != 6666) && (i != 7777) && (i != 8888) && (i != 9999) && (i != 6174)) {
        		boolean yes = false;
        		for (int j = 0; j <= array.length - 1; j++) {
        			if (i == array[j]) {
        				yes = true;
        				break;
        			}
        		}
        		if ((kaprekar(i) == 1) || yes) {
        			one++; 
        		} else if (kaprekar(i) == 2) {
        			two++; 
        		} else if (kaprekar(i) == 3) {
        			three++; 
        		} else if (kaprekar(i) == 4) {
        			four++; 
        		} else if (kaprekar(i) == 5) {
        			five++; 
        		} else if (kaprekar(i) == 6) {
        			six++; 
        		} else {
        			seven++; 
        		}
        	}
        }
        System.out.println("Numbers that take 1 iteration:  " + one);
		System.out.println("Numbers that take 2 iterations: " + two);
		System.out.println("Numbers that take 3 iterations: " + three);
		System.out.println("Numbers that take 4 iterations: " + four);
    	System.out.println("Numbers that take 5 iterations: " + five);
		System.out.println("Numbers that take 6 iterations: " + six);
		System.out.println("Numbers that take 7 iterations: " + seven);
        console.close();
    }
    
    public static int descDigits(int number) {
        String temp = String.valueOf(number);
        int[] num = new int[4];
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            num[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 0; i--) {
            result += num[i];
        }
        return Integer.parseInt(result);
    }

    public static int ascDigits(int number) {
        String temp = String.valueOf(number);
        int[] num = new int[4];
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            num[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        return Integer.parseInt(result);
    }
    
    public static int kaprekar(int number) {
        int counter = 0;
        while (number != 6174) {
            number = descDigits(number) - ascDigits(number);
            counter++;
        }
        return counter;
    }
}