package p1;

import java.time.LocalDate;

public interface CardValidConnectivity {
//	public boolean isCardValid(int cno,String cHoldernm,int cvv,LocalDate expDate);

	public boolean isCardValid(String cno, String cHoldernm, String cvv, String expDate);

//	public boolean isCardValid(String cno, String cHoldernm, String cvv, LocalDate expDate);

}
