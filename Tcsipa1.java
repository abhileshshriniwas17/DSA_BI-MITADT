import java.util.*;

class TravelAgencies {
    private int regno;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regno, String agencyName,
                          String packageType, int price,
                          boolean flightFacility) {
        this.regno = regno;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegno() {
        return regno;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }


    

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}

public class Tcsipa1 {

    public static int findAgencyWithHighestPackagePrice(
            TravelAgencies[] arr) {

        int max = arr[0].getPrice();

        for (TravelAgencies agency : arr) {
            if (agency.getPrice() > max) {
                max = agency.getPrice();
            }
        }
        return max;
    }

    public static TravelAgencies agencyDetailsforGivenIdAndType(
            TravelAgencies[] arr,
            int regno,
            String packageType) {

        for (TravelAgencies agency : arr) {

            if (agency.getRegno() == regno
                    && agency.getPackageType()
                             .equalsIgnoreCase(packageType)
                    && agency.isFlightFacility()) {

                return agency;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        TravelAgencies[] arr = new TravelAgencies[n];

        for (int i = 0; i < n; i++) {

            int regno = Integer.parseInt(sc.nextLine());
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean flightFacility =
                    Boolean.parseBoolean(sc.nextLine());

            arr[i] = new TravelAgencies(
                    regno,
                    agencyName,
                    packageType,
                    price,
                    flightFacility);
        }

        int searchRegNo = Integer.parseInt(sc.nextLine());
        String searchType = sc.nextLine();

        int highestPrice =
                findAgencyWithHighestPackagePrice(arr);

        System.out.println(highestPrice);

        TravelAgencies result =
                agencyDetailsforGivenIdAndType(
                        arr,
                        searchRegNo,
                        searchType);

        if (result != null) {
            System.out.println(result.getAgencyName());
            System.out.println(result.getPrice());
        } else {
            System.out.println("No Agency Found");
        }

        sc.close();
    }
}