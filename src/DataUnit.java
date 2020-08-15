
public enum DataUnit {
	BIT("b", "비트", 0.125d),
	BYTE("B", "바이트", 1.0d),
	KB("kB", "킬로바이트", pow(10, 3)),
	KIB("KiB", "키비바이트", pow(2, 10)),
	MB("MB", "메가바이트", pow(10, 6)),
	MIB("MiB", "메비바이트", pow(2, 20)),
	GB("GB", "기가바이트", pow(10, 9)),
	GIB("GiB", "기비바이트", pow(2, 30)),
	TB("TB", "테라바이트", pow(10, 12)),
	TIB("TiB", "테비바이트", pow(2, 40)),
	PB("PB", "페타바이트", pow(10, 15)),
	PIB("PiB", "페비바이트", pow(2, 50)),
	EB("EB", "엑사바이트", pow(10, 18)),
	EIB("EiB", "엑스비바이트", pow(2, 60)),
	ZB("ZB", "제타바이트", pow(10, 21)),
	ZIB("ZiB", "제비바이트", pow(2, 70)),
	YB("YB", "요타바이트", pow(10, 24)),
	YIB("YiB", "요비바이트", pow(2, 80));

	final private String symbol;
	final private String name;
	final private double value;
	
	private static double pow(double a, double b) {
		return Math.pow(a, b);
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getValue() {
		return this.value;
	}
	
	DataUnit(String symbol, String name, double value) {
		this.symbol = symbol;
		this.name = name;
		this.value = value;
	}
}
