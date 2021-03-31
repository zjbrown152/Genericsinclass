
public class AppList {
	public static void main(String[]args)
	{
	FirstList<SquareGeneric>squareList = new FirstList<SquareGeneric>();
FirstList<Point>pointList = new FirstList<Point>();
FirstList<String>stringList = new FirstList<String>();

SquareGeneric mySq = new SquareGeneric(4.0);
SquareGeneric Sq2 = new SquareGeneric(2.7);
squareList.addItem(mySq);
squareList.addItem(Sq2);

Point myP = new Point(3,2,6);
Point P3 = new Point(4,5,7);
pointList.addItem(P3);
pointList.addItem(myP);

String str = "Hello my name is";
String s4 = "Mike";
stringList.addItem(str);
stringList.addItem(s4);

System.out.println(mySq.toString());
System.out.println(Sq2.toString());
System.out.println(myP.toString());
System.out.println(P3.toString());

System.out.println(stringList.getItem(1));
System.out.println(pointList.getItem(1));
System.out.println(squareList.getItem(0));
}
}



