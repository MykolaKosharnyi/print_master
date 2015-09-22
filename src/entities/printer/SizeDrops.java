package entities.printer;

public enum SizeDrops {
_1_5("1.5"), _2("2"), _4("4"), _8("8"), _12("12"), _15("15"), _20("20"), _30("30"), _35("35"), _40("40"), _80("80");

private String size;

private SizeDrops(String size) {
	this.size = size;
}

/**
 * @return the size
 */
public String getSize() {
	return size;
}

/**
 * @param size the size to set
 */
public void setSize(String size) {
	this.size = size;
}


}
