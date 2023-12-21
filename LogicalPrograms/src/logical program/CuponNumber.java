package logic;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CuponNumber {

	public class CouponNumbers {
	    public static void main(String[] args) {
	       
	        int[] couponNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	        
	        int totalRandomNumbers = generateDistinctCoupons(couponNumbers);

	        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);
	    }

	    static int generateDistinctCoupons(int[] coupons) {
	        Set<Integer> distinctCouponsSet = new HashSet<>();
	        Random random = new Random();
	        int totalRandomNumbers = 0;

	        while (distinctCouponsSet.size() < coupons.length) {
	            int randomCoupon = coupons[random.nextInt(coupons.length)];
	           
	            if (distinctCouponsSet.add(randomCoupon)) {
	                System.out.println("Generated Coupon: " + randomCoupon);
	            }
	            
	            totalRandomNumbers++;
	        }

	        return totalRandomNumbers;
	    }
	}
}

