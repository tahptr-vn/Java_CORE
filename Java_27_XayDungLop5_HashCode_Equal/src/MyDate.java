import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int d, int m, int y) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		} else {
			this.day = 1;
		}
		if (m >= 1 && m <= 12) {
			this.month = m;
		} else {
			this.month = 1;
		}
		if (y >= 1) {
			this.year = y;
		} else {
			this.year = 1;
		}
	}

	// Do chúng ta không thể truy cập thẳng vào thuộc tính của lớp bởi vì nó private nên phải xây dựng phương thức getter và setter để lấy và gán dữ liệu cho nó
	public void setDay(int d) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		}
	}

	public int getDay() {
		return this.day;
	}

	public void setMonth(int m) {
		if (m >= 1 && m <= 12) {
			this.month = m;
		}
	}

	public int getMonth() {
		return this.month;
	}

	public void setYear(int y) {
		if (y >= 1) {
			this.year = y;
		}
	}

	public int getYear() {
		return this.year;
	}
	
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	//Tạo ra 1 chuỗi giá trị đã được băm
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	//So sánh giữa 2 đối tượng xem giá trị của 2 đối tượng đó có giống nhau hay khác nhau
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}
