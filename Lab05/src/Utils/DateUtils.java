package Utils;

public class DateUtils
{
    int count = 0; //1: > , 2: < , 3: =
    public void compareDate(MyDate date1, MyDate date2)
    {
        if(date1.getYear() > date2.getYear())
        {
            count = 1;
        }
        if(date1.getYear() < date2.getYear())
        {
            count = 2;
        }
        if(date1.getYear() == date2.getYear())
        {
            if(date1.getMonth() > date2.getMonth())
            {
                count = 1;
            }
            if(date1.getMonth() < date2.getMonth())
            {
                count = 2;
            }
            if(date1.getMonth() == date2.getMonth())
            {
                if(date1.getDay() > date2.getDay())
                {
                    count = 1;
                }
                if(date1.getDay() < date2.getDay())
                {
                    count = 2;
                }
                if(date1.getDay() == date2.getDay())
                {
                    count = 3;
                }
            }
        }
    }
    public void printCompareDate(MyDate date1, MyDate date2)
    {
        switch(count)
        {
            case 1:
                date1.printf(date1);
                System.out.print(" is after ");
                date2.printf(date2);
                break;
            case 2:
                date1.printf(date1);
                System.out.print(" is before ");
                date2.printf(date2);
                break;
            case 3:
                date1.printf(date1);
                System.out.print(" is equal to ");
                date2.printf(date2);
                break;
            default:
                break;
        }
    }
		
    public void sortDate(MyDate[] dList)
    {
        MyDate tmp = dList[0];
        System.out.println("\nOriginal date list: ");
        for(int i = 0; i < dList.length; i ++)
        {
            System.out.print(dList[i].getDay() + "/" + dList[i].getMonth() + "/" + dList[i].getYear() + "  ");
        }
        System.out.println("\nSorting a number of dates .... ");
        System.out.println("Result: ");
        for(int i = 0; i < dList.length - 1; i++)
        {
           for(int j = i + 1; j < dList.length; j++)
           {
                compareDate(dList[i], dList[j]);
                if(count  == 1)
                {
                    tmp = dList[j];
                    dList[j] = dList[i];
                    dList[i] = tmp;
                }
           }
        }
        for(int i = 0; i < dList.length; i++)
        {
            System.out.print(dList[i].getDay() + "/" + dList[i].getMonth() + "/" + dList[i].getYear() + "  ");
        }
    }
}
