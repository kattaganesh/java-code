package p3;

public class CheckPinNo {
public boolean checkPin(int pin)
{
	return switch(pin)
			{
	case 1111:yield true;
	case 2222:yield true;
	case 3333:yield true;
	case 4444:yield true;
	default:yield false;			};
}
}
