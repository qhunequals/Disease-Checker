public class HIV
{
    private String name;
    private int age;
    private String symptoms;
    private boolean fever;
    private boolean cough;
    private boolean pain;

    public HIV()
    {
        name = "";
        age = 0;
        symptoms = "";
        fever = false;
        cough = false;
        pain = false;
    }

    public HIV(String n, int a, String s)
    {
        name = n;
        age = a;
        symptoms = s;
        fever = false;
        cough = false;
        pain = false;
    }

    public String toString()
    {
        fever = (symptoms.indexOf("fever") > 0);
        cough = (symptoms.indexOf("cough") > 0);
        pain = (symptoms.indexOf("abdominal pain") > 0);
        if (fever && cough && !pain)
            return name + " is " + age + " years old and due to the symptoms of '" + symptoms + "', most likely has HIV."; 
        else
            return name + " is " + age + " years old and due to the symptoms of '" + symptoms + "', most likely does not have HIV."; 
    }





}