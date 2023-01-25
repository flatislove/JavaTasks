/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 */
public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        DefangingAnIpAddress defangingAnIpAddress = new DefangingAnIpAddress();
        System.out.println(defangingAnIpAddress.defangIPaddr(address));
        System.out.println(defangingAnIpAddress.defangIPaddr2(address));
    }

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        while (address.contains(".")) {
            int idx = address.indexOf(".");
            String str = address.substring(0, idx);
            sb.append(str);
            sb.append("[.]");
            address = address.substring(++idx);
        }
        return sb.append(address).toString();
    }

    public String defangIPaddr2(String address) {
        return String.join("[.]", address.split("\\."));
    }
}
