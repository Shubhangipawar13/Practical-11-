class Student {

    private static String[] branches = {"Computer Science", "Information Technology", "Electronics", "Electrical", "Chemical", "Instrumentation", "Mechanical", "Civil", "Textile", "Production"};
    private static String[] branchCodes = {"CS", "IT", "EC", "EL", "CH", "IN", "ME", "CE", "TT", "PR"};

    private static int firstYearCount = 1;
    private static int secondYearCount = 501;

    public static void main(String[] args) {
        String name = args[0];
        String year = args[1];
        String branch = args[2];
        String admissionType = args[3];
        String DOB = args[4];
        String bloodGroup = args[5];
        String registrationNumber = generateRegNo(year, branch, admissionType);
        System.out.println("Student Name: " + name);
        System.out.println("Year of Admission: " + year);
        System.out.println("Branch: " + branch);
        System.out.println("Admission Type: " + (admissionType.equals("1") ? "First Year" : "Second Year"));
        System.out.println("Generated Registration Number: " + registrationNumber);
        System.out.println("Blood Group:" + bloodGroup);
    }
    public static String generateRegNo(String year, String branch, String admissionType) {
        for (int i = 0; i < branches.length; i++) {
            if (branches[i].equalsIgnoreCase(branch)) {
                String branchCode = branchCodes[i];
                if (admissionType.equals("1")) {
                    return String.format("%sB%s%03d", year, branchCode, firstYearCount++);
                } else{
                    return String.format("%sB%s%03d", year, branchCode, secondYearCount++);
                }
            }
        }
        return null; 
    }
}

