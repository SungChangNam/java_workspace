package day0411Obj.a;

public class carst {

	public static void main(String[] args) {
		
		Car car1= new Car();
		car1.color= "black";
		car1.speed = 10;
		car1.SpeedUp(30);
		
		Car car2= new Car();
		car2.color= "black";
		car2.speed = 40;
		car2.SpeedUp(30);
		
		Car car3 = new Car();
		System.out.printf("자동차의 색상은 %s  ,현재 속도는 %d Km\n",car1.color ,car1.speed);
		System.out.printf("자동차의 색상은 %s  ,현재 속도는 %d Km\n",car2.color ,car2.speed);
		car2.SpeedUp(20);
		car2.col("blue");
		System.out.printf("자동차의 색상은 %s  ,현재 속도는 %d Km\n",car1.color ,car1.speed);
		System.out.printf("자동차의 색상은 %s  ,현재 속도는 %d Km\n",car2.color ,car2.speed);
	
	}

}
