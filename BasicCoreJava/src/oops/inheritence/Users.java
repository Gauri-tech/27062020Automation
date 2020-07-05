package oops.inheritence;

public class Users {
	
 public static void main(String[]args) {

SmartPhone sm=new SmartPhone();
sm.calling();
sm.texting();
sm.vidoecall();

Mobile mob=new Mobile();
mob.calling();
mob.texting();
Telephone tel= new Telephone();
tel.calling();
}
}