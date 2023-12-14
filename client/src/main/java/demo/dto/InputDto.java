package demo.dto;

import java.util.Date;

/**
 * @author Olga Maciaszek-Sharma
 */
public class InputDto {

	private Date startDate;
	private Date endDate;

	public InputDto() {
	}

	public InputDto(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
