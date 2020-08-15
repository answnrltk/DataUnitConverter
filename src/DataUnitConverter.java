
public class DataUnitConverter {
	
	private DataUnit inputUnit;
	private DataUnit outputUnit;
	
	public DataUnitConverter() {
		this.inputUnit = DataUnit.BYTE;
		this.outputUnit = DataUnit.BYTE;
	}
	
	public DataUnitConverter(DataUnit inputUnit, DataUnit outputUnit) {
		this.inputUnit = inputUnit;
		this.outputUnit = outputUnit;
	}
	
	public DataUnit getInputUnit() {
		return this.inputUnit;
	}
	
	public void setInputUnit(DataUnit inputUnit) {
		this.inputUnit = inputUnit;
	}
	
	public DataUnit getOutputUnit() {
		return this.outputUnit;
	}
	
	public void setOutputUnit(DataUnit outputUnit) {
		this.outputUnit = outputUnit;
	}
	
	public double convert(double value) {
		double unit = this.inputUnit.getValue();
		double unit2 = this.outputUnit.getValue();
		
		double d = unit / unit2;
		
		return value * d;
	}
	
	public static void main(String args[]) {
		DataUnit inputUnit = DataUnit.TB;
		DataUnit outputUnit = DataUnit.GIB;
		
		DataUnitConverter dc = new DataUnitConverter();
		dc.setInputUnit(inputUnit);
		dc.setOutputUnit(outputUnit);
		
		double input = 2;
		double output = dc.convert(input);
		
		String result = String.format("%.2f %s", input, inputUnit);
		String result2 = String.format("%.2f %s", output, outputUnit);

		System.out.println(result);
		System.out.println(result2);
	}
}
