public class SamsungCompany {
    public static void main(String[] args) {
        // this is samsung company`S informations savies bot

        final String companyName = "Samsung";
        final int openingYear = 1998;
        float companyWorkersSalary = 1902.64f;
        char workersSalaryCruency = '$';
        boolean theCompanyProducesHouseholdAppliances = false;
        System.out.printf("Company Name; %s \n" +
                        "Company Opening Year; %s \n" +
                        "Company Workers salary; %s \n" +
                        "Salary Currency; %s \n" +
                        "The Company Produces Household Appliances: %s\n",
                companyName, openingYear, companyWorkersSalary, workersSalaryCruency, theCompanyProducesHouseholdAppliances);


        System.out.println(companyWorkersSalary + " " + workersSalaryCruency);

        char x = '1';
        int y = 2;
        System.out.println(x + y);
    }
}