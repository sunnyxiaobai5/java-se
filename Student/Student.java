public class Student
{
    private int stuNum;
    private String name;
    private double engScore;
    private double mathScore;
    private double comScore;
    private double total=0;
    //���캯��
    public Student(){}
    public Student(int stuNum,String name)
    {
        this(stuNum,name,0,0,0);
    }
    public Student(int stuNum,String name,double engScore,double mathScore,double comScore)
    {
        this.stuNum=stuNum;
        this.name=name;
        this.engScore=engScore;
        this.mathScore=mathScore;
        this.comScore=comScore;
    }
    //set--get ����
    public void setStuNum(int stuNum)
    {
        this.stuNum=stuNum;
    }
    public int getStuNum()
    {
        return stuNum;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setEngScore(double engScore)
    {
        this.engScore=engScore;
    }
    public double getEngScore()
    {
        return engScore;
    }
    public void setMathScore(double mathScore)
    {
        this.mathScore=mathScore;
    }
    public double getMathScore()
    {
        return mathScore;
    }
    public void setComScore(double comScore)
    {
        this.comScore=comScore;
    }

    public String toString()
    {
        return ("stuNum:/t"+stuNum+"name:/t"+"/n"+"engScore:/t"+engScore+"mathScore:/t"+mathScore+"comScore:/t"+comScore+"total:/t"+total);
    }
    //equals����
    public boolean equals(Object object)
    {
        if(!(object instanceof Student))
            return false;
        else
        {
            return (stuNum==object.getStuNum && name==object.getName &&
                    engScore==object.getEngScore && mathScore==object.getMathScore &&
                    comScore==object.getMathScore && total==object.getTotal);
        }
    }
    //compare �����Ƚ�ѧ���ܳɼ�
    public String compare(Student student)
    {
        if(total==student.total)
            return "����";
        else if(total>student.total)
            return "����";
        else
            return "С��";
    }
    public double sum()
    {
        return (engScore+mathScore+comScore);
    }
    public double testScore()
    {
        return (sum/3);
    }
}
