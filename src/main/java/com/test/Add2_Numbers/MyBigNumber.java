package com.test.Add2_Numbers;

import java.util.logging.Logger;

public class MyBigNumber {
	private static final Logger LOGGER = Logger.getLogger(MyBigNumber.class.getName());
    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();
        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        int carry = 0;
        int step = 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0 || j >= 0) {
                int digit1 = (i >= 0) ? stn1.charAt(i) - '0' : 0;
                int digit2 = (j >= 0) ? stn2.charAt(j) - '0' : 0;

                int sumDigit = digit1 + digit2;
                int totalWithCarry = sumDigit + carry;

                int currentDigit = totalWithCarry % 10;
                int newCarry = totalWithCarry / 10;

                StringBuilder stepLog = new StringBuilder();
                stepLog.append(String.format("Bước %d: Lấy %d cộng với %d được %d.", step, digit1, digit2, sumDigit));

                if (carry > 0) {
                    stepLog.append(String.format(" Cộng tiếp với nhớ %d được %d.", carry, totalWithCarry));
                }

                result.insert(0, currentDigit);

                stepLog.append(String.format("\nLưu %d vào kết quả được kết quả mới là \"%s\".", currentDigit, result.toString()));

                if (newCarry > 0) {
                    stepLog.append(String.format("\nGhi nhớ %d.", newCarry));
                }
                LOGGER.info(stepLog.toString());
                carry = newCarry;
                i--;
                j--;
            } else {
                result.insert(0, carry);
                LOGGER.info(String.format("Bước %d: Ghép số nhớ %d vào đầu kết quả được kết quả mới là \"%s\".", step, carry, result.toString()));
                carry = 0;
            }

            step++;
        }

        return result.toString();
    }
}

   

