package countTime;

//import java.time.LocalDateTime;

public class CountTime {
	
	public static void main(String[] args) throws InterruptedException {
		//LocalDateTime date = LocalDateTime.now();
		long days = (604800/3600)/24;
		long hours = 604800/3600;
		long minutes = hours*60;
		long seconds = minutes*60;
		System.out.println(days);
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		
		int second_count=60;
		int minutes_count=60;
		int hours_count=24;
		while(seconds!=0) {
			System.out.println("Time : " + days + ":"+ hours_count + ":"+ minutes_count +":" + second_count);
			Thread.sleep(1000);
			seconds--;
			second_count--;
		
			if(second_count==0) {
				minutes--;
				minutes_count--;
				second_count=60;				
			}
			if(minutes_count==0) {
				hours--;
				hours_count--;
				minutes_count=60;				
			}
			if(hours_count==0) {
				days--;
				hours_count=24;
			}
		}

	}
}