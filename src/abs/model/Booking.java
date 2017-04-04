/**
 * 
 */
package abs.model;

/**
 *
 */
public class Booking {

	private Availability slot;
	private String staff;

	/**
	 * Instantiates a new booking.
	 *
	 * @param slot
	 *            the slot
	 * @param staff
	 *            the staff
	 */
	public Booking(Availability slot, String staff) {
		this.slot = slot;
		this.staff = staff;
	}

	public Availability getSlot() {
		return slot;
	}

	public String getStaff() {
		return staff;
	}

	@Override
	public String toString() {
		return "Booking [slot=" + slot + ", staff=" + staff + "]";
	}

}
