package com.test.Add2_Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyBigNumberTest {
	  private MyBigNumber myBigNumber;

	    @BeforeEach
	    public void setUp() {
	        myBigNumber = new MyBigNumber();
	    }

	    @Test
	    public void testSum_ExampleFromRequirement() {
	        // Kiểm thử trường hợp ví dụ trong yêu cầu đề bài: "1234" + "897"
	        String result = myBigNumber.sum("1234", "897");
	        assertEquals("2131", result);
	    }

	    @Test
	    public void testSum_EqualLengthNoCarry() {
	        // Kiểm thử 2 số cùng độ dài, không nhớ
	        String result = myBigNumber.sum("123", "456");
	        assertEquals("579", result);
	    }

	    @Test
	    public void testSum_EqualLengthWithCarry() {
	        // Kiểm thử 2 số cùng độ dài, có nhớ ở các hàng
	        String result = myBigNumber.sum("555", "666");
	        assertEquals("1221", result);
	    }

	    @Test
	    public void testSum_DifferentLength() {
	        // Kiểm thử 2 số khác độ dài
	        String result = myBigNumber.sum("999", "1");
	        assertEquals("1000", result);
	    }

	    @Test
	    public void testSum_WithZero() {
	        // Kiểm thử cộng với số 0
	        assertEquals("0", myBigNumber.sum("0", "0"));
	        assertEquals("12345", myBigNumber.sum("12345", "0"));
	    }

}
