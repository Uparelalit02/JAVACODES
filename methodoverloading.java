class Help(
	private String formatNumber(int value){
		return String.format("%d",value);
	}
	private String formatNumber(double value){
		return String.format("%.3f",value);
	}
	private String formatNumber(double value){
		return String.format("%.2f",Double.parseDouble(value));
	}
	public static void main(String[] args){
		Help hs new=new Help();
		System.out.println(hs.formatNumber(400));
		System.out.println(hs.formatNumber(89.9963));
		System.out.println(hs.formatNumber(550));
	}
	}
	