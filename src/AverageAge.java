public class AverageAge
{
    public String averageAgeCalculator(String[] ageData)
    {
        float avgAge;
        int n = ageData.length;
        try {
            float totalAge=0;
            for (String i : ageData)
            {
                totalAge += Float.parseFloat(i);
            }
            avgAge = totalAge/n;
            return Float.toString(avgAge);
        }
        catch (Exception e){
            return e.toString();
        }
    }
}